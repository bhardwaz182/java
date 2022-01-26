
/*
 * we can inherit a class using "extends" key word
 * child class use all the values and methods of parent class whereas parent class can't access child class variables/methods
 * */

class Animal{ //parent,super
	int age;
	String Name;
	
	void eat() {
		System.out.println("Eating....");
	} 
}

class Dog extends Animal{ //child,sub
	
	void sound() {
		System.out.println("Barking....");
	}
	
	void insertValues(int age,String Name) {
		this.age=age;
		this.Name = Name; 
	}
}

class Dog2 extends Dog{
	
	void move() {
		System.out.println("Running");
	}
}

class Inheritance{
	public static void main(String[] args) {
		Dog2 d1 = new Dog2();
		
		
		d1.insertValues(3,"john");
		d1.eat();
		d1.sound();
		System.out.println(d1.age+" "+d1.Name);
		d1.move();
	}
}
