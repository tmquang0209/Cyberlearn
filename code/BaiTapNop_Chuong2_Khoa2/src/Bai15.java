/*
 * Tên: In ra màn hình ma trận thưa hay không thưa
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai15 {

	public Bai15() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = nhapMang(row, col, sc);
		xuatMang(arr, row, col);
		inRaManHinh(arr, row, col);

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

	public static int[][] nhapMang(int row, int col, Scanner sc) {
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Nhap gia tri phan tu arr[" + i + "][" + j + "]: ");
				arr[i][j] = Integer.parseInt(sc.nextLine());
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

	public static boolean kiemTra(int arr[][], int row, int col) {
		int zero = 0;
		int other = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 0) {
					zero++;
				} else {
					other++;
				}
			}
		}
		if (zero > other) {
			return true;
		} else {
			return false;
		}
	}

	public static void inRaManHinh(int arr[][], int row, int col) {
		if (kiemTra(arr, row, col)) {
			System.out.println("Ma tran thua");
		} else {
			System.out.println("Ma tran khong thua");
		}
	}

}
