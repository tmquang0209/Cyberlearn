package QuanLyKhachSan;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		DanhSachHoaDon objHoaDon = new DanhSachHoaDon();
		objHoaDon.dummyData();
		objHoaDon.nhap(scan);
		objHoaDon.tinhTien();
		objHoaDon.xuat();

	}

}
