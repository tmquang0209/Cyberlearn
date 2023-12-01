/*
 * Tên chương trình: In ra màn hình giá trị xuất hiện nhiều nhất
 * Ngày: 24/08/2021
 */
import java.util.Scanner;

public class Bai14 {
	final static int MAX = 50;
	final static int MIN = -50;

	public Bai14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = nhapSoDong(sc);
		int col = nhapSoCot(sc);
		int arr[][] = taoMang(row, col);
		xuatMang(arr, row, col);
		inPTXuatHienNhieuNhat(arr, row, col);

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

	public static int[] doiMang1Chieu(int arr[][], int row, int col) {
		int soPT = row * col;
		int mang1Chieu[] = new int[soPT];
		int k = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mang1Chieu[k++] = arr[i][j];
			}
		}
		return mang1Chieu;
	}

	public static int[] demPhanTu(int arr[]) {
		int mangDem[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			mangDem[i] = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (j < i) {
						break;
					} else {
						mangDem[i]++;
					}
				}
			}
		}
		return mangDem;
	}

	public static int phanTuNhieuNhat(int mangDem[]) {
		int num = mangDem[0];
		for (int i = 1; i < mangDem.length; i++) {
			if (mangDem[i] > 0 && mangDem[i] > num) {
				num = mangDem[i];
			}
		}
		return num;
	}
	
	public static void inPTXuatHienNhieuNhat(int arr[][],int row,int col) {
		int mang1Chieu[] = doiMang1Chieu(arr, row, col);
		int mangDem[] = demPhanTu(mang1Chieu);
		for (int i = 0; i < mang1Chieu.length; i++) {
			if (mangDem[i] == phanTuNhieuNhat(mangDem))
				System.out.println("Phan tu xuat hien nhieu nhat: " + mang1Chieu[i] + "[" + mangDem[i] + " lan] \t");
		}
				
	}
}
