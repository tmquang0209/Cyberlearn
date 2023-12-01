import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		xuLyRandom(scan);
		
	}
	
	public static void xuLyRandom(Scanner scan) {
		
		int random = (int) (Math.random() * 99 + 1);
		int so;
		
		do {
			System.out.print("Vui lòng nhập vào 1 số: ");
			so = Integer.parseInt(scan.nextLine());
			
			if(so > random) {
				System.out.println("Lớn hơn số random");
			}else if(so < random) {
				System.out.println("Bé hơn số random");
			}
			
		}while(so != random);
	System.out.println("Winnn");
	}

}
