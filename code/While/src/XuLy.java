import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float tong = tinhTong(scan);
		System.out.println("Tổng là: " + tong);
		
	}

	public static float tinhTong(Scanner scan) {
		float tong = 0;
		float num = 1;
		boolean flag = true;
		
		while(num > 0) {
			System.out.println("Nhập 1 số lớn hơn 0: ");
			num = Float.parseFloat(scan.nextLine());
			if(num < 0) {
				flag = false;
			}else {
				tong += num;
			}
		}
		return tong;
	}
}
