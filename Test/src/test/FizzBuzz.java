package test;

import java.util.Scanner;

public class FizzBuzz {
	public static String fizz(Integer i) {
		 String result = "";
		 
		 if(i%3 == 0) {
			 result +="Fizz";
			 
		 }
		 if(i%5 == 0) {
			 result += "Buzz";
		 }
		 
		 if(result.equals("")) {
			 result = i.toString();
		 }
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input i: ");
		int i = sc.nextInt();
		System.out.println(fizz(i));
		
		
	}

}
