import java.util.Scanner;

public class NhanVien {

	// 1. Attributes
	private int maNV;
	private String hoTen;
	private String ngaySinh;
	private String diaChi;
	private float luongNhanVien;
	private float luongCoBan;
	private float heSoLuong;
	// 2. Get,set methods

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getLuongNhanVien() {
		return luongNhanVien;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	// 3. Constructor
	public NhanVien() {

	}

	public NhanVien(int ma, String ten, String ngaySinh, String diaChi, float luongCoBan, float heSoLuong) {
		this.maNV = ma;
		this.hoTen = ten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
	}

	// 4. Input,output
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã nhân viên: ");
		this.maNV = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập tên nhân viên: ");
		this.hoTen = scan.nextLine();

		System.out.print("Nhập ngày sinh: ");
		this.ngaySinh = scan.nextLine();

		System.out.print("Nhập địa chỉ: ");
		this.diaChi = scan.nextLine();

		System.out.print("Nhập lương cơ bản: ");
		this.luongCoBan = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập hệ số lương: ");
		this.heSoLuong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Mã NV #" + maNV + "\t Tên nhân viên: " + hoTen + "\t Ngày sinh: " + ngaySinh
				+ "\t Địa chỉ: " + diaChi + "\t Hệ số lương: " + heSoLuong + "\t Lương cơ bản: " + luongCoBan
				+ "\t Lương nhân viên: " + luongNhanVien);
	}

	// 5. Business methods
	public void tinhLuong() {
		this.luongNhanVien = heSoLuong * luongCoBan;
	}

	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, " ") + String.format(paddRight, num) + "|";
	}

	private String formaTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}

	public void xuatRowFormat() {
		String text;
		double lnv = Math.round(this.luongNhanVien * 100.0) / 100.0;

		text = formatNumCell(this.maNV);
		
		text += formaTextCell(this.hoTen) + "|";
		
		text += formaTextCell(this.ngaySinh) + "|";
		
		text += formaTextCell(this.diaChi) + "|";
		
		text += formatNumCell(this.luongCoBan) + "";
		
		text += formatNumCell(this.heSoLuong) + "";
		
		text += formatNumCell(lnv) + "|";
		
		System.out.println(text);

	}

}
