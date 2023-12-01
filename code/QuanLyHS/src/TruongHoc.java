
/*
 * Mục đích: quản lý toàn bộ nghiệp vụ cho trường học
 * Người tạo: TmQ
 * Ngày tạo: 31/08/2021
 * Version: 1.0.0
 */
import java.util.ArrayList;

public class TruongHoc {

	// 1. Attributes
	private DanhSachSinhVien dssvToanTruong;

	// 2. Get,set methods
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}

	// 3. Constructor
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSinhVien();
	}

	// 4. Input,output
	public void nhap() {
		SinhVien sv = new SinhVien("Lan", 1, 9.2f, 9, 9);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Hùng", 2, 4.2f, 4, 5.3f);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Hưng", 3, 7.2f, 6, 8f);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Yến", 4, 4.2f, 4.5f, 6);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Toàn", 5, 7.2f, 6, 8f);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Minh", 6, 7f, 6, 7f);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Thành", 7, 4, 4.3f, 5);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Trung", 8, 9.2f, 9, 9);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Quyền", 9, 7.2f, 7, 8);
		this.dssvToanTruong.them(sv);

		sv = new SinhVien("Quang", 10, 5.4f, 6, 5.5f);
		this.dssvToanTruong.them(sv);

	}

	public void xuat() {
		this.dssvToanTruong.xuat();
	}

	// 5. Business methods
	public void diemTB() {
		this.dssvToanTruong.diemTB();
	}

	public void xepLoai() {
		this.dssvToanTruong.xeploai();
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {
		return this.dssvToanTruong.timDSSVCoDTBCaoNhat();
	}

	public ArrayList<SinhVien> timDSSVYeu() {
		return this.dssvToanTruong.TimDSSVYeu();
	}

	public ArrayList<SinhVien> timTheoTen(String ten) {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for (SinhVien sv : dssvToanTruong.getListSV()) {
			if (sv.getTen().equalsIgnoreCase(ten)) {
				list.add(sv);
			}
		}
		return list;
	}

	public SinhVien timSVTheoMa(int ma) {
		return this.dssvToanTruong.timSVTheoMa(ma);
	}

	public boolean xoaSVTheoMa(int ma) {
		return this.dssvToanTruong.xoaSVTheoMa(ma);
	}

	public void them(SinhVien sv) {
		this.dssvToanTruong.them(sv);
	}

	public void xuatHelper(ArrayList<SinhVien> list) {
		for (SinhVien sv : list) {
			sv.xuat();
		}
	}

	private void xuatLine() {
		System.out.println(
				"=======================================================================================================================");
	}

	private String formatCell(String paddLeft, String title, String paddRight) {
		return String.format(paddLeft, " ") + title + String.format(paddRight, " ");
	}

	private void xuatHeader() {
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";

		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT", paddString1) + "|";
		text += formatCell(paddString2, "Mã SV", paddString2) + "|";
		text += formatCell(paddString3, "Tên SV", paddString2) + "|";
		text += formatCell(paddString3, "Toán", paddString3) + "|";
		text += formatCell(paddString3, "Lý", paddString4) + "|";
		text += formatCell(paddString3, "Hóa", paddString4) + "|";
		text += formatCell(paddString3, "ĐTB", paddString4) + "|";
		text += formatCell(paddString2, "Xếp loại", paddString2) + "||";
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

	public void xuatTheoFormat(ArrayList<SinhVien> list) {
		xuatHeader();
		int i = 1;
		for (SinhVien sv : list) {
			xuatCellThuTu(i++);
			sv.xuatRowFormat();
		}
		xuatLine();
	}

}
