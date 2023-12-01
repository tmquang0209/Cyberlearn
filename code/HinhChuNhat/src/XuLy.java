import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.nhap(sc);
		hcn.tinhChuVi();
		hcn.tinhDienTich();
		hcn.xuat();
	}

}
