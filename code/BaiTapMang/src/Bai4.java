import java.util.Scanner;

public class Bai4 {
	final static int MIN = -100;
	final static int MAX = 100;

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = nhapMang(scan);
		int a[] = taoMang(n);
		inMang(a);
		soDuongNhoNhat(a);

	}

	public static int nhapMang(Scanner scan) {
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

	public static void soDuongNhoNhat(int a[]) {
		int soMin = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				soMin = i;
				break;
			}
		}
		for (int j = soMin; j < a.length; j++) {
			if (a[j] > 0 && a[j] <= a[soMin]) {
				soMin = j;
			}
		}
		if (soMin == -1) {
			System.out.println("Khong co so duong trong mang");
		} else {
			for (int s = soMin; s < a.length; s++) {
				if (a[s] == a[soMin]) {
					System.out.print(s + " \t ");
				}
			}
		}
	}
}
