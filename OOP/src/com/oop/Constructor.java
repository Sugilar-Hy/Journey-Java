package com.oop;

public class Constructor {
	/*
	  // Constractor 
	   1. saat kita membuat sebuah object,maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ()
	   2. di dalam class java, kita bisa membuat constractor 
	   3. constractor adalah method yang akan di panggil saat pertama kali dibuat 
	   4. mirip seperti method kita bisa memasukan parameter kedalam constructor 
	   5. nama constrcutor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
	 */
	
	String merk ;
	String brand; 
	
	Constructor(String paraMerk, String paraBrand){
		merk = paraMerk ;
		brand = paraBrand ;
	}
}
