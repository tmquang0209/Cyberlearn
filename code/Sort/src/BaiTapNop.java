
/*
 * Tên chương trình: Trộn 2 mảng và sắp xếp giảm dần
 * Ngày tạo: 29/08/2021
 */
import java.util.Scanner;

public class BaiTapNop {

	final static char MAX = 100;
	final static int MIN = -100;

	public BaiTapNop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int m = nhapN(sc);
		int arrA[] = taoMang(n);
		int arrB[] = taoMang(m);

		arrA = quickSort(arrA, 0, n - 1);
		arrB = quickSort(arrB, 0, m - 1);

		System.out.println("Mang A");
		xuatMang(arrA);
		System.out.println("\nMang B");
		xuatMang(arrB);

		int arrC[] = tronMang(arrA, arrB);
		System.out.println("\nMang C");
		arrC = descensingSort(arrC);
		xuatMang(arrC);

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
//		System.out.println("\n");
	}

	public static int[] tronMang(int arrA[], int arrB[]) {
		int length = arrA.length + arrB.length;
		int arrC[] = new int[length];

		for (int i = 0; i < length; i++) {
			if (i < arrA.length) {
				arrC[i] = arrA[i];
			} else {
				arrC[i] = arrB[i - arrA.length];
			}
		}
		return arrC;
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

	public static int[] descensingSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] > arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		return arr;
	}

}
