
/*
 * Tên chương trình: đếm số lượng chữ số n
 * Ngày: 27/08/2021
 */
import java.util.Scanner;

public class Bai8 {

	public Bai8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập vào số nguyên dương n: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);

		System.out.println("Số " + n + " có " + demChuSo(n) + " chữ số");

	}

	public static int demChuSo(int n) {
		if (n < 10) {
			return 1;
		}
		return 1 + demChuSo(n / 10);
	}

}
