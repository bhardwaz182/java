public class Forloop {
    public static void main(String[] args) {
        int j=1;
		for(int i=0;i<=4 || j==1;i++) {
			System.out.println(i);
			break; // comes out of the loop and will not execute lines after it
		}
		
		for(int i=0;i<4;i++) {
			if(i==2 || i==0) {
				continue; // it will skip required loop
			}
			System.out.println(i);
			
		}
		char i='a';
		for(;i<'z';i++) {
			System.out.println(i);
		}
//		infinite loop
//		for(;;) {
//			System.out.println("infinite loop");
//		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
    }
}
