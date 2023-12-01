/*
 * Tên chương trình: tìm 1 vị trí mà tại đó giá trị đó nhỏ nhất
 * Ngày: 26/08/2021
 */
import java.util.Scanner;

public class Bai1 {

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT = nhapN(sc);
		int arr[] = nhapMang(soPT, sc);
		xuatMang(arr);
		int index = phanTuNhoNhat(arr);
		System.out.print("Giá trị nhỏ nhất là " + arr[index] + " tại vị trí: " + index);
//		for (int i = index; i < arr.length; i++) {
//			if(arr[i] == arr[index]) System.out.print(i + "\t");
//		}
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

	public static int phanTuNhoNhat(int arr[]) {
		int min = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}

}
