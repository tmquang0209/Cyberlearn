/*
 * Tên: tìm số âm lớn nhất trong mảng
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai4 {

	final static int MAX = 50;
	final static int MIN = -50;

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = taoMang(row, col);
		xuatMang(arr, row, col);
		timSoAmLonNhat(arr, row, col);
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

	public static int viTriDongAm(int arr[][], int row, int col) {
		boolean flag;
		int number = 0;
		for (int i = 0; i < row; i++) {
			flag = false;
			for (int j = 0; j < col; j++) {
				if (arr[i][j] < 0) {
					flag = true;
					number = i;
					break;
				}
			}
			if (flag)
				break;
		}
		return number;
	}
	
	public static int viTriCotAm(int arr[][], int row, int col) {
		boolean flag;
		int number = 0;
		for (int i = 0; i < row; i++) {
			flag = false;
			for (int j = 0; j < col; j++) {
				if (arr[i][j] < 0) {
					flag = true;
					number = j;
					break;
				}
			}
			if (flag)
				break;
		}
		return number;
	}

	public static void timSoAmLonNhat(int arr[][], int row, int col) {

		int x = viTriDongAm(arr, row, col);
		int y = viTriCotAm(arr, row, col);
		int soAm = arr[x][y];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				soAm = arr[x][y];
				if (arr[i][j] < 0 && arr[i][j] >= soAm) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println("So am lon nhat trong mang la: " + soAm);
	}

}
