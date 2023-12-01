import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static String chanLe(int number) {
		if (number % 2 == 0) {
		   return "So chan";
		} else {
			return "So le";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao mot so: ");
		int so = Integer.parseInt(sc.nextLine());
		
		System.out.println(chanLe(so));

	}

}
