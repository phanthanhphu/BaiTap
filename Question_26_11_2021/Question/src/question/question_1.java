package question;


import java.util.Scanner;

public class question_1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Import into an array number of the array: ");
			n = sc.nextInt();
		}while(n < 0);
		
		int array[] = new int[n];
		for(int i = 0; i< n ; i++) {
			System.out.print("Import number "+ i +": ");
			array[i] = sc.nextInt();
			
		}
		
		
		
			System.out.print("Result: " + findElement_Xor(array, n));
	
	
		
		}
	
	public static int findElement_Xor(int array[], int n) {
		int res = array[0];
		for(int i = 1; i< n; i++) {
		 res = res ^ array[i];	
		}
		return res;
		
	}
	
}
