import java.util.Scanner;

public class Customer extends Person {

	// 1 Attributes
	/*
	 * + tenCTy : String + giaTriHoaDon : float + danhGia : String
	 */
	private String tenCTy;
	private float giaTriHoaDon;
	private String danhGia;

	// 2 Get,set
	public String getTenCTy() {
		return tenCTy;
	}

	public void setTenCTy(String tenCTy) {
		this.tenCTy = tenCTy;
	}

	public float getGiaTriHoaDon() {
		return giaTriHoaDon;
	}

	public void setGiaTriHoaDon(float giaTriHoaDon) {
		this.giaTriHoaDon = giaTriHoaDon;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	// 3 Constructor
	public Customer() {
		super();
	}

	public Customer(int ma, String hoTen, String diaChi, String email, String tenCTy, float giaTriHoaDon,
			String danhGia) {
		super(ma, hoTen, diaChi, email);
		this.tenCTy = tenCTy;
		this.giaTriHoaDon = giaTriHoaDon;
		this.danhGia = danhGia;
	}

	// 4 Input,ouput
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Tên công ty: ");
		this.tenCTy = scan.nextLine();
		System.out.println("Giá trị hóa đơn: ");
		this.giaTriHoaDon = Float.parseFloat(scan.nextLine());
		System.out.println("Đánh giá: ");
		this.danhGia = scan.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Tên CTY: " + tenCTy + "\t Giá trị hóa đơn: " + giaTriHoaDon + "\t Đánh giá: " + danhGia);
	}
	// 5 Business methods

}
