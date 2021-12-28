package com.thoughtfocus.uncheckedexception;

public class UncheckedExceptionTest {
	public static void main(String[] args) {
		
		Medicals medicals = new Medicals();
		
		try {
		medicals.searchItem("Adderall");	
		}
		catch (MedicalsException me) {
			System.out.println(me.getMessage());
		}
	}

}
