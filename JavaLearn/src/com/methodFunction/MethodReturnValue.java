package com.methodFunction;

public class MethodReturnValue {
	public static void main(String[] args) {
		int a = 100;
		int b = 500;
		int c = sum(a, b);
		
		System.out.println("hasil dari sum : " + c);
		System.out.println("Hasil dari kalkulator : " 
		+ calculator(20, "*", 2));
	}
	
	/*
	 // Method return value 
	  * secara default, method itu tidak mengahsilkan value apapun , namun jika kita ingin, kita membuat sebuah method
	  * mengembalikan nilai 
	  * agar method menghasilakan sebuah value, kita megnubah kata kunci void dengan tipe data yang di hasilkan 
	  * dan didalam blok method, untuk menghasilkan nilai tersebut kita harus menggunakan kata kunci return 
	  * lalu diikuti dengan data yang sesuai dengan tipe data yang dideklarasikan di method
	  * dijava kita bisa menghasilkan 1 data disebuah method, tidak bisa lebih dari satu
	 * */
	
	static int sum(int value1, int value2) {
		int result = value1 + value2;
		return result;
	}
	
	static int calculator(int operand1, String operasi, int operand2){
		switch(operasi) {
		case "+":
			return operand1 + operand2;
		case "-":
			return operand1 - operand2;
		case "*":
			return operand1 * operand2;
		case "/": 
			return operand1 / operand2;
		case "%":
			return operand1 % operand2;
		default :
			return 0;
		}
	}
	
	
}
