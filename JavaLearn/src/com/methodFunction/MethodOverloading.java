package com.methodFunction;

public class MethodOverloading {
	public static void main(String[] args) {
		/*
		 	// method overloading
		 	 * method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
		 	 * namun ada ketentuanya, yaitu data parameter di method tersebut berbeda beda
		 	 * entah jumlah atau tipe data parameternya
		 	 * jika ada yang sama maka program java akan error
		*/
		
		sayMe();
		
		sayMe("ardi");
		
		sayMe("ardi", "sugilar");
	}
	
	static void sayMe() {
		System.out.println("Hallo");
	}
	
	static void sayMe(String firstName) {
		System.out.println("Hallo, " + firstName);
	}
	
	static void sayMe(String firstName, String lastName) {
		System.out.println("hallo, " + firstName + " " + lastName);
	}
}
