/*
 * Tên chương trình: tính giai thừa
 * Ngày tạo: 14/08/2021
 */
import java.util.Scanner;

public class Bai5 {

	public Bai5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	tinhGiaiThua(scan);

	}

	public static void tinhGiaiThua(Scanner scan) {
		System.out.println("Nhap vao 1 so: ");
		int number = Integer.parseInt(scan.nextLine());
		int ketQua = 1;
		int i;

		if (number == 0 || number == 1) {
			ketQua = 1;
		} else if (number > 1) {
			for (i = 1; i <= number; i++) {
				ketQua *= i;
			}
		} else {
			for (i = -1; i >= number; i--) {
				ketQua *= i;
			}
		}

		System.out.println("Ket qua " + number + "! la: " + ketQua);
	}
}
