package com.operasi ;

public class OperasiMatematika {
	public static void main(String[] args) {
		/*
		  // operasi matematika 
		   *  + -> pertambahan 
		   *  - -> subtaction 
		   *  * -> multiplication
		   *  / -> division
		   *  % -> modulus (Sisa bagi)
		   
		   
		   * note
		   * selama tipe datanya number maka semua operasi matematika bisa digunakan 
		   
		 * */
		
		int a = 100 ;
		int b = 10 ;
		
		// addition 
		int addition = a + b ;
		System.out.println(addition);
		
		// subtaction 
		int subtaction = a - b ;
		System.out.println(subtaction);
		
		// multiplycation 
		int multiplication = a * b ;
		System.out.println(multiplication);
		
		// division 
		int divition = a / b ;
		System.out.println(divition);
		
		// modulus 
		int modulus = a % b ;
		System.out.println(modulus);
		
		/*
		 // augmented assigment 
		  += -> tambah sama dengan
		  -=  -> kurang sama dengan 
		  *= -> kali sama dengan
		  /= -> bagi sama dengan 
		  %=  -> hasil bagi sama dengan
		 * */
		int c = 10 ;
		
		System.out.println(c += 20); // the result is 30 
		
		System.out.println(c -= 10); // the result is 20
		
		System.out.println(c *= 10); // the result is 200
		
		System.out.println(c /= 10); // the result is 20
		
		System.out.println(c %= 3); // the result is 2
		

		/*
		 // unary operator 
		  * ++ ->  a = a + 1
		  * -- -> a = a - 1 
		  * - -> negatif 
		  * + -> positif 
		  * ! -> boolean kebalikan 
		 * */
		
		int d = 10 ;
		int e = -100 ;
		
		d++ ;
		System.out.println(d);
		
		d--;
		System.out.println(d);
		
		
	}
}

