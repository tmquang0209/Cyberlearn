/*
 * Tên chương trình: tìm số nguyên tố nhỏ nhất lớn hơn mọi giá trị trong mảng
 * Ngày tạo: 27/08/2021
 */
import java.util.Scanner;

public class Bai9 {

	public Bai9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT = nhapN(sc);
		int arr[] = nhapMang(soPT, sc);
		xuatMang(arr);

		soNguyenToTMDK(arr);

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

	public static boolean laSoNguyenTo(int so) {
		if (so <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(so); i++) {
			if (so % i == 0)
				return false;
		}
		return true;
	}

	public static int soLonNhat(int mang[]) {
		int max = mang[0];
		for (int i = 1; i < mang.length; i++) {
			if (mang[i] > max)
				max = mang[i];
		}
		return max;
	}

	public static void soNguyenToTMDK(int mang[]) {
		int index = -1;
		int max = soLonNhat(mang);
		for (int i = 0; i < mang.length; i++) {
			if (laSoNguyenTo(mang[i])) {
				if (mang[i] >= max) {
					index = i;
				}
			}
		}

		if (index == -1) {
			System.out.println("Mảng không có số nguyên tố nào thỏa mãn điều kiện");
		} else {
			System.out.println("Số nguyên tố cần tìm là " + mang[index]);
		}
	}

}
