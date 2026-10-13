package com.zepto.invoice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.invoice.entity.InvoiceEntity;
import com.zepto.invoice.request.response.InvoiceRequest;
import com.zepto.invoice.request.response.InvoiceResponse;
import com.zepto.invoice.service.InvoiceService;

@RestController
@RequestMapping("invoice")
public class InvoiceController {

    private static final Logger logger =
            LogManager.getLogger(InvoiceController.class);

    @Autowired
    InvoiceService invoiceService;

    @PostMapping("create")
    public ResponseEntity<InvoiceResponse> createInvoice(
            @RequestBody InvoiceRequest invoiceRequest) {

        logger.info("Create invoice request received");

        InvoiceResponse response =
                invoiceService.createInvoice(invoiceRequest);

        logger.info("Invoice created successfully with id: {}",
                response.getId());

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(response);
    }

    // Pagination API
    @GetMapping
    public ResponseEntity<Page<InvoiceEntity>> getInvoices(
            @PageableDefault(page = 0, size = 5) Pageable pageable) {

        logger.info("Fetching invoices - page: {}, size: {}",
                pageable.getPageNumber(),
                pageable.getPageSize());

        Page<InvoiceEntity> invoices =
                invoiceService.getInvoices(pageable);

        logger.info("Invoices fetched successfully - total elements: {}",
                invoices.getTotalElements());

        return ResponseEntity.ok(invoices);
    }

    // Redis cached API
    @GetMapping("/{id}")
    public ResponseEntity<InvoiceResponse> getInvoice(
            @PathVariable int id) {

        logger.info("Fetching invoice with id: {}", id);

        InvoiceResponse response =
                invoiceService.getInvoice(id);

        logger.info("Invoice fetched successfully with id: {}", id);

        return ResponseEntity.ok(response);
    }
}