

class Animal{
	void sound(int i) {
		System.out.println("Sound...");
	}
}

class Dog extends Animal{
	void sound(int i) {
		
		System.out.println("Barking...");
	}
}

class Cat extends Animal{
	void sound(int i) {
		System.out.println("meow...");
	}
}

class MethodOverriding{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.sound(4);
		
		Cat c1 = new Cat();
		c1.sound(4);
	}
}
