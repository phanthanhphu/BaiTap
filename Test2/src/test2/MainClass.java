package test2;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		circle c = new circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input BK:" );
		float bankinh = sc.nextFloat();
		c.SetbanKinh(bankinh);
		float chuvi = c.tinhChuVi();
		float dientich = c.tinhDienTich();
		System.out.println(dientich);
		System.out.println(chuvi);
		
	}

}
