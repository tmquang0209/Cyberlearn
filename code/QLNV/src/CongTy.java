import java.util.ArrayList;

public class CongTy {

	// 1. Attributes
	private DanhSachNhanVien listNVCongTy;

	// 2. Get,set methods
	public DanhSachNhanVien getListNVCongTy() {
		return listNVCongTy;
	}

	public void setListNVCongTy(DanhSachNhanVien listNVCongTy) {
		this.listNVCongTy = listNVCongTy;
	}

	// 3. Constructor
	public CongTy() {
		this.listNVCongTy = new DanhSachNhanVien();
	}

	// 4. Input,output
	public void nhap() {
		// ID-Ten-NgaySinh-DiaChi-Luong co ban-He so luong
		NhanVien nv = new NhanVien(1, "Quang", "02/09/2003", "Vĩnh Phúc", 4, 1.2f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(2, "Quang", "12/09/2003", "Long An", 2, 1.2f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(3, "Yến", "15/06/1999", "Bình Dương", 3.2f, 1.5f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(4, "Bình", "23/08/1965", "Hà Nội", 4.5f, 0.9f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(5, "Nhật", "01/02/1998", "Bắc Ninh", 4.3f, 1.0f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(6, "Hưng", "05/03/2000", "Bắc Giang", 4.2f, 1.7f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(7, "Hùng", "25/09/2001", "Phú Thọ", 3.6f, 1.1f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(8, "Minh", "31/8/1995", "Hòa Bình", 4, 1.9f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(9, "Lan", "09/09/1996", "Sơn La", 2.9f, 1.6f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(10, "Anh", "01/12/1993", "Nghệ An", 3.9f, 1.5f);
		this.listNVCongTy.themNhanVien(nv);

		nv = new NhanVien(11, "Trường", "02/02/1990", "TP.HCM", 4.6f, 1.3f);
		this.listNVCongTy.themNhanVien(nv);

	}

	public void them(NhanVien nv) {
		this.listNVCongTy.themNhanVien(nv);
	}

	public void xuat() {
		this.listNVCongTy.xuat();
	}

	// 5. Business methods
	public void tinhLuong() {
		this.listNVCongTy.tinhLuong();
	}

	public float tongLuong() {
		return this.listNVCongTy.tinhTongTienLuong();
	}

	public ArrayList<NhanVien> lietKeNVCoLuongCaoNhat() {
		return this.listNVCongTy.nhanVienCoLuongCaoNhat();
	}

	public void xuatHelper(ArrayList<NhanVien> list) {
		for (NhanVien nv : list) {
			nv.xuat();
		}
	}

	private void xuatLine() {
		System.out.println(
				"=====================================================================================================================");
	}

	private String formatCell(String paddLeft, String title, String paddRight) {
		return String.format(paddLeft, " ") + title + String.format(paddRight, " ");
	}

	private void xuatHeader() {
		String paddString = "%1s";
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";

		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1) + "|";
		text += formatCell(paddString2, "Mã NV", paddString2) + "|";
		text += formatCell(paddString3, "Tên NV", paddString2) + "|";
		text += formatCell(paddString1, "Ngày sinh", paddString1) + "|";
		text += formatCell(paddString2, "Địa chỉ", paddString2) + "|";
		text += formatCell(paddString, "Lương CBan", paddString) + "|";
		text += formatCell(paddString, "HSo Lương", paddString1) + "|";
		text += formatCell(paddString2, "Lương", paddString3) + "||";
		System.out.println(text);
		xuatLine();

	}

	private void xuatCellThuTu(int i) {
		String paddLeft = "%3s";
		String paddRight = "%-6s";
		String text;
		text = "||" + String.format(paddLeft, " ") + String.format(paddRight, "" + i) + "|";
		System.out.print(text);
	}

	public void xuatTheoFormat(ArrayList<NhanVien> list) {
		xuatHeader();
		int i = 1;
		for (NhanVien nv : list) {
			xuatCellThuTu(i++);
			nv.xuatRowFormat();
		}
		xuatLine();
		System.out.println("Đơn vị tiền: triệu VNĐ");
	}

}
