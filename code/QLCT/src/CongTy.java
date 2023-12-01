import java.util.ArrayList;
import java.util.Scanner;

public class CongTy implements NhapXuat {

	// 1 Attributes
	private String tenCongTy;
	private String maSoThue;
	private float tongLuong;
	private DanhSachNhanSu objNV;
	private DanhSachPhongBan objPhongBan;
	private DanhSachTask objTask;

	// 2 Get,set
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public DanhSachNhanSu getObjNV() {
		return objNV;
	}

	public void setObjNV(DanhSachNhanSu objNV) {
		this.objNV = objNV;
	}

	public DanhSachPhongBan getObjPhongBan() {
		return objPhongBan;
	}

	public void setObjPhongBan(DanhSachPhongBan objPhongBan) {
		this.objPhongBan = objPhongBan;
	}

	public DanhSachTask getObjTask() {
		return objTask;
	}

	public void setObjTask(DanhSachTask objTask) {
		this.objTask = objTask;
	}

	// 3 Constructor
	public CongTy() {

	}

	// 4 Input,output
	// 5 Business method

	@Override
	public void xuat() {

	}

	public void xuatNSu() {
		this.objNV.xuat();
	}

	public void xuatTask() {
		this.objTask.xuat();
	}

	public void xuatPhongBan() {
		this.objPhongBan.xuat();
	}

	public void taoDuLieu() {
		this.objNV = new DanhSachNhanSu();
		this.objNV.taoDuLieu();

		this.objPhongBan = new DanhSachPhongBan();
		this.objPhongBan.taoDuLieu();

		this.objTask = new DanhSachTask();
		this.objTask.taoDuLieu();
	}

	public void phanBoNhanVien() {
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : objNV.getDsNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				boolean flag = true;
				do {
					XuatMaVaTen(ns);
					System.out.println("Bạn muốn phân bổ hay không");
					System.out.println("1. Phân bổ \t 2. Đi tiếp");
					int chon = Integer.parseInt(scan.nextLine());
					switch (chon) {
					case 1:
						getListPhongBan();
						do {
							System.out.print(">>");
							String maPhong = scan.nextLine();
							PhongBan pb = layPhongBan(maPhong);
							if (pb != null) {
								ns.setMaPhongBan(maPhong);
								pb.getDanhSachNV().add((NhanVienThuong) ns);
								flag = false;
							}
						} while (flag);
						break;
					case 2:
						flag = false;
						break;
					default:
						System.out.println("Chỉ nhập 1 or 2");
					}
				} while (flag);
			}
		}
	}

	public void chiDinhTruongPhong() {
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : objNV.getDsNhanSu()) {
			if (ns instanceof TruongPhong) {
				boolean flag = true;
				do {
					XuatMaVaTen(ns);
					System.out.println("Bạn muốn phân bổ hay không");
					System.out.println("1. Phân bổ \t 2. Đi tiếp");
					int chon = Integer.parseInt(scan.nextLine());
					switch (chon) {
					case 1:
						getListPhongBan();
						do {
							System.out.print(">>");
							String maPhong = scan.nextLine();
							PhongBan pb = layPhongBan(maPhong);
							if (pb != null) {
								ns.setMaPhongBan(maPhong);
								pb.setTruongPhong((TruongPhong) ns);
								flag = false;
							}
						} while (flag);
						break;
					case 2:
						flag = false;
						break;
					default:
						System.out.println("Chỉ nhập 1 or 2");
					}
				} while (flag);

			}
		}
	}

	public void phanBoTask() {
		Scanner scan = new Scanner(System.in);
		for (Task task : objTask.getDsTask()) {
			System.out.println("Task đang phân bổ: ");
			task.xuat();
			NhanSu ns = timNhanSuTheoMa(scan);
			boolean flag = true;
			do {
				System.out.println("1. Phân Task cho nhân sự này \t 2. Chọn lại nhân sự \t 3. Bỏ qua không phân Task");
				System.out.print(">>>");
				int chon = Integer.parseInt(scan.nextLine());
				switch (chon) {
				case 1:
					task.setMaNV(ns.getMa());
					ns.getTask().getDsTask().add(task);
					System.out.println("Phân task thành công.");
					flag = false;
					break;
				case 2:
					ns = timNhanSuTheoMa(scan);
					break;
				case 3:
					flag = false;
					break;
				default:
					System.out.println("Chỉ chọn 1,2,3");
				}
			} while (flag);
		}
	}

	public NhanSu timNhanSuTheoMa(Scanner scan) {
		NhanSu ns = null;
		do {
			System.out.print("Nhập mã cần chỉ định: ");
			String ma = scan.nextLine();
			for (NhanSu nSu : this.objNV.getDsNhanSu()) {
				if (nSu.getMa().equalsIgnoreCase(ma)) {
					ns = nSu;
					System.out.println("Nhân sự bạn đang chọn là: ");
					XuatMaVaTen(ns);
					break;
				}
			}
		} while (ns == null);
		return ns;
	}

	private void XuatMaVaTen(NhanSu ns) {
		System.out.println("Mã: " + ns.getMa() + " Tên: " + ns.getTen());
	}

	public void getListPhongBan() {
		System.out.println("Danh sách phòng ban");
		for (PhongBan pb : objPhongBan.getDsPhongBan()) {
			System.out.println("Mã: " + pb.getMaPhong() + " Tên phòng: " + pb.getTenPhong());
		}
		System.out.println("=================");
	}

	private PhongBan layPhongBan(String maPhong) {
		for (PhongBan pb : objPhongBan.getDsPhongBan()) {
			if (pb.getMaPhong().equalsIgnoreCase(maPhong)) {
				return pb;
			}
		}
		return null;
	}
	
	public void tinhLuong() {
		for(NhanSu ns : objNV.getDsNhanSu()) {
			ns.tinhLuong();
		}
	}

}
