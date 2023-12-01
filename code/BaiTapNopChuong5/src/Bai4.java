/*
 * Tên chương trình: Tính tổng 
 * Ngày tạo: 14/08/2021
 */

import java.util.Scanner;

public class Bai4 {

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Nhập số mũ");
	 int n = Integer.parseInt(sc.nextLine());
	 
	 System.out.println("Nhập số x");
	 int x = Integer.parseInt(sc.nextLine());
	 
	 //System.out.println(tinhSoMu(n, x));
	 tinhTong(n, x);

	}
	
	public static int tinhSoMu(int soMu,int x) {
		int sum = 1;
		for(int i = 1; i <= soMu;i++) {
			sum *= x;
		}
		return sum;
	}
	
	public static void tinhTong(int soMu, int x) {
		int tong = 0; 
		System.out.print("Tổng: ");
		for(int i = 1; i <= soMu;i++) {
			tong += tinhSoMu(i, x);
			if(i == soMu) {
			System.out.print(tinhSoMu(i, x));
			}else {
				System.out.print(tinhSoMu(i, x) + " + ");
			}
		}
		System.out.println(" = " + tong);
	}

}
