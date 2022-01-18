import java.util.*;
public class Strings {
    public static void main() {
        // String should be defined in double quotes
        // string.charAt(index->int) gives charecter at that index
        // string.substring(index) gives string starting from index until end
        // string.substring(start,end) gives string from start index value to end-1 index "random".substring(1,4) -> gives string from 1 to 3 i.e, "and"
        Scanner sc = new Scanner(System.in);
        String st ="sunny";
		String st1= " random";
		String st2 = st+st1;
		String str = sc.next();
		char ch = sc.next().charAt(0);
		System.out.println(st.length()+" "+st.charAt(0)+" "+st.substring(3)+" "+st.substring(0,3)+" "+st2);
		
		String st = "java";
		String st1=""; //empty string
		int n = 123;
		String st2 = Integer.toString(n);//123 -> "123"
		for(int i= st2.length()-1;i>=0;i--) {
			st1=st1+st2.charAt(i); // ""+'a' =a
		}
		System.out.println(st1);
		
		String s1 = "abcdef";
		int low=1;
		int up = 3;
		String st = "";
		for(int i=low;i<up;i++) {
			st= st+ s1.charAt(i);
		}
		System.out.println(st);
    }
}
