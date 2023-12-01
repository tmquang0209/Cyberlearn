/*
 * Tên: Kiểm tra cột giảm dần
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai7 {

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = nhapMang(row, col, sc);
		xuatMang(arr, row, col);
		kiemTraCotGiamDan(arr, row, col, sc);

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

	public static void kiemTraCotGiamDan(int arr[][], int row,int col, Scanner sc) {
		int cot;
		do {
			System.out.print("Nhap cot can kiem tra");
			cot = Integer.parseInt(sc.nextLine());
		}while(cot > col || cot < 0);
		
		boolean flag = true;
		for (int i = 0; i < row-1; i++) {
			if(arr[i+1][cot] > arr[i][cot]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Cot " + cot + " giam dan");
		}else {
			System.out.println("Cot " + cot + " khong giam dan");			
		}
	}

}
