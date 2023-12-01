
public class GiaoVien extends ToanTruong {

	// 1 Attributes
	private String namBatDauDay;
	private int chuyenMon;

	// 2 Get,set
	public String getNamBatDauDay() {
		return namBatDauDay;
	}

	public void setNamBatDauDay(String namBatDauDay) {
		this.namBatDauDay = namBatDauDay;
	}

	public int getChuyenMon() {
		return chuyenMon;
	}

	public void setChuyenMon(int chuyenMon) {
		this.chuyenMon = chuyenMon;
	}

	public GiaoVien() {
		// TODO Auto-generated constructor stub
	}

	public GiaoVien(String hoTen, String namSinh, String diaChi) {
		super(hoTen, namSinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void xuat() {
		String temp;
		if (chuyenMon == 1) {
			temp = "Tự nhiên";
		} else {
			temp = "Xã hội";
		}
		super.xuat();
		System.out.println("\t Năm dạy: " + namBatDauDay + "\t Chuyên môn: " + temp);
	}

}
