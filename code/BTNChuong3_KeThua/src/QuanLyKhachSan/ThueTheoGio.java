/*
 * Mục đích: Quản lý đơn thuê theo giờ
 * Người tạo: TmQ
 * Ngày tạo: 6/9/2021
 * Version: 1.0.0
 */
package QuanLyKhachSan;

import java.util.Scanner;

public class ThueTheoGio extends QuanLyKhachSan {

	// 1 Attributes
	private float soGioThue;

	// 2 Get,set
	public float getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(float soGioThue) {
		this.soGioThue = soGioThue;
	}

	// 3 Constructor
	public ThueTheoGio() {
		super();
	}

	public ThueTheoGio(int maHD, String ngayHD, String tenKH, int maPhong, float donGia, float soGioThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soGioThue = soGioThue;
	}

	// 4 Input, output
	@Override
	public void nhap(Scanner scan) {
		do {
			super.nhap(scan);
			System.out.print("Số giờ thuê");
			soGioThue = Float.parseFloat(scan.nextLine());
		} while (soGioThue >= 30);
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số giờ thuê: " + soGioThue + "\t Thành tiền: " + thanhTien);
	}

	// 5 Business method
	@Override
	public void tinhTien() {
		if (soGioThue > 24 && soGioThue < 30) {
			thanhTien = 24 * donGia;
		} else {
			thanhTien = soGioThue * donGia;
		}
	}

}
