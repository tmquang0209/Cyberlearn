import java.util.Scanner;

public class Bai12 {
	final static int MIN = -100;
	final static int MAX = 100;

	public Bai12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = taoMang(n);
		inMang(a);
		printMaxRun(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.print("Nhập số mảng: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 2 || n % 2 != 0);
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

	public static void printMaxRun(int a[]) {
		int head = 0;
		int maxLen = 0;
		int maxHead = 0;
		do {
			int len = 1;
			int i;
			for (i = head; i < a.length - 1 && a[i] < a[i + 1]; i++) {
				len++;
			}
			if (len > maxLen) {
				maxLen = len;
				maxHead = head;
			}
			head = i + 1;
		} while (head < a.length);
		for(int i = 0 ; i < maxLen;i++) {
			System.out.print(a[maxHead + i] + "\t");
		}
	}
}
