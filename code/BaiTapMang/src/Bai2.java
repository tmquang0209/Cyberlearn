import java.util.Scanner;

public class Bai2 {
	final static int MIN = -100;
	final static int MAX = 100;

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = taoMang(n);
		inMang(a);
		lietKeTrongDoan(a, sc);
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

	public static void lietKeTrongDoan(int a[], Scanner sc) {
		int x, y;
		do {

			System.out.print("Nhập giá trị dưới: ");
			x = Integer.parseInt(sc.nextLine());

			System.out.print("Nhập giá trị trên: ");
			y = Integer.parseInt(sc.nextLine());

		} while (x > y);
		for(int item : a) {
			if(item > x && item < y) {
				System.out.print(item + "\t");
			}
		}

	}
}
