import java.util.Scanner;

/*
 * Mục đích: quản lý chuyến xe nội thành
 */
public class ChuyenXeNoiThanh extends ChuyenXe {

	// 1 Attributes
	protected String soTuyen;
	protected float soKM;

	// 2 Get,set
	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getSoKM() {
		return soKM;
	}

	public void setSoKM(float soKM) {
		this.soKM = soKM;
	}

	// 3 Constructor
	public ChuyenXeNoiThanh() {
		super();
	}

	public ChuyenXeNoiThanh(int maSo, String hoTen, String soXe, float doanhThu, String soTuyen, float soKM) {
		super(maSo, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}

	// 4 Input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Số tuyến ");
		this.soTuyen = scan.nextLine();
		System.out.print("Số KM ");
		this.soKM = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số tuyến " + soTuyen + "\t Số KM " + soKM);
	}
	// 5 Business methods

}
