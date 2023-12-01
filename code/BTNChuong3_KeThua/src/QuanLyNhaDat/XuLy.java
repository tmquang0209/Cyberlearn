/*
 * Mục đích: hiển thị thông tin quản lý nhà đất
 * Người tạo: TmQ
 * Ngày tạo: 5/9/2021
 * Version: 1.0.0
 */
package QuanLyNhaDat;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DanhSachNhaDat objNhaDat = new DanhSachNhaDat();
		Scanner scan = new Scanner(System.in);
		objNhaDat.dummyData();
		objNhaDat.nhap(scan);
		objNhaDat.tinhTien();
		objNhaDat.xuat();
		System.out.println();
		objNhaDat.demSoLuongGDDat();
		objNhaDat.demSoLuongGDNha();
		System.out.println();
		objNhaDat.tinhTrungBinhThanhTien();
		System.out.println();
		objNhaDat.xuatRaCacGDT9();
	}

}
