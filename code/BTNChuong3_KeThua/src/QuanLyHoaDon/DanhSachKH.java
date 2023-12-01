/*
 * Mục đích: quản lý toàn bộ hóa đơn
 * Người tạo: TmQ
 * Ngày tạo: 6/9/2021
 * Version: 1.0.0
 */
package QuanLyHoaDon;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachKH {
	// 1. Attributes
	private ArrayList<HoaDonDien> danhSachKH;

	// 2. Get,set
	public ArrayList<HoaDonDien> getDanhSachKH() {
		return danhSachKH;
	}

	public void setDanhSachKH(ArrayList<HoaDonDien> danhSachKH) {
		this.danhSachKH = danhSachKH;
	}

	// 3. Constructor
	public DanhSachKH() {
		danhSachKH = new ArrayList<HoaDonDien>();
	}

	// 3. Input,output
	public void nhap(Scanner scan) {
		boolean flag = true;
		HoaDonDien hoaDon;
		do {
			System.out.println("1. KH VN");
			System.out.println("2. KH Nước ngoài");
			System.out.println("0. Thoát");
			System.out.print("Chọn");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				hoaDon = new KHVietNam();
				hoaDon.nhap(scan);
				danhSachKH.add(hoaDon);
				break;
			case 2:
				hoaDon = new KHNuocNgoai();
				hoaDon.nhap(scan);
				danhSachKH.add(hoaDon);
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (HoaDonDien hoaDon : danhSachKH) {
			hoaDon.xuat();
		}
	}

	public void dummyData() {
		HoaDonDien hoaDon;

		hoaDon = new KHVietNam(1, "KHVN 1", "23/09/2013", 1.2f, 1, 120, 100);
		danhSachKH.add(hoaDon);

		hoaDon = new KHVietNam(2, "KHVN 2", "10/08/2013", 1.5f, 3, 115, 150);
		danhSachKH.add(hoaDon);

		hoaDon = new KHVietNam(3, "KHVN 3", "20/10/2020", 1.6f, 2, 150, 150);
		danhSachKH.add(hoaDon);

		hoaDon = new KHVietNam(4, "KHVN 4", "01/05/2021", 1.1f, 1, 250, 255);
		danhSachKH.add(hoaDon);

		hoaDon = new KHVietNam(5, "KHVN 5", "25/01/2019", 1.9f, 3, 200, 199);
		danhSachKH.add(hoaDon);

		// KH NN
		hoaDon = new KHNuocNgoai(6, "KHNN 6", "25/09/2018", 1.6f, "Campuchia", 5150);
		danhSachKH.add(hoaDon);

		hoaDon = new KHNuocNgoai(7, "KHNN 7", "30/09/2013", 1.9f, "Trung Quốc", 2150);
		danhSachKH.add(hoaDon);

		hoaDon = new KHNuocNgoai(8, "KHNN 8", "25/01/2018", 2.3f, "Lào", 1350);
		danhSachKH.add(hoaDon);

		hoaDon = new KHNuocNgoai(9, "KHNN 9", "15/10/2019", 2, "Ấn Độ", 1250);
		danhSachKH.add(hoaDon);

		hoaDon = new KHNuocNgoai(10, "KHNN 10", "03/06/2020", 1.5f, "Mỹ", 2500);
		danhSachKH.add(hoaDon);

	}

	// 4. Business method
	public void tinhTien() {
		for(HoaDonDien hd : danhSachKH) {
			hd.tinhTien();
		}
	}
	public void tinhTongSL() {
		int demKHVN = 0;
		int demKHNN = 0;
		for (HoaDonDien hd : danhSachKH) {
			if (hd instanceof KHVietNam) {
				demKHVN++;
			}
			if (hd instanceof KHNuocNgoai) {
				demKHNN++;
			}
		}
		System.out.println("KHVN có: " + demKHVN);
		System.out.println("KHNN có: " + demKHNN);
	}
	
	public void tinhTBTien() {
		float tongDoanhThu = 0;
		int dem = 0;
		for(HoaDonDien hd : danhSachKH) {
			if(hd instanceof KHNuocNgoai) {
				tongDoanhThu += hd.getThanhTien();
				dem++;
			}
		}
		System.out.println("\nDoanh thu TB của KH nước ngoài là: " + tongDoanhThu/dem + "\n");
	}
	
	public void xuatDonGDT9() {
		System.out.println("Danh sách khách hàng có hóa đơn trong tháng 9 năm 2013");
		for(HoaDonDien hoaDon : danhSachKH) {
			String[] tachNgay = hoaDon.getNgayRaHoaDon().split("/");
			if(tachNgay[1].equals("09") && tachNgay[2].equals("2013")) {
				hoaDon.xuat();
			}
		}
	}

}
