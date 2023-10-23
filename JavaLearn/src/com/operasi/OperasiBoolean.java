package com.operasi;

public class OperasiBoolean {
	public static void main(String[] args) {
		/*
		 	// Operasi Boolean 
		 	 && -> and -> harus keduanya true jika ingin mendapatkan true 
		 	 || -> or  -> harus ada salah satu hasilnya true 
		 	 ! 	-> not/ kebalikan -> membalikan kondisi
		 */
		
		var absen = 78 ;
		var nilaiAkhir = 80;
		
		boolean lulusAbsen = absen >= 75 ;
		boolean lulusNilaiAkhir = nilaiAkhir >= 75 ;
		
		boolean lulus = lulusAbsen && lulusNilaiAkhir ;
		
		System.out.println(lulus);
	}
}
