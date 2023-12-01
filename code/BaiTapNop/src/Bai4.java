import java.util.Scanner;

/*
 * Tên chương trình: Tính tiền cáp
 * Ngày tạo: 12/08/2021
 */
public class Bai4 {

	final static float INDIVIDUAL_BILL_PROCESSING_FEE = 4.5f;
	final static float BUSINES_INVOICE_PROCESSING_FEE = 15;

	final static float BASIC_SERVICE_CHARGE_INDIVIDUAL = 20.5f;
	final static float BUSINES_BASIC_SERVICE_FEE_10 = 75;
	final static float BUSINES_BASIC_SERVICE_FEE_UPPER = 5;

	final static float PERSONAL_PREMIUM_CHANNEL_RENTAL = 7.5f;
	final static float ENTERPRISE_PREMIUM_CHANNEL_RENTAL = 50;

	public Bai4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code = nhapMaKhachHang(sc);
		int numberAccount = nhapSoTaiKhoan(sc);
		
		if(soKenh(numberAccount) >= 1){
			System.out.println("Số tiền phải trả là: " + tinhTien(code,numberAccount));
		}else {
			System.out.println("Số tài khoản không hợp lệ");
		}
		
	}

	public static int nhapMaKhachHang(Scanner sc) {
		System.out.println("Nhập mã khách hàng (6 so): ");
		int code = Integer.parseInt(sc.nextLine());
		return code;
	}

	public static int nhapSoTaiKhoan(Scanner sc) {
		System.out.println("Nhập số tài khoản: ");
		int numberAccount = Integer.parseInt(sc.nextLine());
		return numberAccount;
	}

	public static int layDoiTuong(int code) {
		int doiTuong = code/100000;
		return doiTuong;
	}
	
	public static float phiXuLyHoaDon(int code) {
		int doiTuong = layDoiTuong(code);
		float fee;
		if (doiTuong == 1) {
			fee = INDIVIDUAL_BILL_PROCESSING_FEE;
		} else {
			fee = BUSINES_INVOICE_PROCESSING_FEE;
		}
		return fee;
	}

	public static float phiDichVuCoBan(int code, int accountNumber) {
		int doiTuong = layDoiTuong(code);
		int soDau = soDauNoi(accountNumber);
		float fee;
		if (doiTuong == 1) {
			fee = BASIC_SERVICE_CHARGE_INDIVIDUAL * soDau;
		} else {
			if (soDau <= 10) {
				fee = BUSINES_BASIC_SERVICE_FEE_10 * soDau;
			} else {
				fee = BUSINES_BASIC_SERVICE_FEE_10 + (soDau - 10) * BUSINES_BASIC_SERVICE_FEE_UPPER;
			}
		}
		return fee;
	}

	public static float phiCaoCap(int code, int accountNumber) {
		int doiTuong = layDoiTuong(code);
		float fee;
		int soKenh = soKenh(accountNumber);
		if (doiTuong == 1) {
			fee = PERSONAL_PREMIUM_CHANNEL_RENTAL * soKenh;
		} else {
			fee = ENTERPRISE_PREMIUM_CHANNEL_RENTAL * soKenh;
		}
		return fee;
	}

	public static int soKenh(int accountNumber) {
		int channel = accountNumber / 100000;
		return channel;
	}

	public static int soDauNoi(int accountNumber) {
		int soDau = (accountNumber % 100000) / 1000;
		return soDau;
	}

	public static float tinhTien(int code, int accountNumber) {
		float feeHoaDon = phiXuLyHoaDon(code);
		float feeCoBan = phiDichVuCoBan(code,accountNumber);
		float feeCaoCap = phiCaoCap(code,accountNumber);
		float sum = feeHoaDon + feeCoBan + feeCaoCap;
		return sum;
	}

}
