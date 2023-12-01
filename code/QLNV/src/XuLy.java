import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CongTy listNVCTY = new CongTy();
		listNVCTY.nhap();
		doMenu(scan, listNVCTY);

	}

	private static void printMenu() {
		System.out.println("1. Thêm nhân viên");
		System.out.println("2. Xuất danh sách nhân viên");
		System.out.println("3. Tính tổng tiền lương nhân viên");
		System.out.println("4. Xuất nhân viên có lương cao nhất");
		System.out.println("0. Thoát");
	}

	private static void doMenu(Scanner scan, CongTy congTy) {
		boolean selected = true;
		do {
			printMenu();
			System.out.print(">>");
			int luaChon = Integer.parseInt(scan.nextLine());
			switch (luaChon) {
			case 1:
				NhanVien nv = new NhanVien();
				nv.nhap(scan);
				congTy.them(nv);
				break;
			case 2:
				congTy.tinhLuong();
				congTy.xuatTheoFormat(congTy.getListNVCongTy().getList());
				break;
			case 3:
				System.out.println("Tổng tiền lương của nhân viên là: " + congTy.tongLuong());
				break;
			case 4:
				ArrayList<NhanVien> nvLuongCaoNhat = congTy.lietKeNVCoLuongCaoNhat();
				congTy.xuatTheoFormat(nvLuongCaoNhat);
				break;
			}
		} while (selected);

	}

}
