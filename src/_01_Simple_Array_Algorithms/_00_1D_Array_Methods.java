package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static void main(String[] args) {
		int[] num = {3, 6, 20, 26, 23, 14, 24, 0, 99999};
		System.out.println("Sum: " + sumIntArray(num));
		System.out.println("Average: " + averageIntArray(num));
		System.out.println("Index: " + getIndex(num, 53));
		System.out.println(containsIntValue(num, 1));

		
	}

	public static int sumIntArray(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;

		
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum+=values[i];
			average = sum / values.length;
		}
				
		return average;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = array[i];
			if(sum == value) {
				return true;
			}
		}
		return false;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		return -1;
	
	}
}
