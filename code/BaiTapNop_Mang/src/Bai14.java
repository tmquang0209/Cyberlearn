/*
 * Tên chương trình: số chính phương
 * Ngày tạo: 21/08/2021
 */
import java.util.Scanner;

public class Bai14 {

	public Bai14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = nhapMang(n, sc);
		inMang(mangBanDau);
		inSoChinhPhuong(mangBanDau);

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
	
	public static boolean kiemTraSoChinhPhuong(int number) {
		int soBacHai = (int) Math.sqrt(number);
		soBacHai = (int) Math.pow(soBacHai,2);
		if(soBacHai == number) return true;
		return false;
	}
	
	public static void inSoChinhPhuong(int mang[]) {
		int count = 0;
		for(int item : mang) {
			if(kiemTraSoChinhPhuong(item)) {
				System.out.print(item + "\t");
			count++;
			}
		}
		if(count == 0) System.out.println("Mảng không có số chính phương");
	}

}
