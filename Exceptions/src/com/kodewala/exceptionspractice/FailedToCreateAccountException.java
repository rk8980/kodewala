package com.kodewala.exceptionspractice;

public class FailedToCreateAccountException extends Throwable {
	public FailedToCreateAccountException(String message)
	{
		super(message);
	}
}
