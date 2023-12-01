import java.util.Scanner;

public class Bai8_9x {
	final static int MIN = -100;
	final static int MAX = 100;

	public Bai8_9x() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = taoMang(n);
		inMang(a);
		a = xoaPhanTuTaiIndex(a, sc);
		inMang(a);

	}

	public static int nhapN(Scanner scan) {
		System.out.print("Nhập số mảng: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void inMang(int a[]) {
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static int[] xoaPhanTuTaiIndex(int a[], Scanner sc) {
		int index;
		do {
			System.out.print("Nhập vị trí cần xóa từ 0-" + (a.length - 1) + ": ");
			index = Integer.parseInt(sc.nextLine());
		} while (index < 0 || index >= a.length);

		int b[] = new int[a.length - 1];
		int x = 0;
		for (int i = 0, j = 0; j < a.length; i++, j++) {
			if(j == index) {
				j++;
			}
			b[i] = a[j]; 
		}
		a = b;
		return a;
	}
}
