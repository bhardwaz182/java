public class Operators {
    
        public static void main(String[] args) {
            int temp = 4;
            int post = temp++; //post = 4 -> temp = 5
            int pre = ++temp; // temp = 6 -> pre = 6
            System.out.println("temp "+temp+" post:"+post+" pre: "+pre+" -temp:"+(-temp));
            
            int a=5,b=3;
            System.out.println(b%a);
            // 2 -(8421) 0010 -> 1000
            /*
             * And
             * 0 & 0 - 0   false && false - false
             * 0 & 1 - 0   true && false - false
             * 1 & 0 - 0   false && true - false
             * 1 & 1 - 1   true && true - true
             * 
             * OR
             * 0 | 0 - 0    false || false - false
             * 1 | 0 - 1    false || true - true
             * 0 | 1 - 1    true  || false - true
             * 1 | 1 - 1    true  || true - true
             * 
             * XOR
             * 0 ^ 0 - 0
             * 1 ^ 0 - 1
             * 0 ^ 1 - 1
             * 1 ^ 1 - 0
             * */
            int a1=2;
            System.out.println("left shit "+((a1<<2)+5)+ " right shift: "+ (a1>>1));
            /*
             * and
             * 0010
             * 0001
             * 0000
             * 
             * or
             * 0010
             * 0001
             * 0011
             * */
            System.out.println("bitwise and "+(2&1)+" biwise Or : "+(2|1));
            System.out.println("logical And :"+(false&&true));
            int temp1 = 5;
            temp1+=4; //temp1 = temp1+4
            temp1-=4; // temp1 = temp1-4
            temp1*=4; // temp1 = temp1 * 4 
            temp1/=4;
            temp1<<=4;
            temp1>>=4;
            
            System.out.println("Assignment "+temp1);
            
            
            a=11;  
            b=5;  
            int c=12;
            System.out.println(a<b&&a++<c);
            System.out.println(a);  
            System.out.println(a<b&a++<c);   
            System.out.println(a);
    }
}
