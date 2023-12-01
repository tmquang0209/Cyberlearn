import java.util.Scanner;

public class Bai3 {

	final static int MIN = -100;
	final static int MAX = 100;

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = taoMang(n);
		inMang(a);
		soAmDauTien(a);
	}

	public static int nhapN(Scanner sc) {
		int n = 0;
		do {
			System.out.print("Nhập vào số n chẵn: ");
			n = Integer.parseInt(sc.nextLine());

		} while (n < 1 || n % 2 != 0);
		return n;
	}

	public static int[] taoMang(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return arr;
	}

	public static void inMang(int a[]) {
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
		System.out.println("\n");
	}

	public static void soAmDauTien(int a[]) {
		int index = -1;
		for (int j = 0 ; j < a.length ; j++) {
			if (a[j] < 0) {
				index = j;
				break;
			}
		}
		if (index != -1) {
			for (int i = index+1; i < a.length; i++) {
				if (a[i] == a[index]) {
					System.out.print(i + "\t");
				}
			}
		}else {
			System.out.println("Khong co so am trong mang");
		}
	}

}
