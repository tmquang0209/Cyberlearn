/*
 * Tên chương trình: tính tổng số lớn hơn x do người dùng nhập vào
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai10 {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public Bai10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = taoMang(n);
		inMang(mangBanDau);
		tinhTongLonHonX(mangBanDau, sc);

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

	public static void tinhTongLonHonX(int mang[], Scanner sc) {
		System.out.print("x = ");
		int x = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for (int pt : mang) {
			if (pt > x)
				sum += pt;
		}
		System.out.println("Tổng các số lớn hơn x là: " + sum);
	}

}
