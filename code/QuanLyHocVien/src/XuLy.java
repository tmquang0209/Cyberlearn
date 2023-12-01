import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		doMenu(scan);

	}

	private static void printMenu() {
		System.out.println("<MENU>");
		System.out.println("1. Thêm");
		System.out.println("2. Xóa");
		System.out.println("3. Sắp xếp theo tên");
		System.out.println("4. Xuất danh sách");
		System.out.println("0. Thoát");
	}

	private static void doMenu(Scanner scan) {
		boolean flag = true;
		ListPerson objListPerson = new ListPerson();
		do {
			printMenu();
			System.out.print("Chọn > ");
			int chon = Integer.parseInt(scan.nextLine());

			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				objListPerson.nhap(scan);
				break;
			case 2:
				System.out.print("Mã cần xóa: ");
				int ma = Integer.parseInt(scan.nextLine());
				boolean personDelete = objListPerson.xoa(ma);
				if(personDelete) {
					System.out.println("Xóa thành công");
				}else {
					System.out.println("Xóa thất bại");
				}
				break;
			case 3:
				objListPerson.sapXep();
				objListPerson.xuat();
				break;
			case 4:
				objListPerson.xuat();
				break;
			}
		} while (flag);
	}

}
