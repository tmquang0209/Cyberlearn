import java.util.Scanner;

public class Bai3 {

	final static int MAX = 100;
	final static int MIN = -100;

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int arr[] = taoMang(n);
		xuatMang(arr);

		int numberMax = timGT(arr, "max");
		int numberMin = timGT(arr, "min");

		System.out.println("Đoạn [a,b] cần tìm là: [" + numberMin + "," + numberMax + "]");

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

	public static int timGT(int arr[], String type) {
		int number = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (type == "max") {
				if (arr[i] > number)
					number = arr[i];
			} else {
				if (arr[i] < number)
					number = arr[i];
			}
		}
		return number;
	}

}
