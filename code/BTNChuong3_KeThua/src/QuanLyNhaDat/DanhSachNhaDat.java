/*
 * Mục đích: quản lý nhà đất
 * người tạo: TmQ
 * Ngày tạo: 05/09/2021
 */
package QuanLyNhaDat;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhaDat {

	// 1 Attributes
	private ArrayList<QuanLyNhaDat> nhaDat;
	private float thanhTien;

	public ArrayList<QuanLyNhaDat> getNhaDat() {
		return nhaDat;
	}

	// 2 Get,set methods
	public void setNhaDat(ArrayList<QuanLyNhaDat> nhaDat) {
		this.nhaDat = nhaDat;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	// 3 Constructor
	public DanhSachNhaDat() {
		nhaDat = new ArrayList<QuanLyNhaDat>();
	}

	// 4 Input,output
	public void nhap(Scanner scan) {
		boolean flag = true;
		QuanLyNhaDat nhaDat;
		do {
			System.out.println("1. Giao dịch đất");
			System.out.println("2. Giao dịch nhà");
			System.out.println("0. Thoát");
			int chon = Integer.parseInt(scan.nextLine());

			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				nhaDat = new GiaoDichDat();
				nhaDat.nhap(scan);
				this.nhaDat.add(nhaDat);
				break;
			case 2:
				nhaDat = new GiaoDichNha();
				nhaDat.nhap(scan);
				this.nhaDat.add(nhaDat);
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (QuanLyNhaDat nd : nhaDat) {
			nd.xuat();
		}
	}

	public void dummyData() {
		QuanLyNhaDat nd;

		nd = new GiaoDichDat(1, "10/02/2021", 2.3f, 230, "A");
		nhaDat.add(nd);

		nd = new GiaoDichDat(2, "02/09/2013", 1.3f, 240, "A");
		nhaDat.add(nd);

		nd = new GiaoDichDat(3, "20/03/2000", 3.5f, 250, "B");
		nhaDat.add(nd);

		nd = new GiaoDichDat(4, "12/03/2020", 2.5f, 245, "C");
		nhaDat.add(nd);

		nd = new GiaoDichDat(5, "10/06/2019", 3.2f, 315, "B");
		nhaDat.add(nd);

		nd = new GiaoDichDat(6, "15/09/2013", 2.1f, 125, "C");
		nhaDat.add(nd);

		nd = new GiaoDichNha(7, "02/09/2013", 1.3f, 230, 1, "Vĩnh Phúc");
		nhaDat.add(nd);

		nd = new GiaoDichNha(8, "15/06/2003", 1.3f, 230, 1, "Hà Nội");
		nhaDat.add(nd);

		nd = new GiaoDichNha(9, "25/09/2013", 1.6f, 125, 1, "Bắc Giang");
		nhaDat.add(nd);

		nd = new GiaoDichNha(10, "30/09/2003", 2.3f, 200, 2, "TP HCM");
		nhaDat.add(nd);

	}

	// 5 Business method
	public void tinhTien() {
		for (QuanLyNhaDat nd : nhaDat) {
			nd.tinhTien();
		}
	}

	public void demSoLuongGDDat() {
		int demLoaiA = 0;
		int demLoaiB = 0;
		int demLoaiC = 0;
		for (QuanLyNhaDat nd : nhaDat) {
			if (nd instanceof GiaoDichDat) {
				if (((GiaoDichDat) nd).getLoaiDat() == "A") {
					demLoaiA++;
				} else if (((GiaoDichDat) nd).getLoaiDat() == "B") {
					demLoaiB++;
				} else if (((GiaoDichDat) nd).getLoaiDat() == "C") {
					demLoaiC++;
				}
			}
		}
		System.out.println("GD đất loại A có: " + demLoaiA);
		System.out.println("GD đất loại B có: " + demLoaiB);
		System.out.println("GD đất loại C có: " + demLoaiC);
	}

	public void demSoLuongGDNha() {
		int demNhaThuong = 0;
		int demNhaCaoCap = 0;
		for (QuanLyNhaDat nd : nhaDat) {
			if (nd instanceof GiaoDichNha) {
				if (((GiaoDichNha) nd).getLoaiNha() == 1) {
					demNhaCaoCap++;
				} else {
					demNhaThuong++;
				}
			}
		}
		System.out.println("Nhà cao cấp có: " + demNhaCaoCap);
		System.out.println("Nhà thường có: " + demNhaThuong);
	}

	public void tinhTrungBinhThanhTien() {
		int doanhThu = 0;
		for (QuanLyNhaDat nd : nhaDat) {
			doanhThu += nd.getThanhTien();
		}
		System.out.println("Doanh thu trung bình là: " + doanhThu / nhaDat.size());
	}

	public void xuatRaCacGDT9() {
		for (QuanLyNhaDat nd : nhaDat) {
			String[] ngayGiaoDich = nd.getNgayGD().split("/");
			if (ngayGiaoDich[1].equals("09") && ngayGiaoDich[2].equals("2013")) {
				nd.xuat();
			}
		}
	}
}
