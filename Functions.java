public class Functions {
    static int add(int a,char b,boolean bool,float f,int[] arr) {
		
		return a+b;
	}
	
	static void temp(int a) {
		System.out.println("printed in void function "+a);
	}
	
	static void temp1() {
		System.out.println("printed in void function without arguments");
	}
	
	
	static int sumOfElements(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
	/*
	 *  returnType functionName( dataType variableName, dataType VariableName){
	 *  return (returnType)
	 *  }
	 * 
	 * 
	 * 
	 * */
    public static void main(String[] args) {
        temp1(); //calling function
		temp(2);
		int[] array = {1,2,3,4,5};
		int[] array2 = {6,67,8,67,34523};
		System.out.println(sumOfElements(array));
		System.out.println(sumOfElements(array2));
    }
}
