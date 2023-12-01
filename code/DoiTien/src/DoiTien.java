import java.util.Scanner;

public class DoiTien {

	public DoiTien() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		final int EXCHANGE_RATE = 23000;
		double money;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui lòng nhập số USD cần đổi: ");
		money =  Double.parseDouble(scan.nextLine());
		money *= EXCHANGE_RATE;
		
		System.out.println("Số tiền VNĐ nhận được là:" + money);
	}

}
