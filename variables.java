public class variables {
    //local,static and instance varaible

    static int add(int a, int b) {
		int a1=0; //local variable it can't accessed outside function
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(2,3)+" "+a1);  
}
}
