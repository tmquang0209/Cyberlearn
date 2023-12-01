/*
 * Tên chương trình: Vẽ tam giác từ chiều cao nhập vào
 * Ngày tạo: 14/08/2021
 */
import java.util.Scanner;

public class Bai7 {

	public Bai7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		do {
			System.out.print("Nhập vào chiều cao: ");
			height = Integer.parseInt(sc.nextLine());
		} while (height <= 0);
		
		inTamGiacDac(height);
		System.out.println("\n");
		inTamGiacRong(height);
	}

	public static void inTamGiacDac(int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height-i; j++) {
				System.out.print("\t");
			}
			for(int k = 1; k <= 2*i - 1;k++) {
				System.out.print("*	");
			}
			System.out.println("");
		}
	}
	
	public static void inTamGiacRong(int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height-i; j++) {
				System.out.print("\t");
			}
			for(int k = 1; k <= 2*i - 1;k++) {
				if(k == 1 || k == 2*i-1 || i == height) {
				System.out.print("*	");
				}else {
				System.out.print("\t");
				}
			}
			System.out.println("");
		}
	}

}
