/*
 * Tên chương trình: tính số lẻ < n và n> 0
 * Ngày tạo: 14/08/2021
 */

import java.util.Scanner;

public class Bai3 {

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		tinhTongSoLe();

	}

	public static void tinhTongSoLe() {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.print("Nhập vào số n > 0:");
			n = Integer.parseInt(scan.nextLine());
		}while(n < 0);
		
		int tong = 0;
		for(int i = 1; i < n ; i+=2) {
			tong += i;
		}
		
		System.out.println("Tổng các số lẻ < " + n + " là " + tong);
		
	}

}
