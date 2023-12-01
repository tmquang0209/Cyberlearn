import java.util.Scanner;

public class Bai13 {

	public Bai13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = nhapMang(n, sc);
		inMang(a);
		inSLPhanTuGiongNhau(a);
	}

	public static int nhapN(Scanner scan) {
		System.out.print("Nhập số mảng: ");
		int n = Integer.parseInt(scan.nextLine());
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

	public static int[] demPhanTu(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (j < i) {
						break;
					} else {
						b[i]++;
					}
				}
			}
		}
		return b;
	}

	public static void inSLPhanTuGiongNhau(int a[]) {
		int b[] = demPhanTu(a);
		for (int i = 0; i < a.length; i++) {
			if (b[i] != 0)
				System.out.print(a[i] + "[" + b[i] + "] \t");
		}
	}
}
