class Emp{
	int id;
	String name;
	static String manager; // static variables
	
	void show() {
		System.out.println(id+" "+name+" "+manager);
	}
	
	//static block
	//static block runs before constructor we can assign static values in static block
	static {
		manager = "doe";
		System.out.println("This is in static block");
	}
	
	Emp(){
		id = 0;
		name = "";
		System.out.println("This is in default constructor");
	}
	Emp(int i, String na){
		id = i;
		name = na;
	}
	Emp(int i, String na,String ma){
		id = i;
		name = na;
		manager = ma;
	}
	 
	// static method
	// we can't access non static variable in static methods
	static void print() {
		System.out.println("This is in staic method in Emp class");
	}
}

class Static{
	public static void main(String[] args) {
		Emp john = new Emp();
		john.show();
		Emp joe = new Emp();
		joe.show();
		
		john.manager = "changed";
		Emp.manager = "changed";
		
		john.show();
		joe.show();
		/*
		 * unlike normal methods declared in class we don't need object to call static method
		 * we can call static method/variable directly using class name
		 * */
		Emp.print();
	}
}