import java.util.Scanner;

public class Bai1 {

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapN(sc);
		int col = nhapN(sc);
		int mang[][] = nhapMang(sc, row, col);
		xuatMang(mang, row, col);
		tinhTong(mang, row, col);
	}

	public static int nhapN(Scanner sc) {
		int n;
		do {
			System.out.print("Nhap gia tri > 1: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] nhapMang(Scanner sc, int row, int col) {
		int mang[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("mang[" + i + "][" + j + "]");
				mang[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		return mang;
	}

	public static void xuatMang(int mang[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mang[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static void tinhTong(int mang[][], int row, int col) {
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum += mang[i][j];
			}
		}
		System.out.println("Tong cua mang la: " + sum);
	}
}
