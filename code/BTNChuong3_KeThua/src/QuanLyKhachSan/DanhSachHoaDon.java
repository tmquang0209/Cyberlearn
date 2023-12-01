/*
 * Mục đích: Quản lý toàn bộ hóa đơn khách sạn
 * Người tạo: TmQ
 * Ngày tạo: 6/9/2021
 * Version: 1.0.0
 */
package QuanLyKhachSan;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHoaDon {

	// 1 Attributes
	private ArrayList<QuanLyKhachSan> QLKS;

	// 2 Get,set
	public ArrayList<QuanLyKhachSan> getQLKS() {
		return QLKS;
	}

	public void setQLKS(ArrayList<QuanLyKhachSan> qLKS) {
		QLKS = qLKS;
	}

	// 3 Constructor
	public DanhSachHoaDon() {
		QLKS = new ArrayList<QuanLyKhachSan>();
	}

	// 4 Input,output
	public void nhap(Scanner scan) {
		boolean flag = true;
		QuanLyKhachSan quanLy;
		do {
			System.out.println("1. Thuê theo giờ");
			System.out.println("2. Thuê theo ngày");
			System.out.println("0. Thoát");
			System.out.print("Nhập: ");
			int chon = Integer.parseInt(scan.nextLine());

			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				quanLy = new ThueTheoGio();
				quanLy.nhap(scan);
				QLKS.add(quanLy);
				break;
			case 2:
				quanLy = new ThueTheoNgay();
				quanLy.nhap(scan);
				QLKS.add(quanLy);
				break;
			}
		} while (flag);
	}

	public void xuat() {
		for (QuanLyKhachSan ql : QLKS) {
			ql.xuat();
		}
	}
	
	public void dummyData() {
		QuanLyKhachSan quanLy;

		quanLy = new ThueTheoGio(1,"23/09/2021","KH Giờ 1",1,350,20);
		QLKS.add(quanLy);

		quanLy = new ThueTheoGio(2,"12/09/2013","KH Giờ 2",2,150,21);
		QLKS.add(quanLy);

		quanLy = new ThueTheoGio(3,"16/01/2014","KH Giờ 3",3,100,25);
		QLKS.add(quanLy);

		quanLy = new ThueTheoGio(4,"13/01/2014","KH Giờ 4",4,100,24);
		QLKS.add(quanLy);

		quanLy = new ThueTheoGio(5,"02/05/2019","KH Giờ 5",5,120,15);
		QLKS.add(quanLy);
		
		quanLy = new ThueTheoNgay(6,"12/02/2021","KH Ngày 1",6,4000,2);
		QLKS.add(quanLy);
		
		quanLy = new ThueTheoNgay(7,"16/03/2018","KH Ngày 2",7,8000,3);
		QLKS.add(quanLy);
		
		quanLy = new ThueTheoNgay(8,"16/04/2017","KH Ngày 3",8,3500,5);
		QLKS.add(quanLy);
		
		quanLy = new ThueTheoNgay(9,"23/06/2019","KH Ngày 4",9,2000,4);
		QLKS.add(quanLy);
		
		quanLy = new ThueTheoNgay(10,"02/09/2010","KH Ngày 5",10,2500,6);
		QLKS.add(quanLy);
	}
	// 5 Business method
	public void tinhTien() {
		for(QuanLyKhachSan ql : QLKS) {
			ql.tinhTien();
		}
	}
	
}
