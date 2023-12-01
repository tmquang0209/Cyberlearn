import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
	// 1. Attributes
	private ArrayList<NhanVien> listNV;

	// 2. Get,set methods
	public ArrayList<NhanVien> getList() {
		return listNV;
	}

	public void setList(ArrayList<NhanVien> list) {
		this.listNV = listNV;
	}

	// 3. Constructor
	public DanhSachNhanVien() {
		thietLapDefault();
	}

	public void thietLapDefault() {
		this.listNV = new ArrayList<NhanVien>();
	}

	// 4. Input,output
	public void nhap(Scanner scan) {
		for (NhanVien nv : listNV) {
			nv.nhap(scan);
		}
	}

	public void themNhanVien(NhanVien nv) {
		this.listNV.add(nv);
	}

	public void xuat() {
		for (NhanVien nv : this.listNV) {
			nv.xuat();
		}
	}

	// 5. Business methods
	public void tinhLuong() {
		for (NhanVien nv : this.listNV) {
			nv.tinhLuong();
		}
	}

	public float tinhTongTienLuong() {
		float sum = 0;
		for (NhanVien nv : this.listNV) {
			sum += nv.getLuongNhanVien();
		}
		return sum;
	}

	public ArrayList<NhanVien> nhanVienCoLuongCaoNhat() {
		ArrayList<NhanVien> list = new ArrayList<NhanVien>();
		if (listNV.size() > 0) {
			NhanVien max = this.listNV.get(0);
			int indexMax = 0;
			for (int i = 1; i < this.listNV.size(); i++) {
				NhanVien nvCurrent = this.listNV.get(i);
				if (nvCurrent.getLuongNhanVien() > max.getLuongNhanVien()) {
					max = nvCurrent;
					indexMax = i;
				}
			}

			// them max
			list.add(max);

			// danh sach nv co luong cao nhat
			for (int i = indexMax+1; i < this.listNV.size(); i++) {
				NhanVien nvCurrent = this.listNV.get(i);
				if (nvCurrent.getLuongNhanVien() == max.getLuongNhanVien()) {
					list.add(nvCurrent);
				}
			}
		}
		return list;
	}

}
