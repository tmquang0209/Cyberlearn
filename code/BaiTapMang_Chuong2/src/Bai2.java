import java.util.Scanner;

public class Bai2 {

	final static int MIN = -50;
	final static int MAX = 50;

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = nhapN(sc);
		int col = nhapN(sc);
		int arr[][] = taoMang(row, col);
		inMang(arr, row, col);
		inSoLonNhat(arr, row, col);

	}

	public static int nhapN(Scanner sc) {
		int n = 0;
		do {
			System.out.print("Nhập vào số n > 1: ");
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

	public static void inMang(int a[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static int timSoLonNhan(int a[][], int row, int col) {
		int max = a[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public static void inSoLonNhat(int a[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (a[i][j] == timSoLonNhan(a, row, col)) {
					System.out.println("arr[" + i + "][" + j + "]: " + a[i][j]);
				}
			}
		}
	}
}
