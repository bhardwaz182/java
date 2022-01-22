class Person{
	int age; //instance variables
	String name;
	
	//methods
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
	
	//method overloading
	//Constructor it does not has a return type it should be named as same as class name
	//constructor will set default values to the instance variable
	//if no constructor is defined default constructor will be called
	// if we defined a constructor it will search for the constructors we defined to execute
	Person(){
		
	}
	
	Person(int a, String na){
		System.out.println("This is in constructor with input params");
		age = a;
		name = na;
	}
	
}
class Constructor{
	
	public static void main(String[] args) {
		Person person1 = new Person(19,"person1");
//		person1.name = "person1";
//		person1.age = 18;
		System.out.println(person1.getAge()+" "+person1.getName());
		person1.run();
		person1.printName();
		
		
		Person person2 = new Person();
		
		
		person2.name="person2";
		person2.age = 19;
		person2.printName();
		
		
		System.out.println(person2.age+" "+person2.name);
		
	}
}
