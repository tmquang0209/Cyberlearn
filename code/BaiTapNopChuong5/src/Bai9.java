import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {

	public Bai9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soTien;
		do {
			System.out.println("Số tiền > 5");
		System.out.print("Nhập vào số tiền (nghìn đồng): ");
		soTien = Integer.parseInt(sc.nextLine());
		demSoTo(soTien);
		}while(soTien < 5);

	}

	public static int demSoTruongHop(int soTien) {
		int count = 0;

		for (int y = 1; y <= soTien / 2; y++) {
			for (int z = 0; z <= soTien / 5; z++) {
				int x = soTien - (2 * y + 5 * z);
				if (x >= 0 && y >= x + z) {
					count++;
				}
			}
		}
		return count;
	}
	public static int giaTriNhoNhat(int soTien) {
		int soTH = demSoTruongHop(soTien);
		int[] arr = new int[soTH];
		int i = 0;
		for (int y = 1; y <= soTien / 2; y++) {
			for (int z = 0; z <= soTien / 5; z++) {
				int x = soTien - (2 * y + 5 * z);
				if (x >= 0 && y >= x + z) {
					int tong = x + y + z;
					arr[i] = tong;
					i++;
				}
			}
		}
		Arrays.sort(arr);
		return arr[0];
	}
	
	public static void demSoTo(int soTien) {
		int sumMin = giaTriNhoNhat(soTien);
		for (int y = 1; y <= soTien / 2; y++) {
			for (int z = 0; z <= soTien / 5; z++) {
				int x = soTien - (2 * y + 5 * z);
				if(x >= 0 && y >= x+ z) {
				int tong = x + y + z;
				if (tong == sumMin) {
					System.out.println("Số tờ 1000: " + x);
					System.out.println("Số tờ 2000: " + y);
					System.out.println("Số tờ 5000: " + z);
				}
				}
			}
		}
	}
	
}
