
/*
 * Tên chương trình: Tính số năm nhận được số tiền mong muốn
 * Ngày tạo: 14/08/2021
 */
import java.util.Scanner;

public class Bai6 {

	public Bai6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float tienGui, laiSuat, tienNhan;
		do {
			System.out.print("Nhập vào số tiền gửi (Triệu VNĐ): ");
			tienGui = Float.parseFloat(sc.nextLine());

			System.out.print("Nhập vào số lãi suất (%): ");
			laiSuat = Float.parseFloat(sc.nextLine());

			System.out.print("Nhập vào số tiền mong muốn nhận được (Triệu VNĐ): ");
			tienNhan = Float.parseFloat(sc.nextLine());
		} while (tienGui >= tienNhan || tienGui <= 0 || tienNhan <= 0 || laiSuat <= 0);

		tinhSoNam(tienGui, laiSuat, tienNhan);

		tinhSoNamWhile(tienGui, laiSuat, tienNhan);

	}

	public static void tinhSoNam(float tienGui, float laiSuat, float tienNhan) {
		// tính số năm
		// CÔNG THỨC LÃI KÉP: A = T(1+R)^N
		float year;
		year = tienNhan / tienGui;
		year = (float) (Math.log(year) / Math.log(1 + laiSuat / 100));
		// làm tròn năm
		year = (float) Math.ceil(year);

		System.out.println("Số năm anh X phải đợi ít nhất là: " + year + " năm");
	}

	public static void tinhSoNamWhile(float tienGui, float laiSuat, float tienNhan) {
		float soTien = tienGui;
		int count = 0;
		while (soTien < tienNhan) {
			soTien *= (1 + laiSuat / 100);
			count++;
		}
		System.out.println("Số năm nhận được số tiền ít nhất " + tienNhan + " là: " + count + " năm");
	}

}
