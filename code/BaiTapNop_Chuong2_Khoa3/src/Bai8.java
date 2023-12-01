/*
 * Tên chương trình: tìm phần tử đầu tiên có dạng 2^k trong mảng
 * Ngày: 27/08/2021
 */
import java.util.Scanner;

public class Bai8 {

	public Bai8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT = nhapN(sc);
		int arr[] = nhapMang(soPT, sc);
		xuatMang(arr);

		int index = timPT(arr);
		
		if (index != 0) {
			System.out.println("Số đầu tiên có dạng 2^k là " + index);
		} else {
			System.out.println("Không có phần tử nào trong mảng có dạng 2^k");
		}

	}

	public static int nhapN(Scanner sc) {
		int soPT;
		do {
			System.out.print("Nhập số phần tử: ");
			soPT = Integer.parseInt(sc.nextLine());
		} while (soPT < 1);
		return soPT;
	}

	public static int[] nhapMang(int soPT, Scanner sc) {
		int arr[] = new int[soPT];
		for (int i = 0; i < soPT; i++) {
			System.out.print("Nhập arr[" + i + "] = ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		return arr;
	}

	public static void xuatMang(int mang[]) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + "\t");
		}
		System.out.println("\n");
	}

	public static int timPT(int mang[]) {
		for (int i = 0; i < mang.length; i++) {
			int n = 2;
			do {
				if (n == mang[i]) {
					return mang[i];
				}
				n *= 2;
			} while (n >= 0);
		}
	return 0;
	}

}
