/*
 * Tên chương trình: In ra màn hình số nguyên tố trong mảng
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;
public class Bai9 {
	final static int MIN = -1000;
	final static int MAX = 1000;

	public Bai9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = taoMang(n);
		inMang(mangBanDau);
		inSoNguyenTo(mangBanDau);

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

	public static boolean kiemTraSoNguyenTo(int number) {
		if (number < 2)
			return false;
		int canBacHai = (int) Math.sqrt(number);
		for (int i = 2; i <= canBacHai; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void inSoNguyenTo(int mang[]) {
		int count = 0;
		for (int item : mang) {
			if (kiemTraSoNguyenTo(item)) {
				System.out.print(item + "\t");
				count++;
			}
		}
		if (count == 0)
			System.out.println("\n Mảng không có số nguyên tố");
	}

}
