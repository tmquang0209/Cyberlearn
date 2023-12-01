
public class NhanVienThuong extends NhanSu {

	final int LUONG_NGAY = 100;

	// 1 Attributes
	private TruongPhong truongPhong;

	// 2 get,set
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	// 3 Constructor
	public NhanVienThuong() {
		this.truongPhong = null;
	}

	public NhanVienThuong(int maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
	}

	// 4 Input,output
	@Override
	public void xuat() {
		super.xuat();
		if (this.truongPhong == null) {
			System.out.println("\t Lương: " + luong + "\t Chưa phân bổ");
		} else {
			System.out.println("\t Lương: " + luong + "\t Mã TP:" + this.truongPhong.getMaSo() + "\t Tên TP: "
					+ this.truongPhong.getHoTen());
		}
	}

	public void xuatMaVaTen() {
		System.out.print("Mã số: " + this.maSo + "- Họ tên: " + hoTen);
	}

	// 5 Business method
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY;
	}

}
