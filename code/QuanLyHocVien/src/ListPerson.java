import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ListPerson {

	// 1 Attributes
	private ArrayList<Person> danhSach;
	// 2 Get,set methods

	public ArrayList<Person> getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(ArrayList<Person> danhSach) {
		this.danhSach = danhSach;
	}

	// 3 Constructor
	public ListPerson() {
		danhSach = new ArrayList<Person>();
	}

	// 4 Input,ouput
	public void nhap(Scanner scan) {
		boolean flag = true;
		Person quanLyNguoiDung;
		do {
			System.out.println("1. Thêm học viên");
			System.out.println("2. Thêm nhân viên");
			System.out.println("3. Thêm khách hàng");
			System.out.println("0. Thoát");
			System.out.print("Chọn > ");
			int chon = Integer.parseInt(scan.nextLine());

			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				quanLyNguoiDung = new Student();
				quanLyNguoiDung.nhap(scan);
				danhSach.add(quanLyNguoiDung);
				break;
			case 2:
				quanLyNguoiDung = new Employee();
				quanLyNguoiDung.nhap(scan);
				danhSach.add(quanLyNguoiDung);
				break;
			case 3:
				quanLyNguoiDung = new Customer();
				quanLyNguoiDung.nhap(scan);
				danhSach.add(quanLyNguoiDung);
				break;
			default:
				System.out.println("Nhập 0,1,2,3");
			}

		} while (flag);
	}

	public void xuat() {
		for (Person ds : danhSach) {
			ds.xuat();
		}
	}

	// 5 Business method
	public boolean xoa(int ma) {
		for (Person ps : danhSach) {
			if (ps.getMa() == ma) {
				danhSach.remove(ps);
				return true;
			}
		}
		return false;
	}

	private void interchangeSort(ArrayList<Person> _list) {
		int i;
		int j;
		for (i = 0; i < _list.size(); i++) {
			for (j = i + 1; j < _list.size(); j++) {
				Person personI = _list.get(i);
				Person personJ = _list.get(j);
				if (personI.getHoTen().compareToIgnoreCase(personJ.getHoTen()) < 0) {
					Collections.swap(_list, i, j);
				}
			}
		}
	}
	
	public void sapXep() {
		interchangeSort(this.danhSach);
	}

}
