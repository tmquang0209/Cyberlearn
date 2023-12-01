import java.util.Scanner;

public class XuLy {
	final static char MAX = 100;
	final static int MIN = -100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int arr[] = taoMang(n);
		xuatMang(arr);
		arr = quickSort(arr, 0, arr.length - 1);
		xuatMang(arr);
	}

	public static int nhapN(Scanner sc) {
		int n;
		do {
			System.out.print("Nhap gia tri > 1: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return arr;
	}

	public static void xuatMang(int mang[]) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + "\t");
		}
		System.out.println("\n");
	}

	public static int[] quickSort(int arr[], int left, int right) {
		int i, j, x;
		x = arr[(left + right) / 2];
		i = left;
		j = right;
		do {
			while (arr[i] < x) {
				i++;
			}
			while (arr[j] > x) {
				j--;
			}
			if (i <= j) {
				int tam = arr[i];
				arr[i] = arr[j];
				arr[j] = tam;
				i++;
				j--;
			}
		} while (i < j);
		if (left < j)
			quickSort(arr, left, j);
		if (i < right)
			quickSort(arr, i, right);
		return arr;
	}

}
