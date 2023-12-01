import java.util.Scanner;

public class Employee extends Person {

	// 1 Attributes
	/*
	 * + soNgayLamViec : float + luongTheoNgay
	 */
	private float soNgayLamViec;
	private float luongTheoNgay;

	// 2 Get,set
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuongTheoNgay() {
		return luongTheoNgay;
	}

	public void setLuongTheoNgay(float luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}

	// 3 Constructor
	public Employee() {
		super();
	}

	public Employee(int ma, String hoTen, String diaChi, String email, float soNgayLamViec, float luongTheoNgay) {
		super(ma, hoTen, diaChi, email);
		this.soNgayLamViec = soNgayLamViec;
		this.luongTheoNgay = luongTheoNgay;
	}

	// 4 Input,output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Số ngày làm việc: ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.print("Lương theo ngày: ");
		this.luongTheoNgay = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số ngày làm việc: " + soNgayLamViec + "\t Lương theo ngày: " + luongTheoNgay);
	}
	// 5 Business method

}
