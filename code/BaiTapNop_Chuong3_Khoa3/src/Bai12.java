
/*
 * Tên chương trình: tìm chữ số đầu tiên
 * Ngày: 28/08/2021
 */
import java.util.Scanner;

public class Bai12 {

	public Bai12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n > 0: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);

		System.out.println(soDauTien(n));

	}

	public static int soDauTien(int n) {
		if (n < 10)
			return n;
		return soDauTien(n / 10);
	}

}
