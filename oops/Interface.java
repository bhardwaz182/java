
//https://www.javatpoint.com/difference-between-abstract-class-and-interface
interface Shape{
	int length = 4; //public static final int shape = 4
	void draw(); // public abstract void draw()
}

interface Shape1 extends Shape{
	void area();
}

class Rectangle implements Shape1{
	public void draw() {
		System.out.println("Rectangle...");
	}
	
	public void area() {
		System.out.println("Area...");
	}
}


interface Animal{
	void eat();
}

interface Animal1{
	void sound();
	
	default void temp() {
		System.out.println("Temp");
	}
	
	static void staticMethod() {
		System.out.println("This is static method");
	}
}

// we can do multiple inheritance using interface
class Dog implements Animal,Animal1{
	public void eat() {
		System.out.println("Eating..");
	}
	public void sound() {
		System.out.println("sound...");
	}
} 

class Interface{
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.draw();
		System.out.println(Shape.length);
	
		Dog d1 = new Dog();
		d1.eat();
	}
	
}