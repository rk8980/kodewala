package com.kodewala.oopspractice.override;

public class GenericResponse {
	public GenericResponse(String message) {
		super();
		
	}
}

class UPIResponse extends GenericResponse
{
	public UPIResponse(String message, String code) {
		super(message);
		
	}
}