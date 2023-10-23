package com.oop;

public class PersonApp {
	public static void main(String[] args) {
		/*  
			// object 
		   1. object adalah intansiasi dari sebuah class
		   2. untuk membuat object kita bisa menggunakan kata kunci new, diikuti dengan nama Class dan kurung()
		*/
		
		// person andri 
		var andri = new Person();
		
		andri.name = "andri wicaksono";
		andri.address = "Mahkota agung";
		
		var andriCar = new Car();
		andriCar.brand = "Honda";
		andriCar.color = "Black";
		
		System.out.println(andri.name);
		System.out.println(andri.address);
		System.out.println(andriCar.brand);
		System.out.println(andriCar.color);
		
		System.out.println("==========");
		
		// person jesika
		Person jesika = new Person();
		jesika.name = "Jesika nurwaidah";
		jesika.address = "Cityzen";
		
		Car jesikaCar = new Car();
		jesikaCar.brand = "Volvo";
		jesikaCar.color = "Red";
		
		System.out.println(jesika.name);
		System.out.println(jesika.address);
		System.out.println(jesika.country);
		System.out.println(jesikaCar.brand);
		System.out.println(jesikaCar.color);
		
		
		System.out.println("==========");
		
		Person maulana = new Person();
		maulana.name = "Maulana diningrat";
		maulana.address = "Cianjur";
		
		System.out.println(maulana.name);
		System.out.println(maulana.address);
		
		
		System.out.println("==========");
		
		
		Person jefri;
		jefri = new Person();
		jefri.name = "Jefri skandal";
		jefri.address = "Bandung";
		
		System.out.println(jefri.name);
		System.out.println(jefri.address);
		
		System.out.println("===== Method =====");
		MethodClass orang = new MethodClass();
		orang.name = "Sugilar";
		orang.age = 19;
		
		orang.notif("Angga maulana");
		
		System.out.println("===== Method =====");
		MethodClass orang2 = new MethodClass();
		orang2.name = "Syantika";
		orang2.waring(10);
		
		System.out.println("===== Constructor =====");
		Constructor lisensi = new Constructor("Alya", "Honda");
		
		
		System.out.println(lisensi.merk);
		System.out.println(lisensi.brand);
		
		System.out.println("===== Constructor Overloading =====");
		
		ConstrcutorOverloading calculator = new ConstrcutorOverloading (12, "*", 10); // constructor overloading 
		
		ConstrcutorOverloading personData = new ConstrcutorOverloading ("Mumamad ardi sugilar", "19 tahun", "Cianjur, Jawa barat", "indonesia");
		System.out.println(personData.nama);
		System.out.println(personData.age);
		System.out.println(personData.address);
		System.out.println(personData.country);
		
		
		
		
		
	}
}
