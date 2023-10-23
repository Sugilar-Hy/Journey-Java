package com.conditional;

public class SwitchStatement {
	public static void main(String[] args) {
		/*
		  // switch statement
		   * kadang kita hanya butuh menggunakan kondisi sederhana di if statement, 
		   * seperti menggunakan perbandingan ==
		   *
		   * Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatanya
		   *
		   * Kondisi di Switch statement hanya unutk perbandinagn ==
		 * */
		
		String nilai = "B";
		
		switch (nilai) {
		case "A":
			System.out.println("Selamat anda lulus dengan nilai A");
		break;
		case "B":
		case "C":
			System.out.println("Selamat anda lulus dengan nilai B");
		break;
		case "D":
			System.out.println("Selamat anda lulus dengan nilai C");
		break; 
		default :
			System.out.println("Sepetinya anda salah jurusan");
		
		};
		
		
		int num = 200 ;
		switch (num) {
		case 200 :
			System.out.println("Selamat nilai anda 200");
		break; 
		default :
			System.out.println("Mohon maaf anda tidak lulus");
		};
		
		/* 
		 // switch lambda
		  * di java versi 14, 
		  *  tidak perlu menambahkan kata kunci break 
		 */
		
		int nilaiAndi = 70 ;
		
		switch (nilaiAndi) {
		case 90 -> System.out.println("Selamat anda A!");
		case 80, 85 -> System.out.println("Selamat  nilai anda B!");
		case 70 -> System.out.println("Selamat nilai anda C!");
		default -> { 
			System.out.println("Mungkin anda salah jurusan");
		}
		}
		
		/*
		 // kata kunci yield
		  di java 14  ada kata kunci baru yaitu yield, dimana kita  menggunakan kata kunci yield untuk
		  mengmbalikan nilai pada switch statement 
		  
		  ini sangat mempermudah kita untuk membuat data berdasarkan kondisi switch statemennt 
		*/
		
		// dilakukan tanpa yield akan dilakukan secara manual 
		
		String demo = "A";
		String ucapan ;
		
		switch (demo) {
		case "A" -> ucapan = "Nice, that so creapy";
		case "B" -> ucapan = "Wow, cukup baik yah kawan";
		case "C" -> ucapan = "Boleh juga";
		default -> {
			ucapan = "keep try";
			}
		}
		
		System.out.println(ucapan);
		
		// dilakukan dengan cara yield
		String person = "A";
		
		String notif = switch (person) {
		case "A" : yield "I love programing"; 
		case "B" : yield "I love java";
		case "C" : yield "I love you"; 
		default : yield "yeah";
		};
		
		System.out.println(notif);
	}
}
