import java.util.Scanner;

/*
 * Tên chương trình: Tính tiền điện
 * Ngày viết: 11/08/2021
 */
public class Bai3 {
	final static int GIA_TIEN_50KW_DAU = 500;
	final static int GIA_TIEN_50KW_KE = 650;
	final static int GIA_TIEN_100KW_KE = 850;
	final static int GIA_TIEN_150KW_KE = 1100;
	final static int GIA_TIEN_CON_LAI = 1300;

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số KW: ");
		float soKW = Float.parseFloat(sc.nextLine());
		System.out.println("Số tiền phải trả là: "+ tinhTien(soKW));
	}

	public static float tien50KWDau(float soKW) {
		float tien;
		if (soKW > 0 && soKW < 50) {
			tien = soKW * GIA_TIEN_50KW_DAU;
		} else {
			tien = 50 * GIA_TIEN_50KW_DAU;
		}
		return tien;
	}

	public static float tien50KWKe(float soKW) {
		float tien;
		float tien50KWDau = tien50KWDau(soKW);

		if (soKW < 100) {
			tien = tien50KWDau + (soKW - 50) * GIA_TIEN_50KW_KE;
		} else {
			tien = tien50KWDau + 50 * GIA_TIEN_50KW_KE;
		}
		return tien;
	}

	public static float tien100KWKe(float soKW) {
		float tien;
		float tien100KWDau = tien50KWKe(soKW);

		if (soKW < 200) {
			tien = tien100KWDau + (soKW - 100) * GIA_TIEN_100KW_KE;
		} else {
			tien = tien100KWDau + 100 * GIA_TIEN_100KW_KE;
		}
		return tien;
	}

	public static float tien150KWKe(float soKW) {
		float tien;
		float tien200KWDau = tien100KWKe(soKW);

		if (soKW < 350) {
			tien = tien200KWDau + (soKW - 100) * GIA_TIEN_150KW_KE;
		} else {
			tien = tien200KWDau + 150 * GIA_TIEN_150KW_KE;
		}
		return tien;
	}

	public static float tienConLai(float soKW) {
		float tien;
		float tien350KWDau = tien150KWKe(soKW);
		tien = tien350KWDau + (soKW - 350) * GIA_TIEN_CON_LAI;
		return tien;
	}

	public static float tinhTien(float soKW) {
		float tien;
		if (soKW > 0 && soKW <= 50) {
			tien = tien50KWDau(soKW);
		} else if (soKW > 50 && soKW <= 100) {
			tien = tien50KWKe(soKW);
		} else if (soKW > 100 && soKW <= 200) {
			tien = tien100KWKe(soKW);
		} else if (soKW > 200 && soKW <= 350) {
			tien = tien150KWKe(soKW);
		} else {
			tien = tienConLai(soKW);
		}
		return tien;
	}

}
