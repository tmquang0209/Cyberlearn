package QuanLyNhaDat;

import java.util.Scanner;

public class GiaoDichNha extends QuanLyNhaDat {
	final float HE_SO_NHA_THUONG = 0.9f;

	//1. Attributes
	private int chonLoaiNha;
	private String diaChi;
	private float thanhTien;

	//2. Get,set
	public int getLoaiNha() {
		return chonLoaiNha;
	}

	public void setLoaiNha(int loaiNha) {
		this.chonLoaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getThanhTien() {
		return thanhTien;
	}
	//3. Constructor
	public GiaoDichNha() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNha(int maGD, String ngayGD, float donGia, float dienTich, int loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.chonLoaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	//4. Input,output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("1. Nhà cao cấp \t 2. Nhà thường");
		System.out.println("Nhập loại nhà");
		this.chonLoaiNha = Integer.parseInt(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		String loaiNha = null;
		switch (chonLoaiNha) {
		case 1:
			loaiNha = "Cao cấp";
			break;
		case 2:
			loaiNha = "Thường";
			break;
		}
		System.out.println("\t Loại nhà: " + loaiNha + "\t Thành tiền: " + thanhTien);
	}
	//5. Business methods
	@Override
	public void tinhTien() {
		if(chonLoaiNha == 1) {
			thanhTien = donGia * dienTich;
		}else {
			thanhTien = donGia * dienTich * HE_SO_NHA_THUONG;
		}
	}

}
