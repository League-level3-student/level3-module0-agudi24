package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strarray = {"Hello", "Hi", "How are you?"};
		//printString(strarray);
		//printReverseString(strarray);
		//printOtherString(strarray);
		printRandomString(strarray);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printString(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printReverseString(String[] str) {
		for (int i = str.length-1; i >= 0; i--){
			System.out.println(str[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printOtherString(String[] str) {
		for (int i = 0; i < str.length; i+=2) {
			System.out.println(str[i]);
		}
	}
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandomString(String[] str) {
		Random r = new Random();
		for (int i = 0; i < str.length; i++) {
			int rand = r.nextInt(str.length);
			System.out.println(str[rand]);
			
		}
	}
	
	
}
