import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		final float HE_SO = 1.5f;
		float cash;
		float time;
		float money = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vui lòng nhập số tiền: ");
		cash = Float.parseFloat(scan.nextLine());
		
		System.out.print("Vui lòng nhập số giờ: ");
		time = Float.parseFloat(scan.nextLine());
		
		if (time > 40) {
			time -= 40;
			money = time * cash;
		}
		
		System.out.print("Bạn nhận được:\t" + money + "VNĐ");
	}

}
