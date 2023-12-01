import java.util.Scanner;

public class HinhChuNhat {

	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;

	public HinhChuNhat() {

	}

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public float getCD() {
		return this.chieuDai;
	}

	public void setCD(float cDai) {
		this.chieuDai = cDai;
	}

	public float getCR() {
		return this.chieuRong;
	}

	public void setCR(float cRong) {
		this.chieuRong = cRong;
	}

	public float getChuVi() {
		return this.chuVi;
	}

	public float getDienTich() {
		return this.dienTich;
	}

	public void nhap(Scanner scan) {
		System.out.print("Nhap chieu dai");
		this.chieuDai = Float.parseFloat(scan.nextLine());

		System.out.print("Nhap chieu rong");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("HCN (" + chieuDai + "," + chieuRong + "). Dien tich: " + dienTich + ", chu vi: " + chuVi);
	}

	public void tinhChuVi() {
		this.chuVi = (chieuDai + chieuRong) * 2;
	}

	public void tinhDienTich() {
		this.dienTich = chieuDai * chieuRong;
	}

}
