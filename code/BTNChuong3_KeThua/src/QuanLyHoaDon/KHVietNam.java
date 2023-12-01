/*
 * Mục đích: superclass quản lý KHVN
 * Người tạo: TmQ
 * Ngày tạo: 05/09/2021
 * Version: 1.0.0
 */
package QuanLyHoaDon;

import java.util.Scanner;

public class KHVietNam extends HoaDonDien {
	// 1. Attributes
	private int intDoiTuongKH;
	private String doiTuongKH;
	private float soLuong;
	private float dinhMuc;

	// 2. Get,set

	public int getIntDoiTuongKH() {
		return intDoiTuongKH;
	}

	public void setIntDoiTuongKH(int intDoiTuongKH) {
		this.intDoiTuongKH = intDoiTuongKH;
	}

	public String getDoiTuongKH() {
		return doiTuongKH;
	}

	public void setDoiTuongKH(String doiTuongKH) {
		this.doiTuongKH = doiTuongKH;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	public float getDinhMuc() {
		return dinhMuc;
	}

	public void setDinhMuc(float dinhMuc) {
		this.dinhMuc = dinhMuc;
	}

	// 3. Constructor
	public KHVietNam() {
		// TODO Auto-generated constructor stub
	}

	public KHVietNam(int maKH, String hoTen, String ngayRaHoaDon, float donGia, int intDoiTuongKH,float soLuong, float dinhMuc) {
		super(maKH, hoTen, ngayRaHoaDon, donGia);
		this.intDoiTuongKH = intDoiTuongKH;
		this.soLuong = soLuong;
		this.dinhMuc = dinhMuc;
	}

	// 4. Input,output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("1. KH Sinh hoạt \t 2. KH Kinh doanh \t 3. KH Sản Xuất");
		System.out.print("Nhập đối tượng KH: ");
		intDoiTuongKH = Integer.parseInt(scan.nextLine());
		System.out.print("Số lượng: ");
		soLuong = Float.parseFloat(scan.nextLine());
		System.out.print("Định mức: ");
		dinhMuc = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		switch (intDoiTuongKH) {
		case 1:
			this.doiTuongKH = "Sinh Hoạt";
			break;
		case 2:
			this.doiTuongKH = "Kinh Doanh";
			break;
		case 3:
			this.doiTuongKH = "Sản Xuất";
			break;
		}

		super.xuat();
		System.out.println("\t Đối tượng KH: " + doiTuongKH + "\t Số lượng: " + soLuong + "\t Định mức: " + dinhMuc
				+ "\t Thành tiền: " + thanhTien);
	}
	// 5. Business methods
	public void tinhTien() {
		if (soLuong < dinhMuc) {
			thanhTien = soLuong * donGia;
		} else {
			thanhTien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5f;
		}
	}

}
