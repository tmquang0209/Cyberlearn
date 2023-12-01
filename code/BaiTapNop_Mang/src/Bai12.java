/*
 * Tên chương trình: Xóa số âm trong mảng
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai12 {

	public Bai12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = nhapMang(n, sc);
		inMang(mangBanDau);
		if (demSoAm(mangBanDau) == 0) {
			System.out.println("Mảng không có số âm");
		} else {
			mangBanDau = mangSoDuong(mangBanDau);
			inMang(mangBanDau);
		}

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập số mảng: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);
		return n;
	}

	public static int[] nhapMang(int n, Scanner sc) {
		int mang[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "]: ");
			mang[i] = Integer.parseInt(sc.nextLine());
		}
		return mang;
	}

	public static void inMang(int mang[]) {
		for (int item : mang) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static int demSoAm(int mang[]) {
		int count = 0;
		for (int pt : mang) {
			if (pt < 0)
				count++;
		}
		return count;
	}

	public static int[] mangSoDuong(int mang[]) {
		int mangDuong[] = new int[mang.length - demSoAm(mang)];
		for (int i = 0, j = 0; i < mang.length; i++) {
			if (mang[i] > 0)
				mangDuong[j++] = mang[i];
		}
		if (demSoAm(mang) == 0)
			System.out.println("Mảng không có số âm");
		mang = mangDuong;
		return mang;
	}

}
