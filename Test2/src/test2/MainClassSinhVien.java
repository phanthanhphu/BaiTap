package test2;

import java.util.Scanner;

public class MainClassSinhVien {
	
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Input name: ");
		String name1 = sc.nextLine();
		
		System.out.print("Input age: ");
		int age1 = sc.nextInt();
		sv.Setname(name1);
		sv.Setage(age1);

		System.out.println("Name: " + sv.name);
		System.out.println("Age: " +sv.age);
		
		
	}
	
}
