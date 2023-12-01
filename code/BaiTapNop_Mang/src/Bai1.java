/*
 * Tên chương trình: in ra màn hình số có dạng 3^k
 * Ngày tạo: 20/08/2021
 */
import java.util.Scanner;

public class Bai1 {

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = nhapMang(n, sc);
		inMang(mangBanDau);
		System.out.println("\n");
		mangBanDau = kiemTraMu3(mangBanDau);
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
	
	public static int demCacSo(int mang[]) {
		int count = 0;
		for(int pt : mang) {
			if(pt % 3 == 0) count++;
		}
		return count;
	}
	
	public static int[] kiemTraMu3(int mang[]) {
		int mangMoi[] = new int[demCacSo(mang)];
		for(int i = 0,j = 0; i < mang.length; i++) {
			if(mang[i] % 3 == 0) {
				mangMoi[j++] = mang[i];
			}
		}
		if(demCacSo(mang) == 0) System.out.println("Không có số nào có dạng 3^k");
		mang = mangMoi;
		return mang;
	}

}
