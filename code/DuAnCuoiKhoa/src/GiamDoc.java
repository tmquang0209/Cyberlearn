import java.util.Scanner;

public class GiamDoc extends NhanSu {

	final int LUONG_NGAY = 300;

	// 1 Attributes
	private float coPhan;
	private float thuNhap;

	// 2 get,set
	public float getCoPhan() {
		return coPhan;
	}

	public void setCoPhan(float coPhan) {
		this.coPhan = coPhan;
	}

	public float getThuNhap() {
		return thuNhap;
	}

	// 3 Constructor
	public GiamDoc() {
		super();
	}

	public GiamDoc(int maSo, String hoTen, String soDienThoai, float soNgayLamViec, float coPhan) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.coPhan = coPhan;
	}

	// 4 Input,output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		do {
			System.out.print("Cổ phần: ");
			this.coPhan = Float.parseFloat(scan.nextLine());
		} while (coPhan > 100 || coPhan < 0);
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Cổ phần: " + coPhan + "\t Lương: " + luong);
	}

	// 5 Business method
	@Override
	public void tinhLuong() {
		this.luong = LUONG_NGAY * soNgayLamViec;
	}

}
