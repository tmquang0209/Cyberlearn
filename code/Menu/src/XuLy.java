import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhập số a: ");
		float a = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập số b: ");
		float b = Float.parseFloat(scan.nextLine());

		xuLyMenu(scan, a, b);
	}

	public static void inMenu() {
		System.out.println("Vui lòng chọn");
		System.out.println("1. Tính tổng");
		System.out.println("2. Tính hiệu");
		System.out.println("3. Tính nhân");
		System.out.println("4. Tính chia");
		System.out.println("0. Thoát");

	}

	public static void xuLyMenu(Scanner scan, float a, float b) {
		float ketQua = 0;
		boolean flag = true;
		do {
			// in menu
			inMenu();
			System.out.print("Chọn >>");
			int luaChon = Integer.parseInt(scan.nextLine());
			switch (luaChon) {
			case 1:
				System.out.println("Tổng 2 số: " + a + "\t+" + b + " là \t" + (a + b));
				break;
			case 2:
				System.out.println("Hiệu 2 số: " + a + "\t-" + b + " là \t" + (a - b));
				break;
			case 3:
				System.out.println("Nhân 2 số: " + a + "\t*" + b + " là \t" + (a * b));
				break;
			case 4:
				if (b == 0) {
					System.out.println("số b phải khác 0");
				} else {
					System.out.println("Thương 2 số: " + a + "\t/" + b + " là \t" + (a / b));
				}
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Nhập không hợp lệ");
			}

		} while (flag);
	}
}
