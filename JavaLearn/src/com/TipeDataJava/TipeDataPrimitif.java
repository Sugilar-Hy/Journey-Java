package com.TipeDataJava;

public class TipeDataPrimitif {
	public static void main(String[] args) {
		/*
		  // tipe data non primitif 
		   * Tipe data primitif adalah tipe dat bawaan di dalam bahasa programan,
		   * tipe data primitif tidak bisa dirubah lagi 
		   * tipe data number, boolean, char, adalah tipe data primitif. selalu memiliki nilai default value
		   * tipe data string bukan termasuk tipe data primitif, tipe data non primtif tidak memiliki default value, dan bisa bernilai null
		   * tipe data non primitif bisa memiliki method/function (yang akan dibahas nanti)
		   * di java, semua tipe data primitif memiliki perprensi tipe datanya 
			
		 */
		
		/*
		  // Reprensi tipe data primitif
		   -> menggunakan huruf kapital di depan 
		   byte -> Byte 
		   short -> Short
		   int -> Integer
		   long -> Long 
		   float -> Float
		   double -> Doubel 
		   
		   char -> Character
		   boolean -> Boolean 
		   
		   // kiri adalah primif 
		   // kanan adalah non primif
		   
		   Cara pendeklarasianya sama seperti tipe data primitif
		   
		   default valuenya null
		 */
		
		Integer myInt = 100 ;
		Long myLong = 100000L ;
		
		Byte myByte = null ;
		
		System.out.println(myByte);
		
		myByte = 100 ;
		System.out.println(myByte);
		
		
		// konversi tipe data primitf, tipe data bukan primitif
		int age = 20 ;
		
		Integer objectAge = age ;
		
		int intAgain = objectAge ;
		
		// konversinya yang tidak serupa menggunakan method 
		short shortAge = objectAge.shortValue(); // shortValue() merukan method 
		byte byteAge = objectAge.byteValue(); // byteValue() merukan method
		
	}
}