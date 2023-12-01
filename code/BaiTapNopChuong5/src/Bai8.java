/*
 * Tên chương trình: Tính và in số tiền tích lũy
 * Ngày tạo: 14/08/2021
 */
import java.util.Scanner;

public class Bai8 {

	public Bai8() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float tienVon, thoiHan, laiSuat;
		do {
			System.out.print("Nhập vào tiền vốn: ");
			tienVon = Float.parseFloat(sc.nextLine());

			System.out.print("Nhập vào thời hạn: ");
			thoiHan = Float.parseFloat(sc.nextLine());

			System.out.print("Nhập vào lãi suất: ");
			laiSuat = Float.parseFloat(sc.nextLine());
		} while (tienVon <= 0 || thoiHan <= 0 || laiSuat <= 0);

		inDanhSach(tienVon, thoiHan, laiSuat);
	}

	public static float tinhTienTheoNam(float tienVon, float thoiHan, float laiSuat) {
		float heSo = 1 + laiSuat/100;
		return (float) Math.round(tienVon * Math.pow(heSo, thoiHan) * 10) / 10;
		
	}

	public static void inDanhSach(float tienVon, float thoiHan, float laiSuat) {
		System.out.println("Year\tAmount");
		for (int i = 1; i <= thoiHan; i++) {
			System.out.println(i + "\t" + tinhTienTheoNam(tienVon, i, laiSuat));
		}
	}
}
