//when we inherit parent default constructor will be executed
class Animal{
	final int age;
	Animal(){
		System.out.println("This is in animal constructor");
		age = 4;
	}
}

class Dog extends Animal{
	Dog(){
		System.out.println("This is in dog constructor");
	}
}

class Final{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1.age);
		
	}
}