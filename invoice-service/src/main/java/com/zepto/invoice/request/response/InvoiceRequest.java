package com.zepto.invoice.request.response;

public class InvoiceRequest {

	String cutomerName;
	int gst;
	String status;
	Long categoryId;

	public String getCutomerName() {
		return cutomerName;
	}

	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Long getCategoryId() {
	    return categoryId;
	}

	public void setCategoryId(Long categoryId) {
	    this.categoryId = categoryId;
	}

}
