
/*
 * Tên chương trình: tìm đoạn [-x,x] chứa tất cả giá trị trong mảng
 * Ngày: 26/08/2021
 */
import java.util.Scanner;

public class Bai6 {

	final static char MAX = 100;
	final static int MIN = -100;

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int arr[] = taoMang(n);
		xuatMang(arr);

		int numberMax = timGTMax(arr);

		System.out.println("Đoạn [-x,x] cần tìm là: [" + -numberMax + "," + numberMax + "]");

	}

	public static int nhapN(Scanner sc) {
		int n;
		do {
			System.out.print("Nhap gia tri > 1: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return arr;
	}

	public static void xuatMang(int mang[]) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + "\t");
		}
		System.out.println("\n");
	}

	public static int timGTMax(int arr[]) {
		int number = Math.abs(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (Math.abs(arr[i]) > number)
				number = Math.abs(arr[i]);
		}
		return number;
	}

}
