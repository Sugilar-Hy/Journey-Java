public class ToDoListApp{
	
	// model apk
	public static String[] data = new String[10];
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	// main function 
	public static void main(String[] args) {
//		testAddTodo();
//		testRemoveToDo();
//		testInfo();	
//		viewShowToDo();
//		testViewRemove();
		viewShowToDo();
	}
	
	/*
	 * businnus logic
	 */ 
	
	// menampilkan to do list
	public static void showToDo() {
		
		System.out.println("===== To Do List =====");
		for(int i = 0 ; i < data.length ; i++) {
			String todo = data[i];
			int no = i + 1;
			
			if(todo != null){
				System.out.println(no + ". " + todo);
			}
		}
	}
	
	// test show to do list 
	public static void testShowToDo() {
		data[0] = "Belajar Java dasar";
		data[1] = "Study casus java dasar : aplikasi to do list";
		data[2] = "Belajar OOP Java";
		showToDo();
	}
	
	// menambahkan to do list
	public static void addToDo(String todo) {
		// cek  apakah data penuh 
		boolean isFull = true ;
		for(int i = 0 ; i < data.length ; i++) {
			if(data[i] == null) {
				isFull = false ; // datanya masih ada yang kosong
				break;
			}
		}
		
		if(isFull) {
			String[] temp = data;
			data = new String[data.length * 2];
			
			for(int i = 0 ; i < temp.length ; i++) {
				data[i] = temp[i];
			}
		}
		
		// tamabahakan ke posisi data arraynya null
		for(int i = 0 ; i < data.length ; i++) {		
			if(data[i] == null ) {
				data[i] = todo ;
				break;
			}
		}
	}
	
	
	//  test menambahakan to do list
	public static void testAddTodo() {
		for(int i = 0 ; i < 30 ; i++) {
			addToDo("To Do list ke " + i);
		}
		showToDo();
	}
	
	// mengahapus to do list
	public static boolean removeToDo(Integer number) {
		if((number - 1) >= data.length ) {
			return false ;
		} else if(data[number - 1] == null){
			return false;
		} else {
			for(int i = (number - 1) ; i < data.length ; i++ ) {
				if(i == (data.length - 1)) {
					data[i] = null;
				} else {
					data[i] = data[i + 1];
				}
			}
			return true;
		}
	}
	
	// test remove to do list 
	public static void testRemoveToDo() {
		for(int i = 0 ; i < 30 ; i++){
			addToDo("To Do List ke : " + i);
		}
		
		boolean result = removeToDo(5);
		System.out.println(result);
		
		showToDo();
	}
	
	
	public static String input(String info) {
		System.out.print(info + " : ");
		
		String masukan = scanner.nextLine();
		return masukan ;
	}
	
	public static void testInfo() {
		String nama = input("nama");
		System.out.println(nama);
	}
	
	/*
	 * menentukan view/ screen 
	 */
	
	// menampilkan screen list to do list
	public static void viewShowToDo() {
		while(true) {
			showToDo();
			
			System.out.println("===== Pilihan Menu =====");
			System.out.println("1 \t -> menambahkan to do list");
			System.out.println("2 \t -> menghapus to do list");
			System.out.println("x \t -> keluar");
			
			
			String input = input ("Pilih Menu");
			
			if(input.equals("1")) {
				viewAddToDo();
			} else if (input.equals("2")) {
				viewRmToDo();
			} else if (input.equals("x")) {
				break;
			} else {
				System.out.println("Perintal tidak dimengerti");
			}
		}
		
	}
	
	public static void testViewShowToDo() {
		addToDo("satu");
		addToDo("Dua");
		addToDo("Tiga");
		
		viewShowToDo();
	}
	
	// menampilkan screen add to do list
	public static void viewAddToDo() {
		System.out.println("Menambahkan to do list");
		
		String todo = input("x jika batal");
		
		if(todo.equals("x")) {
			// batal
		} else {
			addToDo(todo);
		}
		
	}
	
	public static void testViewAddToDo() {
		viewAddToDo();
		
		showToDo();
		
	}
	
	// menampilkan screen remove to do list
	public static void viewRmToDo() {
		System.out.println("===== Menghapus to do list =====");
		
		String number = input("Masukan angka(x untuk kembali)");
		
		if(number.equals("x")) {
			// untuk batal
		} else {
			removeToDo(Integer.valueOf(number));
		}
		
	}
	
	public static void testViewRemove() {
		addToDo("Satu");
		addToDo("Dua");
		addToDo("Tiga");
		
		showToDo();
		
		viewRmToDo();
		
		showToDo();
		
	}
}