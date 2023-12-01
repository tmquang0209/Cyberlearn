import java.util.ArrayList;

public class PhongBan implements NhapXuat {

	// 1 Attributes
	private String tenPhong;
	private String maPhong;
	private TruongPhong truongPhong;
	private ArrayList<NhanVienThuong> danhSachNV;

	// 2 get,set
	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	public ArrayList<NhanVienThuong> getDanhSachNV() {
		return danhSachNV;
	}

	public void setDanhSachNV(ArrayList<NhanVienThuong> danhSachNV) {
		this.danhSachNV = danhSachNV;
	}

	// 3 Constructor
	public PhongBan() {
		this.truongPhong = null;
		this.danhSachNV = new ArrayList<NhanVienThuong>();

	}

	public PhongBan(String tenPhong, String maPhong) {
		super();
		this.tenPhong = tenPhong;
		this.maPhong = maPhong;
		this.danhSachNV = new ArrayList<NhanVienThuong>();
	}

	// 4 Input,output
	@Override
	public void xuat() {
		System.out.println("********** Thông tin phòng ban **********");
		System.out.println("Tên: " + tenPhong + " Mã: " + maPhong);
		if (truongPhong != null) {
			System.out.println("Đây là thông tin trưởng phòng");
			this.truongPhong.xuat();
		} else {
			System.out.println("Phòng ban chưa có trưởng phòng");
		}
		for (NhanVienThuong nvt : this.danhSachNV) {
			nvt.xuat();
		}
		System.out.println("========== End ==========");
	}

	// 5 Business method

}
