package com.thoughtfocus.exception;

@SuppressWarnings("serial")
public class UpdateBySerialNumberExcxeption extends RuntimeException {
	@Override
	public String getMessage() {
		return "Re enter the serial number";
	}

}
