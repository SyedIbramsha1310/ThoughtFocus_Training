package com.thoughtfocus.array2;

public class DetailsTester {
	public static void main(String[] args) {
		EmployeeDetails details = new EmployeeDetails();
		details.setName("Syed");
		details.setId(33);
		details.setMobileNo(983832867);

		EmployeeDetails details1 = new EmployeeDetails();
		details1.setName("Shah");
		details1.setId(13);
		details1.setMobileNo(978643216);

		EmployeeDetails details2 = new EmployeeDetails();
		details2.setName("Sana");
		details2.setId(18);
		details2.setMobileNo(967854312);

		EmployeeDetailsDAO dao = new EmployeeDetailsDAO();
		
		dao.save(details);
		dao.save(details1);
		dao.save(details2);

		dao.printAll();
		
		dao.updateName("Syed", "Ibramsha");
		dao.deletebyName("Shah");
		
		dao.printAll();
		
		dao.deletebyEmployeeId(33);
		dao.printAll();
		
		
		
	}

}
