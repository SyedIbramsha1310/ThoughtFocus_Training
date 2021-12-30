package com.thoughtfocus.assessment;

@SuppressWarnings("serial")
public class DeleteByMobileIdException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Unable to delete...... provide valid details";
	}

}
