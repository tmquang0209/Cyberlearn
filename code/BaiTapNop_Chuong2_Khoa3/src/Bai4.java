
/*
 * Tên chương trình: số nguyên tố cuối cùng trong mảng
 * Ngày: 26/08/2021
 */
import java.util.Scanner;

public class Bai4 {

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT = nhapN(sc);
		int arr[] = nhapMang(soPT, sc);
		xuatMang(arr);
		int index = soNguyenToCuoiCung(arr);
		if (index != -1) {
			System.out.println("Số nguyên tố cuối cùng trong mảng là: " + arr[index] + " tại vị trí " + index);
		} else {
			System.out.println("Mảng không có số nguyên tố");
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

	public static boolean soNguyenTo(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static int soNguyenToCuoiCung(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (soNguyenTo(arr[i]))
				return i;
		}
		return -1;
	}
}
