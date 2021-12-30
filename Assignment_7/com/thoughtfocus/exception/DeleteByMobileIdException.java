package com.thoughtfocus.exception;

@SuppressWarnings("serial")
public class DeleteByMobileIdException extends RuntimeException{
	@Override
	public String getMessage() {
		return "Enter the correct mobile id";
	}

}
