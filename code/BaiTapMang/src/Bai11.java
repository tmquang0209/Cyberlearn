import java.util.Scanner;

public class Bai11 {
	final static int MIN = -100;
	final static int MAX = 100;

	public Bai11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = taoMang(n);
		inMang(a);
		a = tronMang(a);
		inMang(a);
		int b[] = tronMang(a);
		int count = countSuffle(a, b);
		System.out.println("Can " + count + " lan de mang tro ve nhu cu");

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
	
	public static int[] tronMang(int a[]) {
		int tam[] = new int[a.length];
		for(int i = 0; i < a.length/2;i++) {
			tam[2*i] = a[i];
			tam[2*i+1] = a[a.length/2+i];
		}
		a = tam;
		return a;
	}
	public static boolean isEqual(int a[],int b[]) {
		for(int i = 0; i < a.length;i++) {
			if(a[i] != b[i]) return false;
		}
		return true;
	}
	
	public static int countSuffle(int a[],int b[]) {
		int count = 0;
		do {
			b = tronMang(b);
			inMang(b);
			count++;
		}while(!isEqual(a, b));
		return count;
	}
}
