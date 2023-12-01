
/*
 * Mục đích: xử lý nghiệp vụ liên quan đến chuyến xe
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachChuyenXe {

	// 1. Attributes
	private ArrayList<ChuyenXe> listChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;

	// 2. Get,set
	public ArrayList<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}

	public void setListChuyenXe(ArrayList<ChuyenXe> listChuyenXe) {
		this.listChuyenXe = listChuyenXe;
	}

	public float getTongDoanhThu() {
		return tongDoanhThu;
	}

	public float getDoanhThuNoi() {
		return doanhThuNoi;
	}

	public float getDoanhThuNgoai() {
		return doanhThuNgoai;
	}

	// 3. Constructor
	public DanhSachChuyenXe() {
		listChuyenXe = new ArrayList<ChuyenXe>();
	}

	// 4. Input, output
	public void nhap(Scanner scan) {
		boolean flag = true;
		ChuyenXe chuyenXe;
		do {
			System.out.println("1. Chuyến xe nội thành");
			System.out.println("2. Chuyến xe ngoại thành");
			System.out.println("0. Thoát nhập");
			int select = Integer.parseInt(scan.nextLine());
			switch (select) {
			case 1:
				chuyenXe = new ChuyenXeNoiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 2:
				chuyenXe = new ChuyenXeNgoaiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 0:
				flag = false;
				break;
			}

		} while (flag);
	}

	public void xuat() {
		for (ChuyenXe cx : listChuyenXe) {
			cx.xuat();
		}
	}

	// 5. Business methods
	public void tinhTongDoanhThu() {
		for (ChuyenXe cx : this.listChuyenXe) {
			tongDoanhThu += cx.getDoanhThu();
		}
	}

	public void tinhDoanhThuNoi() {
		this.doanhThuNoi = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNoiThanh) {
				doanhThuNoi += cx.getDoanhThu();
			}
		}
	}

	public void tinhDoanhThuNgoai() {
		this.doanhThuNgoai = 0;
		for (ChuyenXe cx : this.listChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				doanhThuNgoai += cx.getDoanhThu();
			}
		}
	}

	public void dummyData() {
		ChuyenXe chuyenXe;

		chuyenXe = new ChuyenXeNoiThanh(1, "Nội 1", "254-542", 2513, "12", 15.3f);
		listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNoiThanh(2, "Nội 2", "254-542", 563, "10", 151);
		listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNoiThanh(3, "Nội 3", "254-542", 4562, "15", 11.3f);
		listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNoiThanh(4, "Nội 4", "254-542", 4521, "20", 10.5f);
		listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNoiThanh(5, "Nội 5", "254-542", 4562, "25", 13.6f);
		listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNgoaiThanh(6, "Ngoại 1", "2145-251", 2351, "Bình Thuận", 235);
		listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNgoaiThanh(7, "Ngoại 2", "2145-251", 2012, "Vĩnh Phúc", 154);
		listChuyenXe.add(chuyenXe);

		chuyenXe = new ChuyenXeNgoaiThanh(8, "Ngoại 3", "2145-251", 322, "Bình Thuận", 251);
		listChuyenXe.add(chuyenXe);

	}

	public float tinhDTCXDenBinhThuan() {
		float doanhThu = 0;
		for (ChuyenXe cx : listChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				ChuyenXeNgoaiThanh ngoai = ((ChuyenXeNgoaiThanh) cx);
				if (ngoai.getNoiDen().equalsIgnoreCase("Bình Thuận")) {
					doanhThu += ngoai.getDoanhThu();
				}
			}
		}
		return doanhThu;
	}
}
