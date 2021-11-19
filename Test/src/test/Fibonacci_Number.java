package test;

import java.util.Scanner;

public class Fibonacci_Number {
	public static Integer fibonacci(Integer n) {
		if(n == 1) {
			return 1;
			
		}
		if(n == 0) {
			return 0;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input n: ");
		Integer n = sc.nextInt();
		System.out.println(fibonacci(n));
		
		
	}

}
