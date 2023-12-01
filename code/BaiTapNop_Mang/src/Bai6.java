/*
 * Tên chương trình: tính tổng số dương trong mảng
 * Ngày tạo: 20/08/2021
 */
import java.util.Scanner;

public class Bai6 {

	final static int MIN = -1000;
	final static int MAX = 1000;

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = taoMang(n);
		inMang(mangBanDau);
		tongSoDuong(mangBanDau);
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
	
	public static void tongSoDuong(int mang[]) {
		int sum = 0;
		for(int item : mang) {
			if(item > 0) sum += item;
		}
		System.out.println("Tổng các số dương trong mảng là: " + sum);
	}

}
