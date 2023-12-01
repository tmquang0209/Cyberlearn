import java.util.Scanner;

public class Bai8 {

	public Bai8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = nhapMang(n, sc);
		inMang(a);
		
		System.out.print("Nhập giá trị cần xóa: ");
		int x = Integer.parseInt(sc.nextLine());

		a = xoaPhanTuX(a, x);
		inMang(a);
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

	public static int demSoPhanTu(int a[], int x) {
		int count = 0;
		for (int pt : a) {
			if (pt == x)
				count++;
		}
		return count;
	}

	public static int[] xoaPhanTuX(int a[], int x) {
		int dem = demSoPhanTu(a, x);
		if (dem > 0) {
			int b[] = new int[a.length - dem];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != x) {
					b[j++] = a[i];
				}
			}
			a = b;
		} else {
			System.out.println("Không có phần tử " + x + " trong mảng");
		}
	return a;	
	}
}
