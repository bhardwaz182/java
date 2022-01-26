class Emp{
	int id;
	String name;
	
	void print() {
		System.out.println("This is in print");
	}
	
	void setValues(int id,String name) {
		this.id=id;
		this.name=name;
		this.print();
		
	}
	Emp(){
		this(3);// this will invoke constructor with input
		System.out.println("This is in default constructor");
	}
	
	Emp(int a){
//		this(); // This will execute default constructor
		System.out.println("this is in constructor with variables");
	}
//	Emp(int a ,int b){
//		this(3);
//		System.out.println("This is in construcpt")
//	}
}

class This{
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setValues(3, "john");
		System.out.println(e1.id+" "+e1.name);
	}
}