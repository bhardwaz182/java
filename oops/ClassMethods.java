class Person{
	int age;
	String name;
	
	void run() {
		System.out.println(name+" is running");
	}
	
	void printName() {
		System.out.println(name);
	}
	
	void insertValues(int a, String na) {
		if(a<0) {
			age = 0;
			System.out.println("Age cannot be negative");
		}else {			
			age = a;
		}
		name = na;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
}
class ClassMethods{
	
	public static void main(String[] args) {
		Person person1 = new Person();
//		person1.name = "person1";
//		person1.age = 18;
		person1.insertValues(18, "person1");
		person1.run();
		person1.printName();
		
		
		Person person2 = new Person();
		person2.name="person2";
		person2.age = 19;
		person2.printName();
		
		System.out.println(person1.getAge()+" "+person1.getName());
		System.out.println(person2.age+" "+person2.name);
		
	}
}