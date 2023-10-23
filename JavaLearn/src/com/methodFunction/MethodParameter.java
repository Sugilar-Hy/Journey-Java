package com.methodFunction;

public class MethodParameter {
	public static void main(String[] args) {
		myFunction("Mumahad", "ardi", "Sugilar");
		myFunction("Mumahad", "boedi", "nursanto");
	}
	
	/*
	 	// Method Parameter
	 	 * kita bisa mengirimkan informasi ke method yang kita panggil 
	 	 * untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument pada method 
	 	 * cara membuat parameter sama seperti membuat variable 
	 	 * parameter d itempatkan di dalam () di deklarasi method 
	 	 * Parameter diperbolehkan lebih dari satu, jika parameter lebih dari satu menggunakan tanda ,
	 * */
	static void myFunction(String firstName, String middleName, String lastName) {
		System.out.println("Hallo" + " " + firstName + " " + middleName + " " + lastName);
	}
}
