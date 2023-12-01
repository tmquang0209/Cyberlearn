import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số N: ");
		int n = Integer.parseInt(sc.nextLine());
		thapHaNoi(n, 'A', 'B', 'C');

	}
	
	public static void chuyen(int n, char X, char Y) {
		System.out.println("Chuyển đĩa thứ " + n + " từ cột " + X + " sang cột " + Y);
	}
	
	public static void thapHaNoi(int n, char A, char B, char C) {
		if(n == 1) {
			chuyen(1,A,C);
		}else {
			thapHaNoi(n-1,A,C,B);
			chuyen(n,A,C);
			thapHaNoi(n-1,B,A,C);
		}
	}

}
