package com.oop;

public class ConstrcutorOverloading {
	

	// Constractor overloading 
	/*
	 1. Sama seperti method, di constructor pun bisa melalukan overloading
	 2. kita bisa membuat constractor lebih dari satu, dengan syarat tipe data parameter harus berbeda
	 atau jumlah parameternya harus berbeda
	 */
	
	String nama ;
	String age ;
	String address;
	String country;
	
	ConstrcutorOverloading (int oper1, String operator, int oper2){
		
		if(operator == "+") {
			
			int addition = oper1 + oper2;
			System.out.println(addition);
			
		} else if(operator == "-") {
			
			int subtraction = oper1 - oper2 ;
			System.out.println(subtraction);
			
		} else if (operator == "*"){
			
			int multiplycation = oper1 * oper2 ;
			System.out.println(multiplycation);
			
		} else if (operator == "/") {
			
			int division = oper1 / oper2 ;
			System.out.println(division);
			
		} else if (operator == "%") {
			
			int modulus = oper1 % oper2 ;
			System.out.println(modulus);
			
		} else {
			System.out.println("Silahkan masukan operator aritmatika");
		}
		
		} // end the first ConstrcutorOverloading 
	
		
	ConstrcutorOverloading (String fullName, String umur, String location, String negara){
		nama = fullName ;
		age = umur ;
		address = location ;
		country = negara ;
	}
	
	/*
	 // memanggil constructor lain
	  1. Constructor bisa memanggil constuctor lain
	  2. hal ini sangat memudahkan kita butuh menginisialisasi data dengan berbagai kemungkinan 
	  3. cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti method
	  namun dengan kata kunci this  
	 */
	
	String nm ;
	String adds ;
	ConstrcutorOverloading(String nmData, String addsData){
		nm = nmData;
		adds = addsData;
	}
	
	ConstrcutorOverloading(String nmData){
		
		this(nmData, null);
		
	}
	
	
}
		
		
	
