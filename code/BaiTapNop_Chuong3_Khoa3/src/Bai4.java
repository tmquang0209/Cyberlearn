import java.util.Scanner;

public class Bai4 {

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n > 0: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);
		System.out.println(tinhTong(n));
	}

	public static float tinhTong(float n) {
		if (n == 1) {
			return (float) 0.5;
		}
		return 1 / (2 * n) + tinhTong(n - 1);
	}

}
