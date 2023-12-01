/*
 * Tên chương trình: Tìm số nguyên dương nhỏ nhất 
 * Ngày tạo: 14/08/2021
 */

import java.util.Scanner;
public class Bai2 {

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		timSoN();
	}
	
	public static void timSoN() {
		int n = 1;
		int sum = 0;
		
		do {
			n++;
			sum += n;
		}while(sum <= 10000);
		System.out.println("Số n cần tìm là: " + n);
		
	}

}
