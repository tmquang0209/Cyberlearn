/*
 * Tên chương trình: dịch phải xoay vòng K lần
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai15 {

	final static int MIN = -100;
	final static int MAX = 100;

	public Bai15() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = taoMang(n);
		inMang(mangBanDau);
		mangBanDau = xoayPhai(mangBanDau, sc);
		inMang(mangBanDau);

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

	public static int[] xoayPhai(int mang[], Scanner sc) {
		int n;
		int tam ;
		do {
			System.out.print("Nhập số lần xoay: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 0);
		n %= mang.length;
		for (int i = 0; i < n; i++) {
			tam = mang[mang.length-1];
			for(int j = mang.length-1;j >= 1;j--) {
				mang[j] = mang[j-1];
			}
			mang[0] = tam;
		}
		return mang;
	}
}
