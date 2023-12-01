/*
 * Mục đích: Quản lý đơn theo ngày
 * Người tạo: TmQ
 * Ngày tạo: 6/9/2021
 * Version: 1.0.0
 */
package QuanLyKhachSan;

import java.util.Scanner;

public class ThueTheoNgay extends QuanLyKhachSan {

	// 1 Attributes
	protected float soNgayThue;

	// 2 Get,set
	public float getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(float soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	// 3 Constructor
	public ThueTheoNgay() {
		super();
	}

	public ThueTheoNgay(int maHD, String ngayHD, String tenKH, int maPhong, float donGia, float soNgayThue) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	// 4 Input,output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Số ngày thuê: ");
		this.soNgayThue = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số ngày thuê: " + soNgayThue + "\t Thành tiền: " + thanhTien);
	}

	// 5 Business method
	@Override
	public void tinhTien() {
		this.thanhTien = donGia * soNgayThue;
	}

}
