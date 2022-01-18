public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5]; // arr -> [0,0,0,0,0]
		int arr2[] = {1,2,3,4};
		System.out.println(arr); // this prints address of array
		// arr[index] index should be an integer we can access an element at that index 
		
		arr[0] = 1;
		arr[1] = 2;
		//arr.length gives size of an array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int[][] arr1 = new int[3][3]; //[[0,0,0],[0,0,0],[0,0,0]] new int[row][column]
		
		arr1[0][0] = 1; // arr1[row][column] = value
		// arr[i][j] [0][0] [0][1] [0][2]
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
		char[] charArr = new char[5];
    }
}
