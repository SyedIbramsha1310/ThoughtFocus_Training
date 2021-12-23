package com.thoughtfocus.array1;

public class Language {
	private String[] languages = new String[15];
	private int index = 0;

	public void printAll() {
		for (int index = 0; index < languages.length; index++) {
			if (languages[index] != null) {
				System.out.println(languages[index]);
			}
		}
	}

	public boolean save(String language) {
		if (index < 15) {
			languages[index] = language;
			index++;
			return true;
		} else {
			System.out.println("No more Languages to study");
			return false;
		}
	}

	public String delete(String language) {
		for (int index = 0; index < languages.length; index++) {
			if (languages[index].equals(language)) {
				languages[index] = null;
				return "Languages which learned are deleted";
			}
		}
		
		return language;
	}

	public String Update(String oldName, String newName) {
		for (int index = 0; index < languages.length; index++) {
			if(languages[index] != null) {
				if (languages[index].equals(oldName)) {
					languages[index] = newName;
					return "Data Updated";
				}
			}
		}
		return newName;
		
	}

}
