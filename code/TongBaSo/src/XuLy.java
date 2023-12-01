import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
public static int tongBaSo(int a, int b, int c) {
	int sum = a + b + c;
	return sum;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		int soNhat = Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhap so thu hai: ");
		int soHai = Integer.parseInt(sc.nextLine());
		
		System.out.print("Nhap so thu ba: ");
		int soBa = Integer.parseInt(sc.nextLine());
		
		System.out.println("Tong ba so da nhap la:\t" + tongBaSo(soNhat, soHai, soBa));

	}

}
