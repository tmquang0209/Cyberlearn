import java.util.Scanner;

public class TruongPhong extends NhanSu {
	final int LUONG_NGAY = 200;
	final int PHU_CAP = 100;

	// 1 Attributes
	private int soNhanVienDuoiQuyen;

	// 2 Get,set methods
	public int getSoNhanVienDuoiQuyen() {
		return soNhanVienDuoiQuyen;
	}

	public void setSoNhanVienDuoiQuyen(int soNhanVienDuoiQuyen) {
		this.soNhanVienDuoiQuyen = soNhanVienDuoiQuyen;
	}

	// 3 Constructor
	public TruongPhong() {
		super();
		this.soNhanVienDuoiQuyen = 0;
	}

	public TruongPhong(int maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		this.soNhanVienDuoiQuyen = 0;
	}

	// 4 Input,output
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số nhân viên dưới quyền: " + soNhanVienDuoiQuyen + "\t Lương: " + luong);
	}

	// 5 Business methods
	@Override
	public void tinhLuong() {
		this.luong = LUONG_NGAY * this.soNgayLamViec + PHU_CAP * soNhanVienDuoiQuyen;
	}

	public void tangNhanVien() {
		this.soNhanVienDuoiQuyen++;
	}
	
	public void giamNhanVien() {
		this.soNhanVienDuoiQuyen--;
	}

}
