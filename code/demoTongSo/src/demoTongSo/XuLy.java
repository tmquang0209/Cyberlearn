package demoTongSo;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n,unit,ten,hundred,sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen n:");
		n = Integer.parseInt(scan.nextLine());
		hundred = n/100;
		ten = n%100/10;
		unit = n%10;
		sum = hundred + ten + unit;
		System.out.println(sum);
	}

}
