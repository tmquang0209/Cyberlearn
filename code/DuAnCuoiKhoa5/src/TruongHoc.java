import java.util.ArrayList;
import java.util.Collections;

public class TruongHoc implements NhapXuat {

	final short NAM_HIEN_TAI = 2021;
	final short SO_MON_HOC = 3;

	// 1 Attributes
	private DanhSachToanTruong objToanTruong;

	// 2 Get,set
	public DanhSachToanTruong getObjToanTruong() {
		return objToanTruong;
	}

	public void setObjToanTruong(DanhSachToanTruong objToanTruong) {
		this.objToanTruong = objToanTruong;
	}

	// 3 Constructor
	public TruongHoc() {

	}

	// 4 Input,output
	@Override
	public void nhap() {

	}

	@Override
	public void xuat() {
		for (ToanTruong tt : objToanTruong.getDsToanTruong()) {
			tt.xuat();
		}
	}

	public void xuatToanTruong() {
		objToanTruong.xuat();
	}

	public void taoDuLieu() {
		this.objToanTruong = new DanhSachToanTruong();
		objToanTruong.taoDuLieu();
	}

	// 5 Business method
	public void tinhThamNienGV() {
		System.out.println("Danh sách thâm niên GV");
		for (ToanTruong tt : objToanTruong.getDsToanTruong()) {
			if (tt instanceof GiaoVien) {
				float thamNien = tinhThamNien(tt);
				System.out.println("Họ tên: " + tt.getHoTen() + "\t Thâm niên: " + thamNien);
			}
		}
		System.out.println("=============================");
	}

	private float tinhThamNien(ToanTruong tt) {
		float thamNien = NAM_HIEN_TAI - Float.parseFloat(((GiaoVien) tt).getNamBatDauDay());
		return thamNien;
	}

	private GiaoVien timGVCoThamNienCaoNhat() {
		GiaoVien gvThamNienCaoNhat = new GiaoVien();
		gvThamNienCaoNhat = listTeacher().get(0);
		for (int i = 0; i < listTeacher().size(); i++) {
			GiaoVien gv = listTeacher().get(i);
			if (tinhThamNien(gv) > tinhThamNien(gvThamNienCaoNhat)) {
				gvThamNienCaoNhat = (GiaoVien) gv;
			}
		}
		return gvThamNienCaoNhat;
	}

	public void xuatGVThamNienCaoNhat() {
		GiaoVien gvTNCaoNhat = timGVCoThamNienCaoNhat();

		System.out.println("Danh sách GV có thâm niên cao nhất");
		for (GiaoVien tt : listTeacher()) {
			if (tinhThamNien(tt) == tinhThamNien(gvTNCaoNhat)) {
				tt.xuat();
			}
		}
		System.out.println("===================================");
	}

	public void timGVTMYeuCau() {
		System.out.println("Danh sách GV có thâm niên > 5 và ban Tự nhiên");
		for (GiaoVien gv : listTeacher()) {
			if (tinhThamNien(gv) > 5 && gv.getChuyenMon() == 1) {
				gv.xuat();
			}
		}
		System.out.println("==============================");
	}

	private float tinhDiemTBHS(HocSinh hs) {
		return (hs.getDiemToan() + hs.getDiemAnh() + hs.getDiemVan()) / SO_MON_HOC;
	}

	public void xuatDiemTBHS() {
		System.out.println("******************************");
		for (HocSinh hs : listStudent()) {
			System.out.println("Tên HS: " + hs.hoTen + "\t Điểm TB: " + tinhDiemTBHS(hs));
		}
		System.out.println("===============================");
	}

	private int timDiemTBCaoNhat() {
		HocSinh hsTBCaoNhat = new HocSinh();
		hsTBCaoNhat = listStudent().get(0);
		int indexMax = 0;
		for (int i = 1; i < listStudent().size(); i++) {
			HocSinh hs = listStudent().get(i);
			if (tinhDiemTBHS(hs) > tinhDiemTBHS(hsTBCaoNhat)) {
				hsTBCaoNhat = hs;
				indexMax++;
			}
		}
		return indexMax;
	}

