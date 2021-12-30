package com.thoughtfocus.exception;

@SuppressWarnings("serial")
public class AddException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Enter the correct details to add";
	}

}
