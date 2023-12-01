/*
 * Tên chương trình: In ra màn hình số chẵn trong khoảng [x;y] và sinh số ngẫu nhiên trong đoạn [a;b]
 * Ngày tạo: 20/08/2021
 */
import java.util.Scanner;

public class Bai3 {
	final static int MIN = -100;
	final static int MAX = 100;

	public Bai3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = nhapN(sc);
		int mangBanDau[] = taoMang(n);
		inMang(mangBanDau);
		soChanTrongKhoang(mangBanDau, sc);
		soNgauNhien(mangBanDau, sc);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
		System.out.print("Nhập số mảng: ");
		n = Integer.parseInt(scan.nextLine());
		}while(n < 0 || n % 2 != 0);
		return n;
	}

	public static int[] taoMang(int n) {
		int mangDau[] = new int[n];
		for (int i = 0; i < n; i++) {
			mangDau[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return mangDau;
	}

	public static void inMang(int mangDau[]) {
		for (int item : mangDau) {
			System.out.print(item + "\t");
		}
		System.out.print("\n");
	}
	
	public static void soChanTrongKhoang(int mangDau[],Scanner sc) {
		int x,y;
		System.out.println("Số chẵn trong mảng thuộc đoạn [x;y]:");
		do {
			System.out.print("x = ");
			x = Integer.parseInt(sc.nextLine());
			
			System.out.print("y = ");
			y = Integer.parseInt(sc.nextLine());
			
		}while(x > y);
		int count = 0;
		for(int pt : mangDau) {
			if(pt >= x && pt <= y && pt % 2 == 0){
				System.out.print(pt + "\t");
				count++;
			}
		}
		if(count == 0) System.out.print("Không có phần tử chẵn nào trong đoạn [" + x + ";" + y + "]");
	}
	
	public static void soNgauNhien(int mangDau[],Scanner sc) {
		int soDau,soCuoi;
		System.out.println("\nSinh số ngẫu nhiên");
		do {
			System.out.print("a = ");
			soDau = Integer.parseInt(sc.nextLine());
			
			System.out.print("b = ");
			soCuoi = Integer.parseInt(sc.nextLine());
			
		}while(soDau > soCuoi);
		int soNgauNhien = soDau + (int) (Math.random()*((soCuoi-soDau)+1));
	System.out.println("Số ngẫu nhiên là: " + soNgauNhien);
	}
}
