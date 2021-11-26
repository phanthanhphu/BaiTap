package question;
import java.util.Scanner;
public class Easy {

	public static void main(String[] args) {
		int n= inputnumber();
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[n];
//		import array in order i
		for(int i = 0; i< n ; i++) {
			System.out.print("Import number "+ i +": ");
			array[i] = sc.nextInt();
		}
//		print the function findSingle
			System.out.print("Result: " + findSingle(array, n));
	
		}
	
	public static int inputnumber() {
		int n = 1;
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		while(!check) {
//			number of array elements
			System.out.print("Input n: ");
			try {
				n = sc.nextInt();
//				check if n is <= 0, error message
				if(n <= 0) {
					System.out.println("you must enter the number > 0"); 
                    sc.nextLine();
//                    true condition
				}else {
					check = true;
				}
//				exception handling
			}catch(Exception e) {
				System.out.println("you must enter the number > 0 "); 
                sc.nextLine();
			}
		}
		return n;
	}
	
	
	public static int findSingle(int array[], int n) {
//		use XOR elements in array
//		if repeated twice will become 0 and remaining will the element
//		result which is appearing only once
		int res = array[0];
		for(int i = 1; i< n; i++) {
		 res = res ^ array[i];	
		}
		return res;
		
	}
	
}
