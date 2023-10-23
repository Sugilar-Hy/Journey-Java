package oop.latihan;

public class Motorcycle {
	// this is for a class and a constructor or method
	String merk ;
	String brand ;
	String color ;
	
	Motorcycle(String paraMerk, String paraBRand, String paraColor){
		merk = paraMerk ;
		brand = paraBRand ;
		color = paraColor ;		
	}
	
	// menggunakan kata kunci this pada constuctor dengan nama parameter yang sama 
	
	Motorcycle(String merk, String brand){
		this.merk = merk ; // this merk mengarah pada field class merk // merk mengarah pada parameter
		this.brand = brand; // this.brand mengarah pad afield class brand // brand mengarah pada parameter
	}
	
	public static void main(String[] args) {
		
		Motorcycle value = new Motorcycle("Honda street", "Honda", "red");
		System.out.println("Hallo sahabat honda kami memiliki merk terbaru dengan nama " + value.merk + " dengan brand ternama " +  value.brand + ". kami disini memiliki warna " + value.color );
		
		// use kata kunci this
		
		Motorcycle nilaiThis = new Motorcycle("Gear", "Yamaha");
		System.out.println(nilaiThis.merk + " " + nilaiThis.brand );
		
		
	}
	
}
