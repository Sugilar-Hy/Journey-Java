package com.conditional;

public class TernaryOperator {
	public static void main(String[] args) {
		/*
		  // ternary operator 
		   * ternary operator adalah operator sederana dari if statement 
		   * ternary operator terdiri dari kondisi yang di evaluasi, jika menghasil
		   * true nilai pertama akan di ambil, jika nilainya false maka nilai kedua yang diambil 
		 */
		
		int nilai = 75 ;
		String notif = nilai >= 75 ? "Selamat anda lolos" : "ashhh biasa aja";
		
		System.out.print(notif);
	}
}
