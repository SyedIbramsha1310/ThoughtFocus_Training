package com.thoughtfocus.hashset;

import java.util.Objects;

public class Phone {
	String brandname;
	int ram;
	int memory;
	int price;
	public Phone(String brandname, int ram, int memory, int price) {
	}
	public String getbrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [brandname=" + brandname + ", ram=" + ram + ", memory=" + memory + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brandname, ram, memory, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;	
		}
		return false;
	}

}
