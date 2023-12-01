package QuanLyNhaDat;

import java.util.Scanner;

public class QuanLyNhaDat {

	// 1 Attributes
	protected int maGD;
	protected String ngayGD;
	protected float donGia;
	protected float dienTich;
	protected float thanhTien;

	// 2 Get,set
	public int getMaGD() {
		return maGD;
	}

	public void setMaGD(int maGD) {
		this.maGD = maGD;
	}

	public String getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// 3 Constructor
	public QuanLyNhaDat() {

	}

	public QuanLyNhaDat(int maGD, String ngayGD, float donGia, float dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}

	// 4 Input,output
	public void nhap(Scanner scan) {
		System.out.print("Mã giao dịch: ");
		this.maGD = Integer.parseInt(scan.nextLine());
		System.out.print("Ngày giao dịch: ");
		this.ngayGD = scan.nextLine();
		System.out.print("Đơn giá: ");
		this.donGia = Float.parseFloat(scan.nextLine());
		System.out.print("Diện tích: ");
		this.dienTich = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.print(
				"Mã GD: " + maGD + "\t Ngày GD: " + ngayGD + "\t Đơn giá: " + donGia + "\t Diện tích: " + dienTich);
	}

	// 5 Business methods
	public void tinhTien() {
		this.thanhTien = 0;
	}
}
