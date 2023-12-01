/*
 * Tên: in ra đường song song với đường chéo phụ
 * Ngày: 24/08/2021	
 */
import java.util.Scanner;

public class Bai16 {

	final static int MAX = 100;
	final static int MIN = -100;

	public Bai16() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int arr[][] = taoMang(n);
		xuatMang(arr, n);
		inDuongSongSongCP(arr, n);
	}

	public static int nhapN(Scanner sc) {
		int n;
		do {
			System.out.print("Nhap n >= 1: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] taoMang(int n) {
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}
		return arr;
	}

	public static void xuatMang(int mang[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mang[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static void inDuongSongSongCP(int arr[][], int n) {
		System.out.println("ĐƯỜNG SONG SONG VỚI ĐƯỜNG CHÉO PHỤ");
		for (int k = 0; k < 2 * n - 1; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i + j == k)
						System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
