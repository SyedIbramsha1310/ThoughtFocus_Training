package com.thoughtfocus.set;

import com.thoughtfocus.exception.AddException;
import com.thoughtfocus.exception.DeleteByMobileIdException;
import com.thoughtfocus.exception.UpdateBySerialNumberExcxeption;

public class Test {
	public static void main(String[] args) {
		MobileDAO dao = new MobileDAO();

		MobileDTO Iphone = new MobileDTO();
		MobileDTO samsung = new MobileDTO();

		Iphone.setMobileId(123456789l);
		Iphone.setBrandName("Iphone");
		Iphone.setMemory(32);
		Iphone.setModelName("iphone 6");
		Iphone.setNoOfCamera((byte) 2);
		Iphone.setPrice(25000);
		Iphone.setSerialNumber(987654321l);

		samsung.setMobileId(123458789l);
		samsung.setBrandName("samsung");
		samsung.setMemory(32);
		samsung.setModelName("galaxy");
		samsung.setNoOfCamera((byte) 4);
		samsung.setPrice(20000);
		samsung.setSerialNumber(987698321l);

		dao.getAll();

		try {
			dao.add(Iphone); 
			dao.add(samsung); // adding mobile2
		} catch (AddException e) {
			System.out.println(e.getMessage());
		}

		dao.getAll(); 
		

		dao.getAllByBrandName("Iphone"); 

		

		try {
			MobileDTO status = dao.deleteByMobileID(123458789); 
			System.err.println(status + "deleted");
		} catch (DeleteByMobileIdException e) {
			System.out.println(e.getMessage());
		}

		

		try {
			MobileDTO status = dao.updateBySerialNumber(987654321, 987654999l); 
			System.out.println(status);
		} catch (UpdateBySerialNumberExcxeption e) {
			System.out.println(e.getMessage());
		}
		

		dao.getAll();
	}

}
