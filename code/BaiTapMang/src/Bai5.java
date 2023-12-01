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
		int arr[] = taoMang(n);
		inMang(arr);
		chuSoDauTienLe(arr);
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

	public static boolean kiemTraChuSoDauTien(int n) {
		boolean check = false;
		int dv;
		n = Math.abs(n);
		while (n >= 10) {
			dv = n / 10;
			n /= 10;
		}

		if (n % 2 != 0) {
			check = true;
		}
		return check;
	}

	public static void chuSoDauTienLe(int a[]) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (kiemTraChuSoDauTien(a[i])) {
				System.out.print(a[i] + "\t");
			}
		}
		if (index == 1) {
			System.out.println("Không có phần tử nào bắt đầu là chữ số lẻ");
		}
	}
}
