import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào 1 số: ");
		int so = Integer.parseInt(scan.nextLine());
		demChuSo(so);
	}

	public static void demChuSo(int so) {
		int count = 0;
		int soBanDau = so;
		int soDangTach;
		int tong = 0;

		do {
			soDangTach = soBanDau % 10;
			count++;
			tong += soDangTach;
			soBanDau /= 10;
		} while (soBanDau != 0);		
		
		System.out.println("Số " + so + " có " + count + " chữ số");
		System.out.println("Chữ số hàng đơn vị là: " + so % 10);
		System.out.println("Chữ số đầu tiên là: " + soDangTach);
		System.out.println("Tổng các chữ số: " + tong);
		System.out.print("Số đảo ngược là: " );
		//loại bỏ số 0
		while(so % 10 == 0) {
			so /= 10;
		}
		do {
			System.out.print(so%10);
			so /= 10;
		}while(so != 0);
	}

}
