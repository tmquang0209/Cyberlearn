/*
 * Tên chương trình: Đảo ngược mảng
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai17 {

	public Bai17() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = nhapMang(n, sc);
		inMang(a);
		a = mangDaoNguoc(a);
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

	public static int[] mangDaoNguoc(int mang[]) {
		int mangNguoc[] = new int[mang.length];
		for(int i = 0,j = mang.length-1;i < mang.length; i++,j--) {
			mangNguoc[i] = mang[j];
		}
		return mangNguoc;
	}

}
