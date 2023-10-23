package com.TipeDataJava;

public class TipeDataNumber {
	// tipe data number
	// integer number 
	// float point number
	public static void main(String[] args) {
		
		
	// integer Number 
	// min -128 // max 127 // size 1 byte // default 0
	// min -32.768 // max 32.767 // size 2 byte // default 0
	// min -2.147.483. 648 // max 2.147.487.647 // size 4 byte // default 0
		// min -9.233.372. 036.854.775.808 // max 9.233.372. 036.854.775.808 // size 8 byte // default 0
	byte theByte = 100 ; 
	short theShort = 1000 ; 
	int theInt = 10000 ; 
	long theLong = 1000000 ;
	long theLong2 = 1000000L ; 
	
	// floating point Number 
	// type data : float // Min 3.4e-038 // Max 3.4e+038 // size 4 byte // default 0.0
	// type data : double // Min 1.7e-038 // Max 2.7e+038 // size 8 byte // default 0.0
	float theFloat = 10.32F ;
	double theDouble = 12.980;
	
	// literal 
	int theDecimal = 25 ;
	int theHex = 0xA657B ;
	int theBinary = 0b10010110 ;
	
	// underscore // sejak versi java 8 dapat menambahkan undescore
	int balance = 1_000_000_000L ;
	int sum = 60_000_000 ;
	
	// konversi Tipe data konversi 
	// Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
	// Narrow Casting (Manual) : Double -> float -> long -> int -> char -> short -> byte
			
	
	// konversi otomatis dari kecil ke besar 
	byte iniByte = 10 ;
	short iniShort = iniByte ; 
	int iniInt = iniShort ;
	long iniLong = iniInt ;
	float iniFloat = iniLong ; 
	double iniDouble = iniByte ;
	
	// konversi manual dari besar ke kecil
	double yaDouble = 90.09;
	float yaFloat = (float) yaDouble ;
	long yaLong = (long) yaFloat ;
	int yaInt = (int) yaLong ;
	short yaShort = (short) yaInt ;
	
	System.out.println(iniDouble);
	}
	
}
