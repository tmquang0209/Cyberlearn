/*
 * Mục đích: quản lý danh sách đất
 * Người tạo: TmQ
 * Ngày tạo: 05/09/2021
 * Version: 1.0.0
 */
package QuanLyNhaDat;

import java.util.Scanner;

public class GiaoDichDat extends QuanLyNhaDat {

	final float HE_SO_LOAI_A = 1.5f;
	//1 Attributes
	private String loaiDat;

	//2 Get,set
	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	//3 Constructor
	public GiaoDichDat() {
		super();
	}

	public GiaoDichDat(int maGD, String ngayGD, float donGia, float dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	//4 Input,output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("1. Loại A \t 2. Loại B \t 3. Loại C");
		System.out.println("Nhập loại đất");
		this.loaiDat = scan.nextLine();
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loại đất: " + loaiDat + "\t Thành tiền: " + thanhTien);
	}

	// 5. Business methods
	@Override
	public void tinhTien() {
		if (loaiDat.equalsIgnoreCase("A")) {
			this.thanhTien = dienTich * donGia * HE_SO_LOAI_A;
		} else {
			this.thanhTien = dienTich * donGia;
		}
	}

}
