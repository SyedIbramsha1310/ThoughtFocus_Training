package com.thoughtfocus.bank;

public class AccountHolderDTO {
	private String name;
	private long accountNumber;
	private String iFSC;
	private long contactNumber;
	private float balance;
	private AddressDTO Address;
	
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public long getAccounNumber() {
		return accountNumber;
	}

	public AddressDTO getAddress() {
		return Address;
	}

	public void setAddress(AddressDTO address) {
		this.Address = address;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public long getContact() {
		return contactNumber;
	}

	public void setContact(long contact) {
		this.contactNumber = contact;
	}

	@Override
	public String toString() {
		return "AccountHolderDTO [accounNumber=" + accountNumber + ", name=" + name + ", iFSC=" + iFSC + ", contact="
				+ contactNumber + ", balance=" + balance + ", address=" + Address + "]";
	}

}
