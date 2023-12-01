import java.util.Scanner;

public class Bai10 {
	final static int MIN = -100;
	final static int MAX = 100;

	public Bai10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = taoMang(n);
		inMang(a);
		System.out.println("Co " + demSoChiaHetCho4(a) + " phan tu chia het cho 4 tan cung la 6");
		a = phanTuLe(a);
		inMang(a);

	}

	public static int nhapN(Scanner scan) {
		System.out.print("Nhập số mảng: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void inMang(int a[]) {
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}

	public static int demSoChiaHetCho4(int a[]) {
		int dem = 0;
		for (int pt : a) {
			if (pt % 4 == 0 && Math.abs(pt) % 10 == 6) {
				dem++;
			}
		}
		return dem;
	}

	public static int[] phanTuLe(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
			a[i] *= 2;
			}
		}
		return a;
	}
}
