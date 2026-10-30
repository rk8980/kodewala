package com.zepto.invoice.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zepto.invoice.client.CategoryClient;
import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.repository.InvoiceRespository;
import com.zepto.invoice.request.response.CategoryResponse;
import com.zepto.invoice.request.response.InvoiceRequest;
import com.zepto.invoice.request.response.InvoiceResponse;

@Service
public class InvoiceService {

    private static final Logger logger =
            LogManager.getLogger(InvoiceService.class);

    @Autowired
    private InvoiceRespository invoiceRespository;

    @Autowired
    private CategoryClient categoryClient;
    
    public CategoryResponse testCategory(Long id)
    {
    	return categoryClient.getCategoryById(id);
    }

    // Create Invoice
    public InvoiceResponse createInvoice(InvoiceRequest invoiceRequest) {

        logger.info("Creating new invoice");

        // Call the category microservice using OpenFeign
        CategoryResponse categoryResponse =
                categoryClient.getCategoryById(
                        invoiceRequest.getCategoryId());

        logger.info("Category service called successfully");

        InvoiceEntity entity = new InvoiceEntity();

        entity.setCutomerName(invoiceRequest.getCutomerName());
        entity.setGst(invoiceRequest.getGst());
        entity.setStatus("PAID");
        entity.setInvId("INV1234");

        entity = invoiceRespository.save(entity);

        logger.info("Invoice saved successfully with id: {}",
                entity.getId());

        InvoiceResponse invoiceResponse = new InvoiceResponse();

        if (entity.getId() > 0) {

            invoiceResponse.setCutomerName(entity.getCutomerName());
            invoiceResponse.setGst(entity.getGst());
            invoiceResponse.setStatus(entity.getStatus());
            invoiceResponse.setInvId(entity.getInvId());
            invoiceResponse.setId(entity.getId());

            logger.debug("Invoice response created for id: {}",
                    entity.getId());
        }

        return invoiceResponse;
    }

    // Pagination
    public Page<InvoiceEntity> getInvoices(Pageable pageable) {

        logger.info("Fetching invoices - page: {}, size: {}",
                pageable.getPageNumber(),
                pageable.getPageSize());

        Page<InvoiceEntity> invoices =
                invoiceRespository.findAll(pageable);

        logger.info("Invoices fetched successfully - count: {}",
                invoices.getNumberOfElements());

        return invoices;
    }

    // Redis Cache
    @Cacheable(value = "invoices", key = "#id")
    public InvoiceResponse getInvoice(int id) {

        logger.info("Cache MISS - fetching invoice from database for id: {}",
                id);

        InvoiceEntity entity = invoiceRespository.findById(id)
                .orElseThrow(() -> {
                    logger.error("Invoice not found with id: {}", id);

                    return new RuntimeException(
                            "Invoice not found with id: " + id);
                });

        logger.info("Invoice found in database with id: {}", id);

        InvoiceResponse invoiceResponse = new InvoiceResponse();

        invoiceResponse.setId(entity.getId());
        invoiceResponse.setInvId(entity.getInvId());
        invoiceResponse.setCutomerName(entity.getCutomerName());
        invoiceResponse.setGst(entity.getGst());
        invoiceResponse.setStatus(entity.getStatus());

        logger.debug("Invoice response prepared for id: {}", id);

        return invoiceResponse;
    }
}