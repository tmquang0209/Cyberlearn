
/*
 * Tên chương trình: tính tổng căn bậc n
 * Ngày: 27/08/2021
 */
import java.util.Scanner;

public class Bai2 {

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập n > 0: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n <= 0);
		System.out.println(tinhCanBacHai(n));
	}

	public static float tinhCanBacHai(int n) {
		if (n == 1) {
			return 1;
		}
		return (float) Math.sqrt(n + tinhCanBacHai(n - 1));
	}

}
