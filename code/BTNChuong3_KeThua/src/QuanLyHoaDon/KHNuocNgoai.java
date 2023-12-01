/*
 * Mục đích: superclass quản lý KHNN
 * Người tạo: TmQ
 * Ngày tạo: 05/09/2021
 * Version: 1.0.0
 */
package QuanLyHoaDon;

import java.util.Scanner;

public class KHNuocNgoai extends HoaDonDien {

	// 1. Attributes
	private String quocTich;
	private float soLuong;

	// 2. Get,set
	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public float getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(float soLuong) {
		this.soLuong = soLuong;
	}

	// 3. Constructor
	public KHNuocNgoai() {
		super();
	}

	public KHNuocNgoai(int maKH, String hoTen, String ngayRaHoaDon, float donGia, String quocTich, float soLuong) {
		super(maKH, hoTen, ngayRaHoaDon, donGia);
		this.quocTich = quocTich;
		this.soLuong = soLuong;
	}

	// 4. Input,output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Quốc tịch: ");
		this.quocTich = scan.nextLine();
		System.out.print("Số lượng");
		this.soLuong = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Quốc tịch: " + quocTich + "\t Thành tiền: " + thanhTien);
	}

	// 5. Business methods
	public void tinhTien() {
		thanhTien = soLuong * donGia;
	}
}
