package com.conditional;

public class IfStatement {
	public static void main(String[] args) {
		/*
		  // if statement 
		   * id statement adalah salah satu kunci untuk percabangan 
		   * percabangan artinya kita bisa mengeksekusikode tententu ketika suatu kondisi terpenuhi 
		   * hampir di semua bahasa perograman mendukung if statement
		 */
		int nilai = 75 ;
		int absen = 28 ;
		
		if(nilai >= 75 && absen >= 25) {
			System.out.println("Selamat anda lulus");
			
		/*
		 // else statement 
		  * block if akan dieksekusi jika nilanya true 
		  * block else akan melakukan seksekusi jika expresinya bernilai false
		  * hal ini dilakukan dengan megnguanakn blok else
		 */
			
			int nilaiA = 90 ;
			int absenA = 30 ;
			
			if (nilaiA >= 95 && absenA >= 30) { // expressionya false makan akan dieksekusi elsenya
				System.out.println("Selamat anda lulus");
			} else {
				System.out.println("Silahkan coba lagi di tahun depan");
			}
			
			/*
			 // else if statement 
			  * kadang di dalam if, kita butuh beberapa kondisi 
			  * kasus seperti ini di java menggunakan else if expression
			  * else if dijava bisa lebih dari satu 
			 * */
			
			int nilaiB = 70 ;
			int absenB = 28 ;
			
			if (nilaiB >= 90 && absenB >= 25) {
				System.out.println("Selamay ranking anda ke satu ");
			} else if (nilaiB >= 80 &&  absenB >= 20) {
				System.out.println("Selamat ranking anda ke dua");
			} else if (nilaiB >= 70 && absenB >= 15) {
				System.out.println("Selamat ranking anda ketiga");
			} else {
				System.out.println("I love programing");
			}
			
		}
	}
}
