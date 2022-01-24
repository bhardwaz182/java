class Calc{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	void add(double a,double b,double c) {
		System.out.println(a+b+c);
	}
}

class MethodOverloading{
	public static void main(String[] args) {
		Calc c1 = new Calc();
		c1.add(1,2);
		c1.add(1,2,3);
		c1.add(3.1, 4.1,5.3);
	}
}