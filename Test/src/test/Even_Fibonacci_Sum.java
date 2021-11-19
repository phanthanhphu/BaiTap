package test;

import java.util.Scanner;

public class Even_Fibonacci_Sum {
	
	public static Integer gcd(Integer p, Integer q) {
		if(q==0) {
			return p;
		}
		return gcd(q, p%q);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input p: ");
		int p = sc.nextInt();
		System.out.println("Input q: ");
		int q = sc.nextInt();
		System.out.println(gcd(q,p));
		
		
		
	}

}
