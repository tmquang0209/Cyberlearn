/*
 * Tên chương trình: tìm giá trị gần x nhất
 * Ngày: 26/08/2021
 */
import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT = nhapN(sc);
		int arr[] = nhapMang(soPT, sc);
		xuatMang(arr);
		giaTriGanXNhat(arr, sc);

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

	public static void giaTriGanXNhat(int arr[], Scanner sc) {
		System.out.print("x=");
		int x = Integer.parseInt(sc.nextLine());

		int mangKC[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			mangKC[i] = Math.abs(arr[i] - x);
		}
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (mangKC[i] < mangKC[index]) {
				index = i;
			}
		}
		System.out.print("Giá trị gần với x="+x+" nhất là: ");
		for(int i = index; i < arr.length;i++) {
			if(arr[i] == arr[index]) System.out.print(arr[i] + "\t");
		}

	}

}
