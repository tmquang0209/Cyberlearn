import java.util.ArrayList;

public abstract class NhanSu implements NhapXuat {

	// 1 Attributes
	protected String ma;
	protected String ten;
	protected String namSinh;
	protected String email;
	protected String soDienThoai;
	protected String maPhongBan;
	protected DanhSachTask task;
	protected float luong;
	protected float soNgayLamViec;

	// 2 Get,set
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public DanhSachTask getTask() {
		return task;
	}

	public void setTask(DanhSachTask task) {
		this.task = task;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public float getLuong() {
		return luong;
	}

	// 3 Constructor
	private void init() {
		this.maPhongBan = "-1";
		this.task = new DanhSachTask();
	}

	public NhanSu() {
		init();
	}

	public NhanSu(String ma, String ten, String namSinh, String email, String soDienThoai) {
		init();
		this.ma = ma;
		this.ten = ten;
		this.namSinh = namSinh;
		this.email = email;
		this.soDienThoai = soDienThoai;

	}

	public NhanSu(String ma, String ten, String namSinh, String email, String soDienThoai, String maPhongBan,
			float soNgayLamViec) {
		init();
		this.ma = ma;
		this.ten = ten;
		this.namSinh = namSinh;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.maPhongBan = maPhongBan;
		this.soNgayLamViec = soNgayLamViec;
	}

	// 4 Input,output
	public void xuat() {
		String temp = null;
		if (maPhongBan.equalsIgnoreCase("-1")) {
			temp = "Chưa phân bổ";
		} else {
			temp = "" + maPhongBan + "";
		}
		System.out.println("Mã: " + ma + "\t Tên: " + ten + "\t Năm sinh: " + namSinh + "\t Email: " + email
				+ "\t SDT: " + soDienThoai + "\t Mã phòng ban: " + temp + "\t Số ngày làm việc: " + soNgayLamViec
				+ "\t Lương: " + luong);

		if (task.getDsTask().size() > 0) {
			System.out.println("Task Nhân sự đang thực hiện: ");
			task.xuat();
		}
	}

	// 5 Business method
	public abstract void tinhLuong();

}
