package com.TipeDataJava ;

public class TipeDataArray {
	public static void main(String[] args) {
		/*
		 // tipe data array (larik)
		  * array merupakan sekumpulan data dengan tipe yang sama 
		  * Jumlah data array di java tidak bisa berubah setelah pertama kali dibuat 
		 * */
		
		String[] arrayString ; // String[] mengdeklarasikan ini merupakan string array
		arrayString = new String[10]; // String[10] adalah tempat menginitialize berapa banyak array
		arrayString[0] = "Hilma fatmawati" ;
		arrayString[1] = "Muhamad ardi sugilar";
		arrayString[2] = "Rahardian";
		
		System.out.println(arrayString[2]);
		
		int[] myInt ;
		myInt = new int[5];
		myInt[0] = 100;
		myInt[1] = 50 ;
		myInt[2] = 60;
		myInt[3] = 70 ;
		myInt[4] = 90; 
		
		System.out.println(myInt[4]);
		
		char[] myChar = new char[2]; // inisialisasi
		myChar[0] = 'A';
		myChar[1] = 'B';
		
		System.out.println(myChar);

		// array initialize 
		
		int[] arrayInt = new int[] {
			90, 90, 86, 43, 45, 65, 12, 43
		};
		
		System.out.println(arrayInt[3]);
		
		arrayInt[3] = 90 ;
		
		System.out.println("Hasil dari merubah array index  dari 43 ke " + arrayInt[3]);
		
		float[] arrayFloat = { 
			35.43f, 54.3f, 45.45f, 53.543f, 43.54f, 54.45f
		};
		
		
		arrayFloat[2] = 50f; // merubah index array ke 2 
		
		System.out.println(arrayFloat[2]); // mengakses index array
		System.out.println(arrayFloat.length); // mendapatkan panjang array
		
		/*
		 // operasi array 
		  * array[index] ; -> mengambil data array
		  * array[index] = value ; -> merubah data array 
		  * arrar.length -> mengambil panjang array
		  * di java tidak ada penghapusan data array
		  * yang mungkin dalah memasukan data kosong
		  * 
		  * jika primitif bisa menggunakan 0 
		  * jika bukan primitf menggunakan null 
		  */
		
		
		// array di dalam array 
		String[][] member = new String[][] {
			{"Sugilar", "Hilma", "ikin", "zaka"},
			{"Gina", "Ica", "Wulan", "ende"},
		};
		
		System.out.println(member[1][2]);
		
		// mengambil int pada array multiline
		int[][] count = new int[][] {
			{10, 20, 40, 40, 50 , 60, 70, 80, 90, 100},
			{1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000},
		};
		
		int pickCount = count[0][2];
		int pickTwo = count[1][3];
		
		System.out.println(pickCount);
		System.out.println(pickTwo);
		
		
		// membuat array multiline 
		String[][] elektronik = new String[][] {
			{"Asus phonk", "Lenovo jir", "Pongo hoo", "advan we"},
			{"Jphone", "Iphone", "vivo", "Realme", "Xiomi"},
			{"Intel", "Snapdragon", "pop", "Mediatek"},
		};
		
		elektronik [2][1] = "Armagedon"; // merubah array ke 2 pada index ke 1
		
		String pickPhone = elektronik [0][1]; // [0] mengambil posisi array [1] mengambil index arraynya
		String pickHandphone = elektronik [1][2];
		String pickProcesor = elektronik [2][1];
		
		System.out.println("Saya punya laptop dengan merk : " + pickPhone + " Saya punya hp dengan mek : " + pickHandphone + " dengan prosesor " + pickProcesor);
		
		
		int[][] nilaiUjian = new int[][] {
			{10, 9, 2, 4, 9, 5, 3, 2, 4, 6}, // kelas A
			{3, 9, 7, 7, 8, 9, 9, 9, 8, 9}, // kelas B 
			{10, 10, 10, 10, 8, 4, 8, 7, 9, 9} // kelas C
		};
		
		int kelasA = nilaiUjian[0][4]; // mengambil nilai murid ke lima
		int kelasB = nilaiUjian[1][7]; // mengambil nilai murid ke enam 
		int kelasC = nilaiUjian[2][2]; // mengambil nilai murif ke tiga
		
		
		if(kelasA > 5|| kelasB < 10 || kelasC < 8) {
			System.out.println("selamat anda lulus");
		} else {
			System.out.println("silahkan dicoba kembali");
		}
		
		
		// declare manual array
		
		int[] num ;
		num = new int[2] ;
		num[0] = 20 ;
		num[1] = 100 ;
		
		System.out.println(num[0]);
		
	}
}