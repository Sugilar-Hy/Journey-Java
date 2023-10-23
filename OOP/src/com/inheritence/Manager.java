package com.inheritence;

/*
	// inheritance 
	 1. inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain 
	 2. Dalam artian, kita bsia membuat class parent dan class child 
	 3. class child, hanya boleh memiliki satu Class parent. namun class parent boleh memiliki bnayak class child 
	 4. saat sebuah class di turunkan, maka semua field dan method yang ada di class parent, secara otomatis akan 
	 dimiliki olehcl class child 
	 5. untuk melakukan pewarisan, di class child kita harus menggunakan kata kunci extents lalu diikuti dengan nama class parentnya
*/

class Manager { // Parent class
	
	String name; 
	
	void sayHello(String name) {
		System.out.println("Hello " + name + ", my name is Manager " + this.name  );
	}
}

class vicePresident extends Manager{ // child class
	Manager demo = new Manager();
}

