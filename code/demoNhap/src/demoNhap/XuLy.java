package demoNhap;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap ten cua ban");
		String name = scan.nextLine();
		System.out.print("Tuoi cua ban");
		String age = scan.nextLine();
		//conver string to number
		int tuoi = Integer.parseInt(age);
		float tuoi_1 = Float.parseFloat(age);
		double tuoi_2 = Double.parseDouble(age);
		
		//in ra thong tin
		System.out.println("Ten cua ban la:\t" + name);
		System.out.println("Tuoi cua ban la (int):\t" + tuoi);
		System.out.println("Tuoi cua ban la (float):\t" + tuoi_1);
		System.out.println("Tuoi cua ban la (double):\t" + tuoi_2);
	}

}
