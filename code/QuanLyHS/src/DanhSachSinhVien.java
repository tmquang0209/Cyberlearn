import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {

	private ArrayList<SinhVien> listSV;

	public DanhSachSinhVien() {
		thietLapDefault();
	}

	private void thietLapDefault() {
		this.listSV = new ArrayList<SinhVien>();
	}

	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void them(SinhVien sv) {
		this.listSV.add(sv);
	}

	public void xuat() {
		for (SinhVien sv : this.listSV) {
			sv.xuat();
		}
	}

	public void diemTB() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDiemTB();
		}
	}

	public void xeploai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}

	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhat() {

		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			for (SinhVien svCurrent : this.listSV) {
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
				}
			}

			for (SinhVien svCurrent : this.listSV) {
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}
		return list;

	}

	public ArrayList<SinhVien> timDSSVCoDTBCaoNhatToiUu() {

		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			int viTriMaxDauTien = 0;
			for (int i = 0; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurrent;
					viTriMaxDauTien = i;
				}
			}

			this.listSV.add(svMax);

			for (int i = viTriMaxDauTien + 1; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurrent);
				}
			}
		}
		return list;

	}

	public ArrayList<SinhVien> TimDSSVYeu() {
		ArrayList<SinhVien> listYeu = new ArrayList<>();
		if (this.listSV.size() > 0) {
			for (int i = 1; i < this.listSV.size(); i++) {
				SinhVien svCurrent = this.listSV.get(i);
				if (svCurrent.getDiemTB() < 5) {
					listYeu.add(svCurrent);
				}
			}

		}
		return listYeu;
	}
	
	public SinhVien timSVTheoMa(int ma) {
		SinhVien sv = null;
		for(SinhVien sv1:this.listSV) {
			if(sv1.getMaSV() == ma) {
				sv = sv1;
				break;
			}
		}
		return sv;
	}
	
	public boolean xoaSVTheoMa(int ma) {
		boolean deleted = false;
		for(SinhVien sv : this.listSV) {
			if(sv.getMaSV() == ma) {
				this.listSV.remove(sv);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

}
