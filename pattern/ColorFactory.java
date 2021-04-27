package com.pattern;

public class ColorFactory {
	public  Color getInstance(String str) {
		if(str.equals("Sun")) {
			return new Red();
		}
		if (str.equals("Sky")) {
			return new Blue();
		}
		else {
			return null;
		}
		
	}
}
