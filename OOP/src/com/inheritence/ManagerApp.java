package com.inheritence;


// mengakses inheretence / pewarisan 
public class ManagerApp {
	public static void main(String[] args) {
		
		viceManager vm = new viceManager();
		vm.name = "Ardi sugilar";
		vm.sayHello("Joko");
		
		Manager mnr = new Manager();
		mnr.name = "Hilma fatmawati";
		mnr.sayHello("athia fahriaya");
		
		VisePresident vp = new VisePresident();
		vp.name = "Kiansantang";
		vp.sayHello("Satria");
		
	}

}
