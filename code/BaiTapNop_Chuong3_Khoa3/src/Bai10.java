
/*
 * Tên chương trình: tính tích các chữ số n
 * Ngày: 27/08/2021
 */
import java.util.Scanner;

public class Bai10 {

	public Bai10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập vào số nguyên dương n: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);
		System.out.println("Tích các chữ số của n là " + tichChuSo(n));

	}

	public static int tichChuSo(int n) {
		if (n < 10) {
			return n;
		}
		return n % 10 * tichChuSo(n / 10);
	}

}
