
public class NhanVienThuong extends NhanSu {

	final int LUONG_NGAY = 200;
	final int PHU_CAP_1 = 300;
	final int PHU_CAP_2 = 1000;

	public NhanVienThuong() {
		super();
	}

	public NhanVienThuong(String ma, String ten, String namSinh, String email, String soDienThoai) {
		super(ma, ten, namSinh, email, soDienThoai);
	}

	public NhanVienThuong(String ma, String ten, String namSinh, String email, String soDienThoai, String maPhongBan,
			float soNgayLamViec) {
		super(ma, ten, namSinh, email, soDienThoai, maPhongBan, soNgayLamViec);
	}

	@Override
	public void tinhLuong() {
		if (soNgayLamViec > 1.5f) {
			this.luong = soNgayLamViec * LUONG_NGAY + PHU_CAP_1;
		} else {
			this.luong = soNgayLamViec * LUONG_NGAY + PHU_CAP_2;
		}
	}

}
