import java.util.Scanner;

/*
 * Tên Chương trình: tính điểm tốt nghiệp
 * Ngày tạo: 11/08/2021
 */
public class Bai1 {
	final static float DIEM_KHU_VUC_A = 2;
	final static float DIEM_KHU_VUC_B = 1;
	final static float DIEM_KHU_VUC_C = 0.5f;

	final static float DIEM_DOI_TUONG_1 = 2.5f;
	final static float DIEM_DOI_TUONG_2 = 2.5f;
	final static float DIEM_DOI_TUONG_3 = 1;

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float diemChuan = nhapDiemChuan(sc);
		float diem1 = nhapDiemMon1(sc);
		float diem2 = nhapDiemMon2(sc);
		float diem3 = nhapDiemMon3(sc);
		char khuVuc = nhapKhuVuc(sc).charAt(0);
		int doiTuong = nhapDoiTuong(sc);
		System.out.println(khuVuc);
		xetDiem(diemChuan, diem1, diem2, diem3, khuVuc, doiTuong);

	}

	public static float nhapDiemChuan(Scanner sc) {
		System.out.print("Nhập điểm chuẩn:");
		float diem = Float.parseFloat(sc.nextLine());
		return diem;
	}

	public static float nhapDiemMon1(Scanner sc) {
		System.out.print("Nhập điểm môn 1:");
		float diem = Float.parseFloat(sc.nextLine());
		return diem;
	}

	public static float nhapDiemMon2(Scanner sc) {
		System.out.print("Nhập điểm môn 2:");
		float diem = Float.parseFloat(sc.nextLine());
		return diem;
	}

	public static float nhapDiemMon3(Scanner sc) {
		System.out.print("Nhập điểm môn 3:");
		float diem = Float.parseFloat(sc.nextLine());
		return diem;
	}

	public static String nhapKhuVuc(Scanner sc) {
		System.out.print("Nhập khu vực:");
		String khuVuc = sc.nextLine();
		return khuVuc;
	}

	public static int nhapDoiTuong(Scanner sc) {
		System.out.print("Nhập đối tượng:");
		int doiTuong = Integer.parseInt(sc.nextLine());
		return doiTuong;
	}

	public static float xetDiemKhuVuc(char khuVuc) {
		float diem = 0;
		if (khuVuc == 'A') {
			diem = DIEM_KHU_VUC_A;
		} else if (khuVuc == 'B') {
			diem = DIEM_KHU_VUC_B;
		} else if (khuVuc == 'C') {
			diem = DIEM_KHU_VUC_C;
		}
		return diem;
	}

	public static float diemDoiTuong(int doiTuong) {
		float diem = 0;
		if (doiTuong == 1) {
			diem = DIEM_DOI_TUONG_1;
		} else if (doiTuong == 2) {
			diem = DIEM_DOI_TUONG_2;
		} else if (doiTuong == 3) {
			diem = DIEM_DOI_TUONG_3;
		}
		return diem;
	}

	public static float diemTongKet(float diem1, float diem2, float diem3, char khuVuc, int doiTuong) {
		float tongDiem;
		tongDiem = diem1 + diem2 + diem3;
		tongDiem += diemDoiTuong(doiTuong);
		tongDiem += xetDiemKhuVuc(khuVuc);
		return tongDiem;
	}

	public static void xetDiem(float diemChuan, float diem1, float diem2, float diem3, char khuVuc, int doiTuong) {
		float diemCuaBan = diemTongKet(diem1, diem2, diem3, khuVuc, doiTuong);
		System.out.println("Điểm của bạn là: " + diemCuaBan);
		if (diemCuaBan >= diemChuan) {
			System.out.println("Bạn đã đỗ");
		} else {
			System.out.println("Bạn đã trượt");
		}
	}
}
