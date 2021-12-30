package com.thoughtfocus.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Testing {
	public static void main(String[] args) {
		
		
		HashSet<Phone> phones = new HashSet<>();
		
		Phone redmi = new Phone("redmi", 4, 64, 20000);
		Phone samsung = new Phone("samsung", 3, 32, 17000);
		Phone vivo = new Phone("vivo", 4, 64, 24000);
		Phone huawei = new Phone("huwaei", 5, 128, 32000);
		Phone oneplus = new Phone("oneplus", 6, 256, 48000);
		Phone oppo = new Phone("oppo", 3, 32, 15000);
		
		phones.add(redmi);
		phones.add(samsung);
		phones.add(vivo);
		phones.add(huawei);
		phones.add(oneplus);
		phones.add(oppo);
		
		Iterator<Phone> iterator = phones.iterator();
		while(iterator.hasNext()) {
			Phone phones1 = iterator.next();
			String brandname = null;
			String ram = null;
			String memory = null;
			String price = null;
			System.out.println("Phone [brandname=" + brandname + ", ram=" + ram + ", memory=" + memory + ", price=" + price + "]");
		}
	}

}
