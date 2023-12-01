import java.util.Scanner;

public class Bai14 {

	public Bai14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = nhapMang(n, sc);
		inMang(a);
		xetDoiXung(a);
		a = dichXoayVong(a, sc);
		inMang(a);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập số mảng: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 2 || n % 2 != 0);
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

	public static void xetDoiXung(int a[]) {
		boolean flag = true;
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			if (a[i] != a[j])
				flag = false;
			continue;
		}
		if (flag) {
			System.out.println("Mang doi xung");
		} else {
			System.out.println("Mang khong doi xung");
		}

	}

	public static int[] dichXoayVong(int a[], Scanner sc) {
		int n;
		int tam;
		do {
			System.out.print("Nhap so lan xoay");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 0);
		n %= a.length;

		for (int i = 0; i < n; i++) {
			tam = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = tam;
		}
		return a;
	}
}
