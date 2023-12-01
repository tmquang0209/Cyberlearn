import java.util.Scanner;

/*
 * Mục đích: quản lý chuyến xe ngoại thành
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
	// 1 Attributes
	protected String noiDen;
	protected float soNgayDiDuoc;

	// 2 Get,set
	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	// 3 Constructor
	public ChuyenXeNgoaiThanh() {
		super();
	}

	public ChuyenXeNgoaiThanh(int maSo, String hoTen, String soXe, float doanhThu, String noiDen, float soNgayDiDuoc) {
		super(maSo, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	// 4 Input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nơi đến ");
		this.noiDen = scan.nextLine();
		System.out.print("Số ngày đi được ");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Nơi đến " + noiDen + "\t Số ngày đi được " + soNgayDiDuoc);
	}
	// 5. Business methods

}
