package com.latihan;

public class Petanin {
	public static void main(String[] args) {
		if(args.length > 0){
			switch(args[0]) {
			case "version":
				System.out.println("petani versi 1.0.0.0");
			break;
			case "help":
				System.out.println("Gunakan perintah ini");
				System.out.println("Perintah versian /t/t untuk mengecek version");
				System.out.println("Perintah help /t/t untuk menampikan bantuan ini");
				System.out.println("Perintah hello /t/t unutk menalpikan hello");
			break;
			case "hello":
				if(args.length > 1) {
					System.out.println("Hello" + args[0]);
				} else {
					System.out.println("Hello World");

				}
			break;
			default :
				System.out.println("Argument tidak diketahui `java petanin help` untuk meminta bantuan");
			
			
			}
		}
	}
}
