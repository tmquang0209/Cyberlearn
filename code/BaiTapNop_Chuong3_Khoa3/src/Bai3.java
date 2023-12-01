/*
 * Tên chương trình: tính tổng số có dạng 1/n
 * Ngày: 27/08/2021
 */
import java.util.Scanner;

public class Bai3 {

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n > 0: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);
		System.out.println(tinhTong(n));
	}
	
	public static float tinhTong(float n) {
		if(n == 1) {
			return 1;
		}
		return 1/n + tinhTong(n-1);
	}

}