	public void xuatDTBCaoNhat() {
		System.out.println("Điểm TB Cao nhất là: " + tinhDiemTBHS(listStudent().get(timDiemTBCaoNhat())));
	}

	public void xuatHSCoDTBCaoNhat() {
		int indexMax = timDiemTBCaoNhat();
		HocSinh hsDTBCaoNhat = listStudent().get(indexMax);
		System.out.println("*************************");
		for (int i = indexMax; i < listStudent().size(); i++) {
			HocSinh hs = listStudent().get(i);
			if (tinhDiemTBHS(hs) == tinhDiemTBHS(hsDTBCaoNhat)) {
				System.out.println("Tên HS: " + hs.getHoTen() + "\t DTB: " + tinhDiemTBHS(hs));
			}
		}
		System.out.println("===========================");
	}

	private String xepLoaiHS(HocSinh hs) {
		float diemTB = tinhDiemTBHS(hs);
		if (diemTB > 9) {
			return "Xuất sắc";
		} else if (diemTB >= 8) {
			return "Giỏi";
		} else if (diemTB >= 7) {
			return "Khá";
		} else if (diemTB >= 5) {
			return "Trung bình";
		} else {
			return "Yếu";
		}
	}

	public void xuatXLHS() {
		System.out.println("**************************");
		for (HocSinh hs : listStudent()) {
			System.out.println("Tên: " + hs.hoTen + "\t Xếp loại: " + xepLoaiHS(hs));
		}
		System.out.println("=============================");
	}

	private ArrayList<GiaoVien> listTeacher() {
		ArrayList listTeacher = new ArrayList<GiaoVien>();
		for (ToanTruong tt : objToanTruong.getDsToanTruong()) {
			if (tt instanceof GiaoVien) {
				listTeacher.add(tt);
			}
		}
		return listTeacher;
	}

	private ArrayList<HocSinh> listStudent() {
		ArrayList listStudent = new ArrayList<HocSinh>();
		for (ToanTruong tt : objToanTruong.getDsToanTruong()) {
			if (tt instanceof HocSinh) {
				listStudent.add(tt);
			}
		}
		return listStudent;
	}

	public void sapXepHSTheoDiem() {
		float arr[] = taoMangDiem();
		arr = quickSort(arr, 0, arr.length - 1);
		System.out.println("*****************************");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < listStudent().size(); j++) {
				HocSinh hs = listStudent().get(j);
				if (tinhDiemTBHS(hs) == arr[i]) {
					System.out.println("Họ tên: " + hs.hoTen + "\t DTB: " + arr[i]);
				}
			}
		}
		System.out.println("================================");
	}

	private float[] taoMangDiem() {
		float arr[] = new float[listStudent().size()];
		int i = 0;
		for (HocSinh hs : listStudent()) {
			arr[i++] = tinhDiemTBHS(hs);
		}
		return arr;
	}

	public void xuatMang() {
		float arr[] = taoMangDiem();
		arr = quickSort(arr, 0, arr.length - 1);
		for (float pt : arr) {
			System.out.print(pt + "\t");
		}
	}

	public float[] quickSort(float _list[], int left, int right) {
		int i, j;
		float x;

		x = _list[(left + right) / 2];
		i = left;
		j = right;

		do {
			while (_list[i] > x) {
				i++;
			}
			while (_list[j] < x) {
				j--;
			}
			if (i <= j) {
				float temp = _list[i];
				_list[i] = _list[j];
				_list[j] = temp;
			}
		} while (i < j);
		return _list;
	}

	public void sapXepTheoTen() {
		bubbleSort(listStudent());
	}

	private void bubbleSort(ArrayList<HocSinh> hs) {
		int i, j;
		for (i = 0; i < hs.size(); i++) {
			for (j = hs.size() - 1; j > i; j--) {
				HocSinh hsI = hs.get(i);
				HocSinh hsJ = hs.get(j);
				if (hsI.getHoTen().compareToIgnoreCase(hsJ.getHoTen()) > 0) {
					Collections.swap(hs, i, j);
				}
			}
		}
		for (HocSinh hs1 : hs) {
			hs1.xuat();
		}
	}

}
