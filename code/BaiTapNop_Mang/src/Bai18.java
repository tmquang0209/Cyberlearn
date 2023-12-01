import java.util.Scanner;

public class Bai18 {

	public Bai18() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = nhapMang(n, sc);
		inMang(a);
		inRaManHinh(a);

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

	public static int[] demPhanTu(int mang[]) {
		int mangDem[] = new int[mang.length];
		for (int i = 0; i < mang.length; i++) {
			mangDem[i] = 0;
			for (int j = 0; j < mang.length; j++) {
				if (mang[i] == mang[j]) {
					if (j < i) {
						break;
					} else {
						mangDem[i]++;
					}
				}
			}
		}
		return mangDem;
	}

	public static int soXuatHienNhieuNhat(int mang[]) {
		int mangDem[] = demPhanTu(mang);
		int max = mangDem[0];
		for (int i = 1; i < mang.length; i++) {
			if (mangDem[i] != 0 && mangDem[i] > max) {
				max = mangDem[i];
			}
		}
		return max;
	}
	
	public static void inRaManHinh(int mang[]) {
		int mangDem[] = demPhanTu(mang);
		System.out.print("Số xuất hiện nhiều nhất: ");
		for (int i = 0; i < mang.length; i++) {
			if (mangDem[i] != 0 && mangDem[i] == soXuatHienNhieuNhat(mang)) {
				System.out.print(mang[i] + "[" + mangDem[i] + " lần] \t");
			}
		}
	}
}
