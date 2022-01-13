public class switch {
    public static void main(String[] args) {
        int a = 1;
		switch(a) {
		case 1:
			System.out.println("number 1");
			break;
		case 2:
			System.out.println("number 2");
			break;
		case 3:
			System.out.println("number 3");
			break;
		default:
			System.out.println("default");
		}
		
		char ch = 'a';
		int number = 1;
		switch(ch) {
		case 'a': //it will whether ch is equal to a
			System.out.println("vowel");
			switch(number) {
				case 95:
					System.out.print("95");
					break;
				default:
					System.out.print("it is not 95");
			}
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.print("not vowel");
		}
		
    }
}
