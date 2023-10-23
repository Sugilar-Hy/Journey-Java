package com.tutorial;

public class Scope {
	public static void main(String[] args) {
		sayHello("Sugilar");
	}
	
	static void sayHello(String name){
		// global scope sayHello
		String hello = "Hello, " + name + " Selamat datang di kawasan indah kami";
		
		if(!name.isBlank()) {
			// local scope 
			String hi = "Hi " + name + " aku akan membantumu";
			System.out.println(hi);
		}
		
		System.out.println(hello);
	}
	
}
