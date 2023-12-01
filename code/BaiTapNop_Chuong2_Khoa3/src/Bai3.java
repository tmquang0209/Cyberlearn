/*
 * Tên: số dương nhỏ nhất
 * Ngày: 26/08/2021
 */
import java.util.Scanner;

public class Bai3 {

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT = nhapN(sc);
		int arr[] = nhapMang(soPT, sc);
		xuatMang(arr);
		int indexMin = giaTriDuongNN(arr);
		if (indexMin == -1) {
			System.out.println("Mảng không có giá trị dương");
		} else {
			System.out.println("Mảng có giá trị dương nhỏ nhất tại " + indexMin + " với giá trị " + arr[indexMin]);
		}

	}

	public static int nhapN(Scanner sc) {
		int soPT;
		do {
			System.out.print("Nhập số phần tử: ");
			soPT = Integer.parseInt(sc.nextLine());
		} while (soPT < 1);
		return soPT;
	}

	public static int[] nhapMang(int soPT, Scanner sc) {
		int arr[] = new int[soPT];
		for (int i = 0; i < soPT; i++) {
			System.out.print("Nhập arr[" + i + "] = ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		return arr;
	}

	public static void xuatMang(int mang[]) {
		for (int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + "\t");
		}
		System.out.println("\n");
	}

	public static int giaTriDuongNN(int arr[]) {
		int index = -1;
		// tìm giá trị dương đầu tiên
		for (int i = 0; i < arr.length && arr[i] > 0; i++) {
			index = i;
			break;
		}
		// tìm giá trị dương nhỏ nhất
		for (int j = index + 1; j < arr.length && arr[j] > 0; j++) {
			if (arr[j] < arr[index])
				index = j;
		}
		return index;
	}

}
