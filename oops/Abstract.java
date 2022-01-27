abstract class Animal{
	abstract void eat();//method signature
	
	Animal(){
		
	}
	void run() {
		System.out.println("Running");
	}
}

// abstract method should be implemented in inherited class
class Dog extends Animal{
	void eat() {
		System.out.println("Eating...");
	}
}

class Abstract{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat(); 
	}
}