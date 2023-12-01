import java.util.Scanner;

public class Bai1 {

	final static int MAX = 100;
	final static int MIN = -100;

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int arr[] = taoMang(n);
		xuatMang(arr);
		int found = giaTriDuongDauTien(arr);
		if(found == -1) {
			System.out.println("Khong tim thay gia tri duong trong mang");
		}else {
			System.out.println("Mang co gia tri duong tai vi tri " + found);
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

	public static int giaTriDuongDauTien(int mang[]) {
		int num=0;
		do {
			if(mang[num] > 0) return num;
			num++;
		}while(num < mang.length);
		return -1;
	}
}
