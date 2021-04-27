package com.pattern;

public class Student {
	
	public static Student st1 = new Student();
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		
		return st1;
		
	}
	public void show() {
		System.out.println("i am a student");
	}
}