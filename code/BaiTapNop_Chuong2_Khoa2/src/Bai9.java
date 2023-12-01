/*
 * Tên: tính tổng giá trị lẻ trên 1 cột
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai9 {

	final static int MAX = 50;
	final static int MIN = -50;

	public Bai9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = taoMang(row, col);
		xuatMang(arr, row, col);
		tongSoLeTrenCot(arr, row, col);

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

	public static void tongSoLeTrenCot(int arr[][], int row, int col) {
		for (int i = 0; i < col; i++) {
			int sum = 0;
			for (int j = 0; j < row; j++) {
				if (arr[j][i] % 2 != 0) {
					sum += arr[j][i];
				}
			}
			System.out.println("Tong cac gia tri le tren cot " + i + " bang:\t" + sum);
		}
	}
}
