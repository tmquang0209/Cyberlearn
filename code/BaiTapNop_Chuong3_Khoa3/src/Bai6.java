import java.util.Scanner;

public class Bai6 {

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		do {
			System.out.print("Nhập x > 0: ");
			x = Integer.parseInt(sc.nextLine());

			System.out.print("Nhập n > 0: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0 || x <= 0);

		System.out.println(tinhTong(x, n));
	}

	public static double tinhTong(double x, double n) {
		if (n == 1) {
			return x;
		}
		return (Math.pow(x, n) + tinhTong(x, n - 1));
	}

}
