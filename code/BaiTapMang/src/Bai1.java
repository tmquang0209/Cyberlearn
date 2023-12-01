import java.util.Scanner;

public class Bai1 {

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số mảng: ");
		int n = Integer.parseInt(sc.nextLine());
		int a[] = nhapMang(n, sc);
		xuatMang(a);
		tongSoChan(a);
		demSoAm(a);
		randomSoTrongMang(a);
	}

	public static int[] nhapMang(int n, Scanner sc) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Giá trị của a[" + i + "] là: ");
			a[i] = Integer.parseInt(sc.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}

	public static void tongSoChan(int a[]) {
		int tong = 0;
		for (int item : a) {
			if (item % 2 == 0) {
				tong += item;
			}
		}
		System.out.println("\nTổng số chẵn trong mảng là: \t" + tong);
	}

	public static void demSoAm(int a[]) {
		int count = 0;
		int tong = 0;
		for (int item : a) {
			if (item < 0) {
				tong += item;
				count++;
			}
		}
		System.out.println("Có " + count + " số âm trong mảng");
		System.out.println("Tổng số âm trong mảng là: \t " + tong);
	}

	public static void randomSoTrongMang(int a[]) {
		int soDau = a[0];
		int soCuoi = a[a.length-1];
		int random = soDau + (int)Math.random()*((soCuoi - soDau)+1);
	System.out.println("Số random là: \t" + random);
	}
}
