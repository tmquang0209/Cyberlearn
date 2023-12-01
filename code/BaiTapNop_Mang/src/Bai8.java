/*
 * Tên chương trình: in ra màn hình số lớn hơn giá trị tuyệt đối của số liền kề
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai8 {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public Bai8() {
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

	public static void lietKe(int mang[]) {
		int sum = 0;
		for (int i = 0; i < mang.length - 1; i++) {
			if (mang[i] > Math.abs(mang[i + 1]))
				sum += mang[i];
		}
		System.out.println("Tong cac so lon hon gia tri tuyet doi cua so lien ke la: " + sum);
	}
}
