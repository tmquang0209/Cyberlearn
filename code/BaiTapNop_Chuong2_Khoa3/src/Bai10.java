
/*
 * Tên chương trình: giá trị đầu tiên lớn hơn 2020 
 * Ngày tạo: 27/08/2021
 */
import java.util.Scanner;

public class Bai10 {

	public Bai10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soPT = nhapN(sc);
		int arr[] = nhapMang(soPT, sc);
		xuatMang(arr);

		int index = giaTriDauTienLonHon2020(arr);
		if (index == -1) {
			System.out.println("Mảng không có giá trị nào lớn hơn 2020");
		} else {
			System.out.println("Giá trị đầu tiên lớn hơn 2020 tại vị trí " + index + " với giá trị là " + arr[index]);
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

	public static int giaTriDauTienLonHon2020(int mang[]) {
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] > 2020)
				return i;
		}
		return -1;
	}

}
