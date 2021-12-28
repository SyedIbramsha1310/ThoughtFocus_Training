package com.thoughtfocus.dao;

import java.util.ArrayList;

import com.thoughtfocus.bank.AccountHolderDTO;

public class AccountHolderDAO {
	private ArrayList<AccountHolderDTO> dtos = new ArrayList<AccountHolderDTO>();

	public String save(AccountHolderDTO dto) {
		boolean isSaved = dtos.add(dto);
		if (isSaved) {
			return "DATA SAVED";
		} else {
			return "DATA NOT SAVED";
		}

	}

	public AccountHolderDTO getByName(String Name) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getName().equals(Name)) {
				return dtos.get(index);
			}
		}

		return null;

	}
	
	public String updateContactNumber(long oldContactNumber, long newContactNumber) {
		for(int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getContact() == oldContactNumber) {
				dtos.get(index).setContact(newContactNumber);
				return "PhoneNumber is Updated";
			}
		}
		return "PhoneNumber is Not Updated";
	}
	
	public String deleteByAccountNumber(long accountNumber) {
		for(int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAccounNumber() == accountNumber) {
				dtos.remove(index);
				return "AccountNumber details Deleted";
			}
		}
		return "AccountNumber is not Deleted";
	}
	
	public AccountHolderDTO updatepincodeByArea(String area, int pincode) {
		for(int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAddress().getArea().equals(area)) {
				dtos.get(index).getAddress().setPincode(pincode);
				return dtos.get(index);
			}
		}
		return null;
	}
	
	public void printall() {
		for(int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAccounNumber() != 0) {
				System.out.println(dtos.get(index));
			}
		}
	}
	
	public float getCurrentBalance(long accountNumber) {
		for(int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAccounNumber() == accountNumber) {
				return dtos.get(index).getBalance();
			}
		}
		return 0;
	}
	
	public float deposit(float amount, long accountNumber) {
		for(int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAccounNumber() == accountNumber) {
				float oldBalance = dtos.get(index).getBalance();
				float newBalance = oldBalance + amount;
				dtos.get(index).setBalance(newBalance);
				return newBalance;
			}
		}
		return 0;
	}
	
	public float withdraw(float amount, long accountNumber) {
		for(int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAccounNumber() == accountNumber) {
				float currentBalance = dtos.get(index).getBalance();
				dtos.get(index).setBalance(currentBalance);
				return currentBalance;
			}
		}
		return 0;
	}

}
