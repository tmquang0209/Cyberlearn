
/*
 * Tên chương trình: tính tổng
 * Ngày: 28/08/2021
 */
import java.util.Scanner;

public class Bai15 {

	public Bai15() {
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
		if (n == 0)
			return 1;
		return 1 / (2 * n + 1) + tinhTong(n - 1);
	}

}
