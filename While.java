public class While {
    public static void main(String[] args) {
        int i=0;
		while(i<0) {
			System.out.println(i);
			i++; //it will become infinite loop if we remove this line
		}


		
		//it will execute atleast once even if the condition is false 
		do {
			System.out.println("it is in do while loop");
			i++;
		}while(i<=0);
    }
}
