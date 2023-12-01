import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CongTy congTy = new CongTy();
		congTy.dummyDataCty();
		congTy.dummyDataNhanSu();
		// congTy.phanBoNhanVienThuong();
		// congTy.themNhanSu(scan);
		congTy.tinhLuong();
		congTy.xuat();
		// congTy.xoaNhanSu(scan);
		System.out.println("Lương max");
		ArrayList<NhanVienThuong> list = congTy.timNVThuongLuongCaoNhat();
		for (NhanVienThuong nvt : list) {
			nvt.xuat();
		}

		System.out.println("Trưởng phòng quản lý nhiều nhất");
		ArrayList<TruongPhong> listTPMax = congTy.lietKeTruongPhongCoNhieuNVNhat();
		for (TruongPhong nvt : listTPMax) {
			nvt.xuat();
		}
//		
//		System.out.println("Sắp xếp");
//		congTy.sapXepNhanSu();
//		congTy.xuat();
//		
		System.out.println("Sắp xếp lương giảm dần");
		congTy.sapXepNhanSuTheoluong();
		congTy.xuat();

		System.out.println("GĐ nhiều cổ phần nhất");
		ArrayList<GiamDoc> listGD = congTy.timGDCoCPhanCaoNhat();
		for (GiamDoc nvt : listGD) {
			nvt.xuat();
		}

		System.out.println("Thu nhập giám đốc: ");
		congTy.tinhThuNhapGiamDoc();
//		congTy.tinhLuong();
//		congTy.xuat();

	}
}
