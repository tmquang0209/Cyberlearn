
/*
 * Tên chương trình: tìm giá trị đầu tiên nằm trong đoạn [x,y]
 * Ngày: 26/08/2021
 */
import java.util.Scanner;

public class Bai7 {

	final static char MAX = 100;
	final static int MIN = -100;

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int arr[] = taoMang(n);
		xuatMang(arr);

		int index = timGTTrongDoan(arr, sc);

		if (index != -1) {
			System.out.println("Giá trị đầu tiên nằm trong đoạn [x,y] là: " + arr[index]);
		} else {
			System.out.println("Không có giá trị nào trong đoạn [x,y] đã nhập");
		}

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

	public static int timGTTrongDoan(int arr[], Scanner sc) {
		int x, y;
		do {
			System.out.print("x=");
			x = Integer.parseInt(sc.nextLine());
			System.out.print("y=");
			y = Integer.parseInt(sc.nextLine());
		} while (x >= y);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= x && arr[i] <= y)
				return i;
		}
		return -1;

	}
}
