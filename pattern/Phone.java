package com.pattern;

public class Phone {
	
	private String os;
	private int ram;
	public Phone(String os, int ram) {
		super();
		this.os = os;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
