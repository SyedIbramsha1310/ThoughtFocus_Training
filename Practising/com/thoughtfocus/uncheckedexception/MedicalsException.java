package com.thoughtfocus.uncheckedexception;

@SuppressWarnings("serial")
public class MedicalsException extends RuntimeException {


	@Override
	public String getMessage() {
		return "Medicines are not available right now";
	}

}
