

import com.thoughtfocus.bank.AccountHolderDTO;
import com.thoughtfocus.bank.AddressDTO;
import com.thoughtfocus.dao.AccountHolderDAO;

public class Tester {
	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();
		
		AccountHolderDTO dto = new AccountHolderDTO();
		AddressDTO address = new AddressDTO();
		
		dto.setAccountNumber(876482432);
		dto.setName("Shah");
		dto.setContact(86245876);
		dto.setiFSC("ION987");
		dto.setBalance(3000);
		
		address.setBuilding("1/540");
		address.setArea("Amma Illam");
		address.setLandmark("Manapparai");
		address.setCity("Trichy");
		address.setState("Tamil Nadu");
		address.setCountry("India");
		address.setPincode(653462);
		
		dto.setAddress(address);
		
		String isSaved = dao.save(dto);
		System.out.println("Updating the details");
		
		
		AccountHolderDTO dto1 = new AccountHolderDTO();
		AddressDTO address1 = new AddressDTO();
		
		dto1.setAccountNumber(68246263);
		dto1.setName("Raju");
		dto1.setiFSC("ASX7567");
		dto1.setContact(837676939);
		dto1.setBalance(7000);
		
		address1.setBuilding("1/470");
		address1.setArea("Vaiyampatti");
		address1.setLandmark("Vaiyampatti");
		address1.setCity("Tanjore");
		address1.setState("Tamil Nadu");
		address1.setCountry("India");
		address1.setPincode(682362);
		
		dto1.setAddress(address1);
		
		String IsSaved1 = dao.save(dto1);
		System.out.println(IsSaved1);
		
		AccountHolderDTO getByName = dao.getByName("Shah");
		System.out.println(getByName);
		
		String deleteStatus = dao.deleteByAccountNumber(876482432); 
		System.out.println(deleteStatus);
		
		String updateStatus = dao.updateContactNumber(837676939, 875456768);
		System.out.println(updateStatus);
		
		AccountHolderDTO updatePincodeStatus = dao.updatepincodeByArea("Amma Illam", 621315);
		System.out.println(updatePincodeStatus);
		
		float balance = dao.getCurrentBalance(334550); 
		System.out.println(balance);
	
		float depositStatus = dao.deposit(3000, 334360);
		System.out.println(depositStatus);
		
		float debitedAmount = dao.withdraw(2600, 334360);
		System.out.println(debitedAmount);
		
		dao.printall();
	}

}
