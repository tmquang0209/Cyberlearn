import java.util.Scanner;

public class SinhVien {

	private String ten;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public SinhVien() {

	}

	public SinhVien(String ten, int maSV, float diemToan, float diemLy, float diemHoa) {
		super();
		this.ten = ten;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public void nhap(Scanner scan) {
		System.out.print("Nhập tên: ");
		this.ten = scan.nextLine();
		System.out.print("Nhập mã sinh viên: ");
		this.maSV = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập điểm toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm lý: ");
		this.diemLy = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm hóa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("Mã SV #" + maSV + "- Tên : " + ten + "\t Điểm toán: " + diemToan + "\t Điểm lý: " + diemLy
				+ "\t Điểm hóa: " + diemHoa + "\t Điểm TB: " + diemTB + "\t Xếp Loại: " + xepLoai);
	}

	public void tinhDiemTB() {
		this.diemTB = (diemToan + diemLy + diemHoa) / 3;
	}

	public void xepLoai() {
		if (diemTB >= 9) {
			xepLoai = "Xuất sắc";
		} else if (diemTB >= 8) {
			xepLoai = "Giỏi";
		} else if (diemTB >= 7) {
			xepLoai = "Khá";
		} else if (diemTB >= 6) {
			xepLoai = "TB-Khá";
		} else if (diemTB >= 5) {
			xepLoai = "TB";
		} else {
			xepLoai = "Yếu";
		}
	}

	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-8s";
		return String.format(paddLeft, " ") + String.format(paddRight, num) + "|";
	}

	private String formaTextCell(String text) {
		String paddLeft = "%-15s";
		return String.format(paddLeft, " " + text);
	}

	public void xuatRowFormat() {
		String text;
		double dtb = Math.round(this.diemTB * 100.0) / 100.0;

		text = formatNumCell(this.maSV);
		text += formaTextCell(this.ten) + "|";
		text += formatNumCell(this.diemToan) + "|";
		text += formatNumCell(this.diemLy) + "|";
		text += formatNumCell(this.diemHoa) + "|";
		text += formatNumCell(dtb) + "|";
		text += formaTextCell(this.xepLoai) + "||";
		System.out.println(text);

	}

}
