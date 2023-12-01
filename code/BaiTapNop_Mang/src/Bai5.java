/*
 * Tên chương trình: in ra màn hình số có chữ số đầu tiên là chẵn
 * Ngày tạo: 20/08/2021
 */
import java.util.Scanner;

public class Bai5 {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public Bai5() {
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

	public static boolean kiemTraChuSoDauTien(int number) {
		number = Math.abs(number);
		do {
			number /= 10;
		} while (number >= 10 );
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void lietKe(int mang[]) {
		int count = 0;
		for (int item : mang) {
			if (kiemTraChuSoDauTien(item)) {
				System.out.print(item + "\t");
			count++;
			}
		}
		if(count == 0) System.out.println("Không có số nào thỏa mãn chữ số đầu tiên là số chẵn");
	}

}
