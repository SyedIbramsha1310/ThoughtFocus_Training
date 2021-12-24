package com.thoughtfocus.array2;

public class EmployeeDetailsDAO {
	private EmployeeDetails[] details = new EmployeeDetails[11];
	private int i = 0;

	public void printAll() {
		for (int i = 0; i < details.length; i++) {
			if (details[i] != null) {
				System.out.println(details[i]);
			}

		}
	}

	public void save(EmployeeDetails details) {
		if (details != null) {
			this.details[i] = details;
			i++;
		}
	}

	public String deletebyName(String name) {
		for (int i = 0; i < details.length; i++) {
			if (name.equals(details[i].getName())) {
				details[i] = null;
				return "Employee Details Deleted: " + name;

			}
		}
		return "Employee Details Not Deleted";
	}

	public String deletebyEmployeeId(int id) {
		for (int i = 0; i < details.length; i++) {
			if (details != null) {
				if (id == details[i].getId()) {
					details[i] = null;
					return "Employee Details Deleted: " + id;
				}
			}
		}
		return "Employee Details Not Deleted";
	}



	public String updateName(String oldName, String newName) {
		for (int i = 0; i < details.length; i++) {
			if (details != null) {
				if (details[i].getName().equals(oldName)) {
					details[i].setName(newName);
					return "Employee Details Updated";
				}
			}

		}
		return "Employee Details Not Updated";

	}

}
