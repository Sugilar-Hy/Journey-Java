package com.latihan;

public class LatihanVariable {
	public static void main(String[] args) {
		// membuat variable
		String name = "Sugilar";
		
		int num = 200;
		
		final int number = 100;
		
		// membuat tipe data number
		byte myByte = 127;
		short myshort = 32000;
		int myInt = 2000000000;
		long myLong = 9000000000000000000L;
		float myFloat = 90.95f;
		double myDouble = 9087.874923874932478d;
		
		//konversi otomati
		int kon = myByte ;
		
		// konversi manual
		int konversiFloat = (int) myFloat;
		
		// tipe data array
		String[] nama;
		nama = new String[]{
			"Tomat", "Cabe", "Singkong", "salada"
		};
		
		// akses array
		String pick = nama[0];
		System.out.println(pick);
		
		// merubah data array 
		String change = nama[2] = "Kelapa";
		System.out.println(change);
		
		// array diadalam array 
		int[][] nilai = new int[][] {
			{9,9,9,9,9,9,9,9,9,8,9},
			{5, 67, 67, 6, 34, 43, 6, 5, 6, 5},
			{67,89,7,67,45,63,4,6,78,879,7,6}
		};
		
		
		System.out.println(nilai[0][1]);
		
		
	
	}
}
