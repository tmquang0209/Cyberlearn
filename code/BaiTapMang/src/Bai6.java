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
		int a[] = taoMang(n);
		inMang(a);
		lietKe(a);
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

	public static void lietKe(int a[]) {
		int sum = 0;
		boolean check;
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i-1]) {
				sum += a[i];
			}
		}
		System.out.println("Tổng là: " + sum);
	}
}
