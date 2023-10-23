package com.inheritence;

public class viceManager extends Manager { // class child from class parent Manager 
	// method overriding 
	/*
	 	// Method overriding 
	 	 1. mehtod overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di dalam parent class
	 	 2. Saat kita mulakukan proses overiding tersebut, secara otomatis kita membuat object dari class child, metho yang ada di class parent 
	 	 tidak bisa di akses lagi
	 	 *
	 */
	
	// super keyword
	/*
	 1. kadang kita ingn=in mengakses method yang terdapat didalam class parent yang sudah kita overriding didalam class
	 2. untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
	 3. sederhananya, super digunakan untuk mengakses class parent 
	 4. tidak hanya di method, field milik parent class pun bisa di akses menggunakan kata kunci super
	 */
	
	void sayHello(String name) { // method overridng
		System.out.println("Hello " + name + ", my name is vm " + this.name  );
		
	}
	
	
}
