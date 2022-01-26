/*
 * Hierarchical inheritance
 * 
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

class Cat extends Animal{
	
	Cat(int age,String Name){
		this.age = age;
		this.Name = Name;
	}
	
	void sound() {
		System.out.println("meow...");
	}
}

class HierarchicalInheritance{
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.insertValues(3,"john");
		d1.eat();
		d1.sound();
		System.out.println(d1.age+" "+d1.Name);
		
		Cat c1 = new Cat(4,"Cat");
		c1.eat();
		c1.sound();
		System.out.println(c1.age+" "+c1.Name);
	}
}