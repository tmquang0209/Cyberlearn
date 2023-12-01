import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DanhSachChuyenXe list = new DanhSachChuyenXe();
		Scanner scan = new Scanner(System.in);
		// list.nhap(scan);
		list.dummyData();
		list.xuat();
//		list.tinhTongDoanhThu();
//		System.out.println("Tổng doanh thu: " + list.getTongDoanhThu());
//
//		list.tinhDoanhThuNoi();
//		System.out.println("Doanh thu nội thành: " + list.getDoanhThuNoi());
//
//		list.tinhDoanhThuNgoai();
//		System.out.println("Doanh thu ngoại thành: " + list.getDoanhThuNgoai());
		float doanhThu = list.tinhDTCXDenBinhThuan();
		System.out.println("Doanh thu Bình Thuận: " + doanhThu);

	}

}
