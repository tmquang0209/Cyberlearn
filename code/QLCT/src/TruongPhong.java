
public class TruongPhong extends NhanSu {

	public TruongPhong() {
		super();
	}

	public TruongPhong(String ma, String ten, String namSinh, String email, String soDienThoai) {
		super(ma, ten, namSinh, email, soDienThoai);
	}

	public TruongPhong(String ma, String ten, String namSinh, String email, String soDienThoai, String maPhongBan,
			float soNgayLamViec) {
		super(ma, ten, namSinh, email, soDienThoai, maPhongBan, soNgayLamViec);
	}

	@Override
	public void tinhLuong() {

	}

}
