package test;

import java.util.Scanner;

public class Prime_Number {
	public static Boolean isPrime(Integer n) {
	    boolean isPrime = true;
	    for(int i = n-1 ;i > 1; i--) {
	    	if(n%i == 0) {
	    		isPrime = false;
	    		break;
	    	}
	    }
	    
		return isPrime;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input n:");
		Integer n = sc.nextInt();
		System.out.println(isPrime(n));
		
		
	}

}
