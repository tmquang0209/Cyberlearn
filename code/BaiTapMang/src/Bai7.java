import java.util.Scanner;

public class Bai7 {

	final static int MIN = -100;
	final static int MAX = 100;

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int a[] = taoMang(n);
		inMang(a);
		int add = nhapThemMang(a, sc);
		int giaTri = nhapGiaTri(sc);
		a = themGiaTri(a, add, giaTri);
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

	public static int nhapThemMang(int a[], Scanner sc) {
		int index;
		do {
			System.out.print("Nhập vị trí muốn thêm: ");
			index = Integer.parseInt(sc.nextLine());
		} while (index < 0 || index > a.length);
		return index;
	}

	public static int nhapGiaTri(Scanner sc) {
		System.out.print("Nhập số muốn thêm: ");
		int number = Integer.parseInt(sc.nextLine());
		return number;
	}

	public static int[] themGiaTri(int a[], int index, int giaTri) {
		int arr[] = new int[a.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				arr[i] = a[i];
			} else if (i == index) {
				arr[i] = giaTri;
			} else if(i > index){
				arr[i] = a[i - 1];
			}
		}
		a = arr;
		return a;
	}


}
