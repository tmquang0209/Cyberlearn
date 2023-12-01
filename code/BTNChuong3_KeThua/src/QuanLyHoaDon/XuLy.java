package QuanLyHoaDon;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DanhSachKH objKhachHang = new DanhSachKH();
		objKhachHang.dummyData();
		objKhachHang.nhap(scan);
		objKhachHang.tinhTien();
		objKhachHang.xuat();
		objKhachHang.tinhTBTien();
		objKhachHang.xuatDonGDT9();

	}

}
