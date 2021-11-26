package question;

public class moderate {


	 void ProductArray(int arr[], int n) {
		 if(n == 1) {
			 System.out.print(0);
			 return;
		 }
		
		 
		 //array wil contain product of all elements to the leftArr 
		 int leftArr[] = new int[n];
		 //array wil contain product of all elements to the rightArr
		 int rightArr[] = new int[n];
		 //array wil contain product of all elements
		 int productArr[] = new int[n];
		 
		 //Initiate first element of leftArr 
		 leftArr[0] =1;
		 //Initiate first element of rightArr
		 rightArr[n-1] = 1;
		 int i ;
		 int j;
		 
		 //Determine value of rest elements leftArr[i]
		 for(i = 1; i<n ; i++) {
			 leftArr[i] = arr[i-1] * leftArr[i-1];
		 }
		//Determine value of rest elements rightArr[j]
		 for(j = n-2;  j>= 0; j--) {
			 rightArr[j] = arr[j+1] * rightArr[j+1];
			 
		 }
		 //find except self as leftArr[i] * right[j]
		 for(i = 0; i<n ; i++) {
			 productArr[i] = leftArr[i]*rightArr[i];
			 
		 }
		 //print result 
		 for(i = 0; i<n ; i++) {
			 System.out.print(productArr[i] + " ");
		 }
		 return;
	 }
	 
	 
	 public static void main(String[] args) {
		 moderate pa = new moderate();
		 int arr[] = {1,2,3,4};
		 int n = arr.length;
		 //access array and n input elements 
		 pa.ProductArray(arr, n);
		 
	 }
	 
}








