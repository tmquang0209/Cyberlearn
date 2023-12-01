/*
 * Tên: kiểm tra mảng toàn số dương hay không
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai6 {

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = nhapMang(row, col, sc);
		xuatMang(arr, row, col);
		kiemTraMang(arr, row, col);

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
				System.out.print("Nhap gia tri phan tu arr["+i+"]["+j+"]: ");
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
	
	public static void kiemTraMang(int arr[][],int row,int col) {
		boolean flag = true;
		for(int i = 0; i < row; i++) {
			flag = true;
			for(int j = 0; j < col;j++) {
				if(arr[i][j] < 0) {
					flag = false;
					break;
				}
			}
			if(!flag) break;
		}
		if(flag) { 
			System.out.println("Mang toan so duong");
		}else {
			System.out.println("Mang chua ca so am");
		}
	}

}
