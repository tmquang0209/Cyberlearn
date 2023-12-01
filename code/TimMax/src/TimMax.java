import java.util.Scanner;

public class TimMax {

	public TimMax() {
		// TODO Auto-generated constructor stub
	}

	public static int timMax(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Vui long nhap vao so thu nhat: ");
		int soNhat = Integer.parseInt(sc.nextLine());
		
		System.out.print("Vui long nhap vao so thu hai: ");
		int soHai = Integer.parseInt(sc.nextLine());
		
		System.out.print("Vui long nhap vao so thu ba: ");
		int soBa = Integer.parseInt(sc.nextLine());
	
		
		int ketQua = timMax(soNhat,soHai,soBa);
		
		System.out.print("So lon nhat la: \t" + ketQua);
	}

}
