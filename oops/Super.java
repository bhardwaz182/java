
//super keyword is similar to this we can access parent class instance variables,methods and constructor
class Animal{
	int age;
	String name;
	
	void move() {
		System.out.println("moving...");
	}
	void sound(int i) {
//		this.move();
		System.out.println("Sound...");
	}
	
	Animal(){
		System.out.println("This is in Animal Constructor");
	}
}

class Dog extends Animal{
	
	void sound(int i) {
		super.move();
		System.out.println("Barking...");
	}
	
	Dog(int age,String name){
		super();
		super.age = age;
		super.name = name;
	}
}


class Super{
	public static void main(String[] args) {
		Dog d1 = new Dog(4,"John");
		System.out.println(d1.age+" "+d1.name);
	}
}