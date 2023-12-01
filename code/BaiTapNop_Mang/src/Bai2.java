/*
 * Tên chương trình: In ra màn hình các số gần nhau nhất
 * Ngày tạo: 20/08/2021
 */
import java.util.Scanner;

public class Bai2 {

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = nhapMang(n, sc);
		inMang(a);
		inCapGiaTriGanNhauNhat(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập số mảng: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2);
		return n;
	}

	public static int[] nhapMang(int n, Scanner sc) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = Integer.parseInt(sc.nextLine());
		}
		return a;
	}

	public static void inMang(int a[]) {
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static void inCapGiaTriGanNhauNhat(int a[]) {
		int sumMin = Math.abs(a[0] - a[1]);
		int i, j;
		for (i = 0, j = 1; i < a.length && j < a.length - 1; i++, j++) {
			if (Math.abs(a[i] - a[j]) < sumMin) {
				sumMin = Math.abs(a[i] - a[j]);
			}
		}
		System.out.println("CÁC CẶP CÓ GIÁ TRỊ GẦN NHAU NHẤT");
		for (i = 0, j = 1; i < a.length && j < a.length - 1; i++, j++) {
			if (Math.abs(a[i] - a[j]) == sumMin) {
				System.out.println(a[i] + "\t" + a[j]);
			}
		}

	}
}
