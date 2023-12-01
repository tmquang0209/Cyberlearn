/*
 * Tên chương trình: Xóa số lớn nhất trong mảng
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai11 {
	
	public Bai11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = nhapMang(n, sc);
		inMang(mangBanDau);
		mangBanDau = xoaSoLonNhat(mangBanDau);
		inMang(mangBanDau);

	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
		System.out.print("Nhập số mảng: ");
		n = Integer.parseInt(scan.nextLine());
		}while(n <= 0);
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
	
	public static int soLonNhat(int mang[]) {
		int max = mang[0];
		for(int i = 1; i <mang.length;i++) {
			if(mang[i] > max) max = mang[i];
		}
		return max;
	}
	
	public static int demSoLonNhat(int mang[]) {
		int count = 0;
		for(int i = 0; i <mang.length;i++) {
			if(mang[i] == soLonNhat(mang)) count++;
		}
		return count;
	}
	
	public static int[] xoaSoLonNhat(int mang[]) {
		int mangMoi[] = new int[mang.length-demSoLonNhat(mang)];
		for(int i = 0,j=0; i < mang.length;i++) {
			if(mang[i] != soLonNhat(mang)) mangMoi[j++] = mang[i];
		} 
		mang = mangMoi;
		return mang;
	}
}
