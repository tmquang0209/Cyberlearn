import java.util.Scanner;

public class NhanSu {

	// 1 Attributes
	protected int maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;

	// 2 Get,set
	public int getMaSo() {
		return maSo;
	}

	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuong() {
		return this.luong;
	}

	// 3 Constructor
	public NhanSu() {

	}

	public NhanSu(int maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super();
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}

	// 4 Input,output
	public void nhap(Scanner scan) {
		System.out.println("======= Thêm Nhân Sự =======");
		System.out.print("Mã số: ");
		this.maSo = Integer.parseInt(scan.nextLine());
		System.out.print("Họ tên: ");
		this.hoTen = scan.nextLine();
		System.out.print("SDT: ");
		this.soDienThoai = scan.nextLine();
		System.out.print("Số ngày làm việc: ");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.println("======= Kết Thúc =======");
	}

	public void xuat() {
		System.out.print("Mã số: " + maSo + "\t Họ tên: " + hoTen + "\t SDT: " + soDienThoai + "\t Số ngày làm việc: "
				+ soNgayLamViec);
	}

	public void xuatMaVaTen() {
		System.out.println("Mã: " + maSo + "\t Tên: " + hoTen);
	}

	// 5 Business method
	public void tinhLuong() {
		this.luong = 0;
	}

}
