package com.thoughtfocus.array;

public class Month {
	private String []months = new String[12];
	private int index = 0;
	
	public void printAll() {
		for (int index = 0; index < months.length; index++) {
			if (months[index]!=null) {
				System.out.println(months[index]);
			}
		}
	}
	
	public boolean save(String month) {
		if (index < 12) {
			months[index]=month;
			index++;
			return true;
		}else {
			System.out.println("No Space");
			return false;
		}
	}
	
	public String delete (String month) {
		for (int index = 0; index < months.length; index++) {
			if(months[index].equals(month)) {
				months[index] = null;
				return "Month Deleted";
			}
		}
		return month;
	}

}
