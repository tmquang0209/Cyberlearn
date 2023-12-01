
/*
 * Tên chương trình: đếm chữ số lẻ của n
 * Ngày: 28/08/2021
 */
import java.util.Scanner;

public class Bai11 {

	public Bai11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n > 0: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);

		System.out.println(soLe(n));

	}

	public static int soLe(int n) {
		if (n == 0)
			return 0;
		if ((n % 10) % 2 != 0) {
			return soLe(n / 10) + 1;
		} else {
			return soLe(n / 10);
		}
	}

}
