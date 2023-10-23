package com.methodFunction;

public class MethodVariableArgument {
	public static void main(String[] args) {
		// menggunkan array
		int[] values = {90, 90, 90, 70, 78, 45, 21};
		myArgs("Sugilar", values);
		
		// variable argument
		myUse("Sugilar", 90, 90, 90, 90, 90, 90, 90, 90, 90	);
		
	} 
	/*
	 `// method variable argumen
	 1. kadang kita butuh untuk mengirim data ke method sejumlah data yang tidak pasti 
	 2. biasanya,agar seperti ini, kita akan menggunakan data array sebagai parameter di method 
	 3. namun di java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah
	 tak tentu bisa nol atau lebih
	 4. parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter  
	 * */
	static void myArgs(String name, int[] values) { // menggunakan array
		int total = 0;
		for(int value : values) {
			total+=value;
		}
		
		int finalValue = total / values.length;
		
		if (finalValue > 75) {
			System.out.println("Selamat " + name + ", anda lulus!");
		} else {
			System.out.println("Maaf " + name + ", tidak lulus");
		}	
	}
		
		static void myUse (String peserta, int... nilai) { // dengan variable argument 
			int result = 0;
			for(int isi : nilai) { 
				result+=isi;
			}
			
			int finalNilai = result + nilai.length;
			
			if (finalNilai >=  75) {
				System.out.println("Selamat " +  peserta + ", anda lulus");
			} else {
				System.out.println("Maaf" + peserta + ", Tidak lulus");
			}
	}
		
}
