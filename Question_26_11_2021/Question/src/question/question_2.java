package question;

public class question_2 {
	 void ProductArray(int arr[], int n) {
		 if(n == 1) {
			 System.out.print(0);
			 return;
		 }
		// Khởi tạo bộ nhớ cho tất cả các mảng
		 int left[] = new int[n];
		 int right[] = new int[n];
		 int prod[] = new int[n];
		 //Phần tử bên trái
		 left[0] =1;
		 right[n-1] = 1;
		 int i ;
		 int j;
		 for(i = 1; i<n ; i++) {
			 left[i] = arr[i-1] * left[i-1];
		 }
		 
		 for(j = n-2;  j>= 0; j--) {
			 right[j] = arr[j+1] * right[j+1];
			 
		 }
		 
		 for(i = 0; i<n ; i++) {
			 prod[i] = left[i]*right[i];
			 
		 }
		 for(i = 0; i<n ; i++) {
			 System.out.print(prod[i] + " ");
		 }
		 return;
	 }
	 public static void main(String[] args) {
		 question_2 pa = new question_2();
		 int arr[] = {1,2,3,4};
		 int n = arr.length;
		 pa.ProductArray(arr, n);
		 
	 }
	 
}








