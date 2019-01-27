package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] str = new String[5];

		//2. print the third element in the array
		System.out.println(str[3]);

		//3. set the third element to a different value
		str[3] = "Hello";

		//4. print the third element again
		System.out.println(str[3]);
		
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < str.length; i++) {
			str[i] = "hey there";
			System.out.println(str[i]);
		}
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers
		int[] num = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		int smallNum = 50;
		int largeNum = 0;
		for (int i = 0; i < num.length; i++) {
			Random r = new Random();
			int randNum = r.nextInt(50);
			num[i] = randNum;
			System.out.println(num[i]);
			if(num[i] < smallNum) {
				smallNum = num[i];
			}
			if(num[i] > largeNum) {
				largeNum = num[i];
			}
		}
		System.out.println("Small Num: " + smallNum);
		System.out.println("Large Num: " + largeNum);
		System.out.println("Last number in array: " + num[49]);
		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
