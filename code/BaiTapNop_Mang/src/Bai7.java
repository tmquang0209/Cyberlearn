/*
 * Tên chương trình: in ra số có chữ số hàng trục là 5
 * Ngày tạo: 20/08/2021
 */
import java.util.Scanner;

public class Bai7 {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = taoMang(n);
		inMang(mangBanDau);
		lietKe(mangBanDau);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập số mảng: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);
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

	public static boolean kiemTraHangChuc(int number) {

		number = Math.abs(number);
		do {
			if (number/10 % 10 == 5) return true;
			number /= 10;
		} while (number >= 100);
		return false;
	}
	
	public static void lietKe(int mang[]) {
		for(int item : mang) {
			if(kiemTraHangChuc(item)) System.out.print(item + "\t");
		}
	}

}
