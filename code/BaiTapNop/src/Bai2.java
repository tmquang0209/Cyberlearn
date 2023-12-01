import java.util.Scanner;

/*
 * Tên chương trình: Tính thuế thu nhập cá nhân
 * Ngày viết: 11/08/2021
 */
public class Bai2 {

	final static float THUE_SUAT_DUOI_60 = 0.05f;
	final static float THUE_SUAT_60_TO_120 = 0.1f;
	final static float THUE_SUAT_120_TO_216 = 0.15f;
	final static float THUE_SUAT_216_TO_384 = 0.2f;
	final static float THUE_SUAT_384_TO_624 = 0.25f;
	final static float THUE_SUAT_624_TO_960 = 0.3f;
	final static float THUE_SUAT_UPPER_960 = 0.35f;

	public Bai2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		String hoTen = sc.nextLine();

		System.out.print("Nhập tổng thu nhập năm: ");
		float thuNhap = Float.parseFloat(sc.nextLine());

		System.out.print("Nhập số người phụ thuộc: ");
		int soNguoiPhuThuoc = Integer.parseInt(sc.nextLine());

		tinhThueThuNhap(thuNhap, soNguoiPhuThuoc);
	}

	public static float tinhThuNhap(float thuNhap, int soNguoiphuThuoc) {
		float cash;
		// float soTienTru = 4*1.0f - (soNguoiphuThuoc * 1.6f);

		cash = thuNhap - 4 - soNguoiphuThuoc * 1.6f;
		if (cash < 0) {
			cash = 0;
		}

		return cash;
	}

	public static float thueSuat(float thuNhap) {
		float thueSuat;
		if (thuNhap > 0 && thuNhap <= 60) {
			thueSuat = THUE_SUAT_DUOI_60;
		} else if (thuNhap > 60 && thuNhap <= 120) {
			thueSuat = THUE_SUAT_60_TO_120;
		} else if (thuNhap > 120 && thuNhap <= 216) {
			thueSuat = THUE_SUAT_120_TO_216;
		} else if (thuNhap > 216 && thuNhap <= 384) {
			thueSuat = THUE_SUAT_216_TO_384;
		} else if (thuNhap > 384 && thuNhap <= 624) {
			thueSuat = THUE_SUAT_216_TO_384;
		} else if (thuNhap > 624 && thuNhap <= 960) {
			thueSuat = THUE_SUAT_624_TO_960;
		} else {
			thueSuat = THUE_SUAT_UPPER_960;
		}
		return thueSuat;
	}

	public static void tinhThueThuNhap(float thuNhap, int soNguoi) {
		float money = tinhThuNhap(thuNhap, soNguoi);
		float thue = thueSuat(thuNhap);
		if (money == 0) {
			System.out.println("Bạn không phải nộp thuế");
		} else {
			float tienThuePhaiTra = money * thue;
			System.out.println("Bạn có thu nhập: " + money);
			System.out.println("Bạn phải nộp: " + thue + " thuế");
			System.out.println("Số tiền phải nộp là: " + tienThuePhaiTra);
		}
	}
}
