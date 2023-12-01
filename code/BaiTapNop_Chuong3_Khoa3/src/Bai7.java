import java.util.Scanner;

public class Bai7 {

	public Bai7() {
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

	public static float tongMauSo(float n) {
		if (n == 1) {
			return 1;
		}
		return (n + tongMauSo(n - 1));
	}

	public static float tinhTong(float n) {
		if (n == 1) {
			return 1;
		}
		return (float) (1 / tongMauSo(n) + tinhTong(n - 1));
	}

}
