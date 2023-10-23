package com.oop;

public class VariablShadowing {
	
	/*
	 // Varibale shadowing
	  1. variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama
	  	variable dengan nama sayang sama discope diatasnya 
	  2. ini biasa terjadi disaat kita membuat nama parameter di method sama dengan nama field di class 
	  3. saat terjadi varible shadowing, maka secara otomatis variable di scope atasnya tidak bisa di akses  	 
	 */
	
	/*
	  // this keyword 
	   1. saat kita membuat kode didalam blok concstructor atau method didalam class, kita bisa menggunkaan 
	   kata kunci this untuk mengakses object saat ini
	   2. misal kita kadang butuh mengakses sebuah field yang namanya sama dengan parameter method,hal ini tidak bisa di lakukan 
	   jika langsung menebut nama field, kita bisa mengakses nama tersebut dengan kata kunci this 
	   3. this juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method
	   4. this bisa mengatasi masalah variable shadowing
	 */
	
	// field 
	String car ;
	String brand ;
	
	void sayCar(String car, String brand) { // parameter disini menumpuk field 
		this.car = car ; // field car tidak berubah // kata kunci this mempresentasikan obejct saat ini yang merujuk pada field
		this.brand = brand ; // field brand tidak berubah // kata kunci this mempresentasikan obejct saat ini yang merujuk pada field
	}
	
	public static void main(String[] args) {
		VariablShadowing kendaraan = new VariablShadowing();
		kendaraan.sayCar("Agya", "Suzuki");
		
		System.out.println(kendaraan.car); // terjadi null karena varible shadow
		System.out.println(kendaraan.brand); // terjadi null karena varible shadow
	}
	
}
