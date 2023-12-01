/*
 * Tên chương trình: In ra màn hình số có toàn chữ số lẻ
 * Ngày tạo: 20/08/2021
 */
import java.util.Scanner;

public class Bai4 {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = taoMang(n);
		inMang(mangBanDau);
		lietKeSoLe(mangBanDau);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập số mảng: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 0 || n % 2 != 0);
		return n;
	}

	public static int[] taoMang(int n) {
		int mangDau[] = new int[n];
		for (int i = 0; i < n; i++) {
			mangDau[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return mangDau;
	}

	public static void inMang(int mangDau[]) {
		for (int item : mangDau) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static boolean kiemTraSoLe(int number) {
		number = Math.abs(number);
		do {
			if (number % 2 == 0)
				return false;
			number /= 10;
		} while (number > 0);
		return true;
	}

	public static void lietKeSoLe(int mang[]) {
		for (int item : mang) {
			if (kiemTraSoLe(item))
				System.out.print(item + "\t");
		}
	}
}
