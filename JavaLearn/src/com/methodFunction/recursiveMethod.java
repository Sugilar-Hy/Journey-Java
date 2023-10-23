package com.methodFunction;

public class recursiveMethod {
	public static void main(String[] args) {
		/*
		  // recursive method 
		   1. recursive method adalah kemampun memanggil dirinya sendiri
		   2. kadang memang banyak problem, yang mudah diselesaikan menggunakan recursive method, seperti kasus factorial
		 * */
		
		System.out.println(factorial(10));
		
		int wadah = factorialloop(5);
		System.out.println(wadah);
		
		// recursive method 
		System.out.println(factorialRecursive(6));
		
		// try error
		loop(10000);
	}
	
	// menggunakn loop
	static int factorial(int nilai) {
		int result = 1;
		for(int i = 1 ; i <= nilai ; i++) {
			result*=i;
		}
		return result;
	}
	
	static int factorialloop(int value) {
		int hasil = 1;
		for(int j = 1 ; j <= value ; j++) {
			hasil = hasil * j;
		}
		return hasil;
	}
	
	// recursive method 
	static int factorialRecursive(int value) {
		if(value == 1) {
			return 1;
		} else {
			return value * factorialRecursive(value - 1);
		}
	}
	
	/*
	 // problem recursive 
	  1. walaupun recursive method itu sangat menarik namun kita perlu berhati hati
	  2. jika recursive terlalu dalam, maak akan kemungkinan terjadi error StackOverFlow, yaitu error dimana stack method terlalu banyak di java
	  3. kenpa problem ini bisa terjadi? karena kita memanggil method java akah menyimpan dalam stack jika method terseb dipanggil method lain
	  maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan lebih besar dan bisa menyebabkan error StackOverFlow
	 * */
	// contoh 
	
	static void loop(int nilai) {
		if (nilai == 0) {
			System.out.println("Selesai");
		} else {
			System.out.println("Loop-" + nilai);
			loop(nilai - 1);
		}
	}
}
