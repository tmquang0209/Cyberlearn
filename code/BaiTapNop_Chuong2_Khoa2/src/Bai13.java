/*
 * Tên : tổng các số nguyên tố
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai13 {
	final static int MAX = 50;
	final static int MIN = -50;
	public Bai13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = taoMang(row, col);
		xuatMang(arr, row, col);
		tongSoNguyenTO(arr, row, col);

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
	
	public static boolean soNguyenTo(int number) {
		if(number <= 1) return false;
		for(int i = 2; i < Math.sqrt(number); i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	public static void tongSoNguyenTO(int arr[][], int row, int col) {
		long sum = 0;
		for(int i = 0; i < row; i++) {
			for(int j =0 ; j < col;j++) {
				if(soNguyenTo(arr[i][j])) sum += arr[i][j];
			}
		}
		System.out.println("Tong so nguyen to trong mang la: " + sum);
	}

}
