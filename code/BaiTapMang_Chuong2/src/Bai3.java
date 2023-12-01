import java.util.Scanner;

public class Bai3 {

	final static int MAX = 10;
	final static int MIN = -10;

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = nhapN(sc);
		int n = nhapN(sc);
		int A[][] = taoMang(m, n);
		xuatMang(A, m, n);
		int B[][] = taoMang(m, n);
		xuatMang(B, m, n);
		int C[][] = tinhTong2MaTran(A, B, m, n);
		xuatMang(C, m, n);

	}

	public static int nhapN(Scanner sc) {
		int n;
		do {
			System.out.print("Nhap gia tri > 1: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 1);
		return n;
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

	public static int[][] tinhTong2MaTran(int A[][], int B[][], int m, int n) {
		int C[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}

}
