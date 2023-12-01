import java.util.Scanner;

public class Bai2 {

	final static int MAX = 100;
	final static int MIN = -100;

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int arr[] = taoMang(n);
		xuatMang(arr);

		System.out.print("Nhap X=");
		int x = Integer.parseInt(sc.nextLine());
		int so = timSo(arr, x);
		System.out.println("So xa x=" + x + " nhat la: " + so);
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

	public static int[] tinhKC(int arr[], int x) {
		int khoangCach[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			khoangCach[i] = Math.abs(arr[i] - x);
		}
		return khoangCach;
	}

	public static int timSo(int arr[], int x) {
		int khoangCach[] = tinhKC(arr, x);
		int max = khoangCach[0];
		int index = 0;
		for (int i = 1; i < khoangCach.length; i++) {
			if (khoangCach[i] > max) {
				max = khoangCach[i];
				 index = i;
			}
		}
		return arr[index];
	}

}
