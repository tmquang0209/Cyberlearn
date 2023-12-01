import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		QuanLy sv = new QuanLy();
//		sv.nhap(scan);
//		sv.tinhDiemTB();
//		sv.xepLoai();
//		sv.xuat();

		// DanhSachSinhVien sv = new DanhSachSinhVien();
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong, scan);

	}

	private static void printMenu() {
		System.out.println("1. Thêm Sinh viên");
		System.out.println("2. Xuất danh sách");
		System.out.println("3. Xuất DSSV có điểm TB cao nhất");
		System.out.println("4. Xuất DSSV có điểm TB thấp nhất");
		System.out.println("5. Tìm sinh viên theo tên");
		System.out.println("6. Tìm sinh viên theo mã");
		System.out.println("7. Xóa sinh viên theo mã");
		System.out.println("0. Thoát");
	}

	private static void doMenu(TruongHoc truong, Scanner scan) {
		boolean flag = true;
		do {
			printMenu();
			System.out.print("Mời chọn");
			int value = Integer.parseInt(scan.nextLine());
			switch (value) {
			case 0:
				flag = false;
				break;
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.them(sv);
				break;
			case 2:
				truong.diemTB();
				truong.xepLoai();
				truong.xuatTheoFormat(truong.getDssvToanTruong().getListSV());;
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timDSSVCoDTBCaoNhat();
				truong.xuatTheoFormat(list);
				break;
			case 4:
				ArrayList<SinhVien> listYeu = truong.timDSSVYeu();
				truong.xuatTheoFormat(listYeu);
				break;
			case 5:
				System.out.print("Nhập tên cần tìm: ");
				String ten = scan.nextLine();
				ArrayList<SinhVien> listTen = truong.timTheoTen(ten);
				truong.xuatTheoFormat(listTen);
				break;
			case 6:
				System.out.print("Nhập mã sinh viên cần tìm: ");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien svFound = truong.timSVTheoMa(ma);
				if (svFound != null) {
					svFound.xuat();
				}else {
					System.out.println("Không có sv nào theo mã đã nhập");
				}
				break;
			case 7:
				System.out.print("Nhập mã sinh viên cần xóa: ");
				int ma1 = Integer.parseInt(scan.nextLine());
				boolean svDelete = truong.xoaSVTheoMa(ma1);
				if (svDelete) {
					System.out.println("Đã xóa sinh viên có mã " + ma1);
				}else {
					System.out.println("Không có sv nào theo mã đã nhập");
				}
				break;	
			}
		} while (flag);
	}

}
