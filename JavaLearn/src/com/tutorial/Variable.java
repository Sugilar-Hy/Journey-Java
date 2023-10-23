package com.tutorial;

public class Variable {
	public static void main(String[] args) {
		// variable
		// variable adlah tempat unutk menyimpan data
		// java adalah bahasa yang static type, sehingga sebuah variable hanya bisa digunankan unutk tipe data yang sama, 
		// tidak bisa berubah seperti bahasa programan sepeti javascript dan juga PHP 
		// cara membuat variable di java menggunakan nama tipe lalu diikuti dengan nama variablenya
		// sebuah variable tidak boleh mengandung whitespace (spasi, enter, tab), dan tidak boleh seluruhnya number 
		
		
		String name ;
		name = "Sugilar";
		
		int age = 19 ;
		String addres = "Indonesia";
		
		System.out.println(name + " " + age + " " + addres);
		
		// kata kunci var 
		// sejak java 10, java mendukung pembuatan variable dengan kata kunci var 
		// sehingga kita tidak perlu menyebutkan tipe datanya
		// namun, perlu diingat, saat kita menggunkan kata kunci var kita harus menginisiasi balue/nilai dari variable tersebut secara langsung
		
//		var demo ; // akan terjadi error
//		demo = "Muhamad ardi" ; 
		
		var umur = 90 ;
		var merk = "Honda";
		
		System.out.println(merk);
		System.out.print(umur);
		
		// kata kunci final(konstan) 
		// secara default, variable di java bisa diubah ubah nilai
		// jika kita ingin membuat sebuah variable yang data tidak boleh diubah 
		// kita bisa menggunkan kata kunci final 
		// istilah seperti ini, banyak juga yang menyebutnya konstan 
		
		final String nm = "Sugilar";
		
		System.out.println(nm);
	}	
}