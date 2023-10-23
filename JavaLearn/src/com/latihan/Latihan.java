package com.latihan ;

public class Latihan {
	public static void main(String[] args) {
		byte myByte = 120 ;
		System.out.println(myByte);
		
		short myShort = 32049 ;
		System.out.println(myShort);
		
		int myInt = 2000000000 ;
		System.out.println(myInt);
		
		long myLong = 900000000000L; 
		System.out.println(myLong);
		
		float myFloat = 435.859472f ;
		System.out.println(myFloat);
		
		double myDouble = 234.2344234245234d ;
		System.out.println(myDouble);
		
		
		// tipe data boolean 
		boolean myBooleantrue = true ;
		System.out.println(myBooleantrue);
		
		boolean myBooleanFalse = false ;
		System.out.println(myBooleanFalse);
		
		char myChar = 'A';
		System.out.println(myChar); 
		 
		// constan variable java
		
		final String myString = "This is a string constan";
		System.out.println(myString);	
		
		// tipe data bukan primitif 
		Byte objectByte = 50 ;
		
		float changeByte = objectByte.floatValue();
		
		System.out.println(changeByte);
		
		// variable var 
		var autoTypeData = 90;
		System.out.println(autoTypeData);
		}
}
