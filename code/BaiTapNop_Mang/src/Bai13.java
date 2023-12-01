/*
 * Tên chương trình: xóa số chẵn trong mảng
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai13 {

	public Bai13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = nhapMang(n, sc);
		inMang(mangBanDau);
		if (demSoChan(mangBanDau) == 0) {
			System.out.println("Mảng không có số chẵn");
		} else {
		mangBanDau = inSoLe(mangBanDau);
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
	public static int demSoChan(int mang[]) {
		int count = 0;
		for (int pt : mang) {
			if (pt % 2 == 0)
				count++;
		}
		return count;
	}
	
	public static int[] inSoLe(int mang[]) {
		int mangLe[] = new int[mang.length-demSoChan(mang)];
		for(int i=0,j=0;i<mang.length;i++) {
			if(mang[i] % 2 != 0) mangLe[j++] = mang[i];
		}
		mang = mangLe;
		return mang;
	}

}
