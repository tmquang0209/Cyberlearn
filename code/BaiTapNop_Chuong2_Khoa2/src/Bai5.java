/*
 * Tên: Tìm số nguyên tố đầu tiên
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai5 {

	final static int MAX = 50;
	final static int MIN = -50;

	public Bai5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = taoMang(row, col);
		xuatMang(arr, row, col);
		timSoNguyenToDauTien(arr, row, col);

	}

	public static int nhapSoDong(Scanner sc) {
		int row;
		do {
			System.out.print("Nhap so dong >= 1: ");
			row = Integer.parseInt(sc.nextLine());
		} while (row < 1);
		return row;
	}

	public static int nhapSoCot(Scanner sc) {
		int col;
		do {
			System.out.print("Nhap so cot >= 1: ");
			col = Integer.parseInt(sc.nextLine());
		} while (col < 1);
		return col;
	}

	public static int[][] taoMang(int row, int col) {
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}
		return arr;
	}

	public static void xuatMang(int mang[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mang[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static boolean soNguyenTo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void timSoNguyenToDauTien(int arr[][], int row, int col) {
		boolean flag;
		int soNguyenTo = 1;
		for (int i = 0; i < row; i++) {
			flag = false;
			for (int j = 0; j < col && arr[i][j] > 1; j++) {
				flag = soNguyenTo(arr[i][j]);
				if (flag) {
					soNguyenTo = arr[i][j];
					break;
				}
			}
			if (flag)
				break;
		}
		System.out.println("So nguyen to dau tien trong mang la: " + soNguyenTo);
	}

}
