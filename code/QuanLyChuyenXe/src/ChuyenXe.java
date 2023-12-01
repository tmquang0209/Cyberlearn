
/*
 * Mục đích: superclass quản lý chuyến xe
 * Người tạo: TmQ
 * Ngày tạo: 4/9/2021
 * Version: 1.0.0
 */
import java.util.Scanner;

public class ChuyenXe {

	// 1. Attributes
	protected int maSo;
	protected String hoTen;
	protected String soXe;
	protected float doanhThu;

	// 2. get,set methods
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getMaSo() {
		return maSo;
	}

	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public float getDoanhThu() {
		return doanhThu;
	}

	// 3. constructor
	public ChuyenXe() {

	}

	public ChuyenXe(int maSo, String hoTen, String soXe, float doanhThu) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	// 4. input, output
	public void nhap(Scanner scan) {
		System.out.print("Mã số xe: ");
		this.maSo = Integer.parseInt(scan.nextLine());
		System.out.print("Họ tên lái xe: ");
		this.hoTen = scan.nextLine();
		System.out.print("Số xe: ");
		this.soXe = scan.nextLine();
		System.out.print("Doanh thu: ");
		this.doanhThu = Float.parseFloat(scan.nextLine());

	}

	public void xuat() {
		System.out.print("Mã số chuyến " + this.maSo + " - Họ tên tài xế " + this.hoTen + " - Số xe " + this.soXe
				+ " - Doanh thu " + this.doanhThu);
	}
	// 5. business methods

}
