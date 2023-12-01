import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CongTy {

	// 1 Attributes
	private String tenCTy;
	private int maSoThue;
	private float doanhThuThang;
	private DSNhanSu objListNhanSu;

	// 2 Get,set
	public String getTenCTy() {
		return tenCTy;
	}

	public void setTenCTy(String tenCTy) {
		this.tenCTy = tenCTy;
	}

	public int getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(int maSoThue) {
		this.maSoThue = maSoThue;
	}

	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	public DSNhanSu getObjListNhanSu() {
		return objListNhanSu;
	}

	public void setObjListNhanSu(DSNhanSu objListNhanSu) {
		this.objListNhanSu = objListNhanSu;
	}

	// 3 Constructor
	public CongTy() {
		this.objListNhanSu = new DSNhanSu();
	}

	// 4 Input,output
	public void nhap(Scanner scan) {
		System.out.println("===== Nhập thông tin CTY =====");
		System.out.print("Tên CTy: ");
		this.tenCTy = scan.nextLine();

		System.out.print("Mã số thuế");
		this.maSoThue = Integer.parseInt(scan.nextLine());

		System.out.print("Mã số thuế");
		this.doanhThuThang = Float.parseFloat(scan.nextLine());
	}

	public void xuat() {
		System.out.println("***** Thông tin công ty *****");
		System.out.print("Tên công ty: " + tenCTy);
		System.out.print("Mã số thuế: " + maSoThue);
		System.out.println("Doanh thu tháng: " + doanhThuThang);
		System.out.println("************************************");
		this.objListNhanSu.xuat();
	}

	// 5 Business method
	public void tinhLuong() {
		this.objListNhanSu.tinhLuong();
	}

	public void dummyDataCty() {
		this.tenCTy = "CyberSoft-CyberLearn";
		this.maSoThue = 1292332;
		this.doanhThuThang = 1505420;
	}

	public void dummyDataNhanSu() {
		NhanSu ns = new NhanSu();
		ns = new TruongPhong(13, "TP Bổ sung 1", "098233", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong(14, "TP Bổ sung 2", "091833", 21);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong(1, "Lan", "09832", 20);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong(2, "Hưng", "098232", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong(3, "Việt", "098132", 31);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong(4, "An", "091832", 25);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong(5, "Tuyết", "098432", 23);
		objListNhanSu.them(ns);
		ns = new NhanVienThuong(6, "Mỹ", "092832", 31);
		objListNhanSu.them(ns);

		ns = new TruongPhong(8, "TP Mai", "098233", 24);
		objListNhanSu.them(ns);
		ns = new TruongPhong(9, "TP Luân", "091833", 21);
		objListNhanSu.them(ns);
		ns = new TruongPhong(10, "TP Kiệt", "091833", 23);
		objListNhanSu.them(ns);

		ns = new GiamDoc(11, "GD Tiên", "0981", 19, 80);
		objListNhanSu.them(ns);
		ns = new GiamDoc(12, "GD Huệ", "09181", 21, 20);
		objListNhanSu.them(ns);
	}

	/*
	 * Phân bổ nhân viên về phongf ban hay chỉ định trưởng phòng cho nhân viên Bước
	 * 1: Duyệt danh sách và kiểm tra nếu là NVT Bước 2: Show ra list trưởng phòng
	 * (tên & mã) Bước 3: Có muốn phân bổ hay không, chọn "Y" để phân bổ, chọn "N"
	 * để đi tiếp Bước 4: Nếu "N" -> nv tiếp theo Bước 5: Nếu "Y" -> Ycau nhập mã
	 * trưởng phòng đã liệt kê ở trên Bước 6: Kiểm tra mã nhập bước 5 Bước 7: nếu
	 * có, lấy trưởng phòng mới mã đã chọn bước 5-> lấy ra object trưởng phòng Bước
	 * 8: Gán trưởng phỏng bước 7 cho trưởng phòng của nhân viên đang duyệt Bước 9:
	 * Nếu không, lặp lại bước 5 Bước 10: Tăng số lượng nv quản lý của trưởng phòng
	 */

	public void phanBoNhanVienThuong() {
		// buoc 1
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				ns.xuatMaVaTen();
				System.out.println();
				phanBoCho1NSu(scan, ns);
			}
		}
	}

	private void phanBoCho1NSu(Scanner scan, NhanSu ns) {
		// Bước 2
		showMaVaTenTuongPhong();
		boolean flag = true;
		do {
			// Bước 3
			System.out.print("Bạn có muốn phân bổ nhân viên không?");
			System.out.println("1 để phân bổ \t 2 để đi tiếp");
			int chon = Integer.parseInt(scan.nextLine());
			if (chon == 1 || chon == 2) {
				if (chon == 1) { // Bước 5
					TruongPhong kiemTra = nhapTruongPhong(scan);
					// Bước 7
					// Bước 8
					((NhanVienThuong) ns).setTruongPhong(kiemTra);
					// Bước 10
					kiemTra.tangNhanVien();
				}
				flag = false; // Bước 4
			} else {
				System.out.println("Chỉ được nhập 1 or 2.");
			}
		} while (flag);
	}

	private TruongPhong nhapTruongPhong(Scanner scan) {
		TruongPhong kiemTra = null;
		do {
			System.out.print("Nhập mã trưởng phòng: ");
			int maTP = Integer.parseInt(scan.nextLine());
			// bước 6
			kiemTra = timTruongPhongTheoMa(maTP);
		} while (kiemTra == null);
		return kiemTra;
	}

	private void showMaVaTenTuongPhong() {
		System.out.println("Danh sách trưởng phòng");
		ArrayList<TruongPhong> list = layDSTruongPhong();
		for (TruongPhong tp : list) {
			tp.xuatMaVaTen();
		}
		System.out.println("============================");
	}

	public void lietKeDSTruongPhong() {
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				ns.xuatMaVaTen();
			}
		}
	}

	public TruongPhong timTruongPhongTheoMa(int ma) {
		TruongPhong tPhong = null;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaSo() == ma) {
					tPhong = (TruongPhong) ns;
				}
			}
		}
		return tPhong;
	}

	public ArrayList<TruongPhong> layDSTruongPhong() {
		ArrayList<TruongPhong> list = new ArrayList<TruongPhong>();
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				list.add((TruongPhong) ns);
			}
		}
		return list;
	}

	public void themNhanSu(Scanner scan) {
		ArrayList<NhanVienThuong> list = this.objListNhanSu.nhap(scan);
		for (NhanVienThuong nvt : list) {
			phanBoCho1NSu(scan, nvt);
		}
	}

	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false;
		System.out.println("====== Xóa nhân sự ======");
		System.out.println("Nhập mã cần xóa");
		int ma = Integer.parseInt(scan.nextLine());
		NhanSu nhanSu = timNSuTheoMa(ma);
		if (nhanSu != null) {
			// Truong phong
			if (nhanSu instanceof TruongPhong) {
				deleted = xoaTruongPhong((TruongPhong) nhanSu);
			} else if (nhanSu instanceof NhanVienThuong) {
				deleted = xoaNVThuong((NhanVienThuong) nhanSu);
			} else {
				deleted = xoaGiamDoc((GiamDoc) nhanSu);
			}
		}
		return deleted;
	}

	private boolean xoaTruongPhong(TruongPhong tp) {
		boolean deleted = false;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				TruongPhong tPhongNVThuong = ((NhanVienThuong) ns).getTruongPhong();
				if (tPhongNVThuong != null) {
					if (tPhongNVThuong.getMaSo() == tp.getMaSo()) {
						((NhanVienThuong) ns).setTruongPhong(null);
						deleted = true;
					}
				}
			}
		}
		this.objListNhanSu.getListNhanSu().remove(tp);
		return deleted;
	}

	private boolean xoaNVThuong(NhanVienThuong nv) {
		boolean deleted = false;
		TruongPhong TPhong = nv.getTruongPhong();
		if (TPhong != null) {
			TPhong.giamNhanVien();
		}
		objListNhanSu.getListNhanSu().remove(nv);
		deleted = true;
		return deleted;
	}

	public boolean xoaGiamDoc(GiamDoc gd) {
		boolean deleted = false;
		this.objListNhanSu.getListNhanSu().remove(gd);
		return deleted;
	}

	public NhanSu timNSuTheoMa(int ma) {
		NhanSu nhanSu = null;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			if (ns.getMaSo() == ma) {
				nhanSu = ns;
				break;
			}
		}
		return nhanSu;
	}

	public ArrayList<NhanVienThuong> timNVThuongLuongCaoNhat() {
		ArrayList<NhanVienThuong> nvLuongMax = new ArrayList<NhanVienThuong>();
		NhanVienThuong nvt = null;

		int indexMax = 0;

		for (NhanSu ns : this.objListNhanSu.getListNhanSu()) {
			indexMax++;
			if (ns instanceof NhanVienThuong) {
				nvt = (NhanVienThuong) ns;
				break;
			}
		}

		if (nvt != null) {
			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong) {
					if (current.getLuong() > nvt.getLuong()) {
						nvt = (NhanVienThuong) current;
						indexMax++;
					}
				}
			}

			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof NhanVienThuong) {
					if (current.getLuong() == nvt.getLuong()) {
						nvLuongMax.add((NhanVienThuong) current);
					}
				}
			}
		}
		return nvLuongMax;
	}

	public ArrayList<TruongPhong> lietKeTruongPhongCoNhieuNVNhat() {
		ArrayList list = new ArrayList<TruongPhong>();
		TruongPhong tp = null;
		int indexMax = 0;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			indexMax++;
			if (ns instanceof TruongPhong) {
				tp = (TruongPhong) ns;
				break;
			}
		}

		if (tp != null) {
			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof TruongPhong) {
					if (((TruongPhong) current).getSoNhanVienDuoiQuyen() > tp.getSoNhanVienDuoiQuyen()) {
						tp = (TruongPhong) current;
						indexMax++;
					}
				}
			}

			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof TruongPhong) {
					if (((TruongPhong) current).getSoNhanVienDuoiQuyen() == tp.getSoNhanVienDuoiQuyen()) {
						list.add(current);
					}
				}
			}
		}

		return list;
	}

	private ArrayList<NhanSu> interchargeSort(ArrayList<NhanSu> _list) {
		int i, j;
		for (i = 0; i < _list.size(); i++) {
			for (j = i + 1; j < _list.size(); j++) {
				NhanSu nhanSuI = _list.get(i);
				NhanSu nhanSuJ = _list.get(j);

				if (nhanSuJ.getHoTen().compareToIgnoreCase(nhanSuI.getHoTen()) < 0) {
					Collections.swap(_list, i, j);
				}

			}
		}

		return _list;
	}

	public void sapXepNhanSu() {
		interchargeSort(this.objListNhanSu.getListNhanSu());
	}

	private ArrayList<NhanSu> interchargeSort_Luong(ArrayList<NhanSu> _list) {
		int i, j;
		for (i = 0; i < _list.size(); i++) {
			for (j = i + 1; j < _list.size(); j++) {
				NhanSu nhanSuI = _list.get(i);
				NhanSu nhanSuJ = _list.get(j);
				if (nhanSuJ.getLuong() > nhanSuI.getLuong()) {
					Collections.swap(_list, i, j);
				}
			}
		}
		return _list;
	}

	public void sapXepNhanSuTheoluong() {
		interchargeSort_Luong(this.objListNhanSu.getListNhanSu());
	}

	public ArrayList<GiamDoc> timGDCoCPhanCaoNhat() {
		ArrayList<GiamDoc> gdMax = new ArrayList<GiamDoc>();
		GiamDoc giamDoc = null;

		int indexMax = 0;

		for (NhanSu gd : this.objListNhanSu.getListNhanSu()) {
			indexMax++;
			if (gd instanceof GiamDoc) {
				giamDoc = (GiamDoc) gd;
				break;
			}
		}

		if (giamDoc != null) {
			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof GiamDoc) {
					if (((GiamDoc) current).getCoPhan() > giamDoc.getCoPhan()) {
						giamDoc = (GiamDoc) current;
						indexMax++;
					}
				}
			}

			for (int i = indexMax - 1; i < objListNhanSu.getListNhanSu().size(); i++) {
				NhanSu current = objListNhanSu.getListNhanSu().get(i);
				if (current instanceof GiamDoc) {
					if (((GiamDoc) current).getCoPhan() == giamDoc.getCoPhan()) {
						gdMax.add((GiamDoc) current);
					}
				}
			}
		}
		return gdMax;
	}

	private float tinhTongLuong() {
		float tongLuong = 0;
		for (NhanSu ns : objListNhanSu.getListNhanSu()) {
			tongLuong += ns.getLuong();
		}
		return tongLuong;
	}

	private float loiNhuanCongTy() {
		float tongLuong = tinhTongLuong();
		return getDoanhThuThang() - tongLuong;
	}
	
	public void tinhThuNhapGiamDoc() {
		ArrayList<GiamDoc> gd = new ArrayList<GiamDoc>();
		for(NhanSu ns : objListNhanSu.getListNhanSu()) {
			if(ns instanceof GiamDoc) {
				double thuNhap = ns.luong+(((GiamDoc) ns).getCoPhan()/100)*loiNhuanCongTy();
				System.out.println("Mã: " + ns.maSo + "\t Họ tên: " + ns.hoTen + "\t Thu nhập: " + thuNhap);
			}
		}
		
	
	}
}
