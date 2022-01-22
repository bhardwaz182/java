class Person{
	int age;
	String name;
}

class ClassDeclartion{
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "person1";
		person1.age = 18;
		
		Person person2 = new Person();
		person2.name="person2";
		person2.age = 19;
		
		System.out.println(person1.age+" "+person1.name);
		System.out.println(person2.age+" "+person2.name);
	}
}
