package com.pattern;

public class Dell implements LaptopService{

	@Override
	public void showInfor(String str) {
		System.out.println( str +  " Dell is the best");
		
	}

}
