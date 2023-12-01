/*
 * Mục đích: superclass quản lý KH
 * Người tạo: TmQ
 * Ngày tạo: 05/09/2021
 * Version: 1.0.0
 */
package QuanLyHoaDon;

import java.util.Scanner;

public class HoaDonDien {
	// 1. Attributes
	/*
	 * + maKH:int + hoTen:String + ngayRaHoaDon:String + donGia:float
	 */
	protected int maKH;
	protected String hoTen;
	protected String ngayRaHoaDon;
	protected float donGia;
	protected float thanhTien;

	// 2. Get,set

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgayRaHoaDon() {
		return ngayRaHoaDon;
	}

	public void setNgayRaHoaDon(String ngayRaHoaDon) {
		this.ngayRaHoaDon = ngayRaHoaDon;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// 3. Constructor
	public HoaDonDien() {

	}

	public HoaDonDien(int maKH, String hoTen, String ngayRaHoaDon, float donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayRaHoaDon = ngayRaHoaDon;
		this.donGia = donGia;
	}

	// 4. Input,output
	public void nhap(Scanner scan) {
		System.out.print("Mã KH: ");
		this.maKH = Integer.parseInt(scan.nextLine());
		System.out.print("Họ tên: ");
		this.hoTen = scan.nextLine();
		System.out.print("Ngày ra hóa đơn (ngày/tháng/năm): ");
		this.ngayRaHoaDon = scan.nextLine();
		System.out.print("Đơn giá: ");
		this.donGia = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.print("Mã KH: " + maKH + "\t Họ tên: " + hoTen + "\t Ngày ra hóa đơn: " + ngayRaHoaDon
				+ "\t Đơn giá: " + donGia);
	}
	// 5. Business methods
	public void tinhTien() {
		this.thanhTien = 0;
	}

}
