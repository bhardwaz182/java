

/*
 * private default protected public
 * 
 * 
 * Access Modifier	within class	within package	outside package by subclass only	outside package
	Private				Y				N				N									N
	Default				Y				Y				N									N
	Protected			Y				Y				Y									N
	Public				Y				Y				Y									Y
	
	
 * 
 * while overloading a method Access Modifier range should not be reduced it can be increased
 * */

class Emp{
	private int id;
	private String name;
	
//	int age; it can be accessed only within the file 
	
//	protected int age; // It can be accessed within the file and  
	
	Emp(){}
	Emp(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return id;
	}
	
	protected void msg() {
		System.out.println("Message");
	}
}

class Person extends Emp{
	public void msg() {
		System.out.println("Message in person");
	}
}

class AccessModifier
{
	public static void main(String[] args) {
//		Emp e1 = new Emp(6,"john");
//		e1.setId(4);
//		System.out.println(e1.getId());
		Person p1 = new Person();
		p1.msg();
	}
}