import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// vongLapFor();
		// vongLapWhile();
		// tongSoChanFor(scan);
		// tongSoChanWhile(scan);
		// soChiaHetCho3For();
		//soChiaHetCho3While();
		//tinhGiaiThua(scan);
	}

//Bài 1
//Cách 1
	public static void vongLapFor() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " là số chẵn");
			} else {
				System.out.println(i + " là số lẻ");
			}
		}
	}

//Cách 2
	public static void vongLapWhile() {
		boolean flag = true;
		int i = 1;
		while (flag) {
			if (i < 100) {
				if (i % 2 == 0) {
					System.out.println(i + " là số chẵn");
				} else {
					System.out.println(i + " là số lẻ");
				}
			} else {
				flag = false;
			}
			i++;
		}
	}

//Bài 2
	public static void tongSoChanFor(Scanner scan) {
		System.out.print("Nhap vao 1 so bat ky lon hon 1: ");
		int number = Integer.parseInt(scan.nextLine());
		int tong = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				tong += i;
			}
		}
		System.out.println("Tong cac so chan tu 1 den " + number + " la " + tong);
	}

	public static void tongSoChanWhile(Scanner scan) {
		System.out.print("Nhap vao 1 so bat ky lon hon 1: ");
		int number = Integer.parseInt(scan.nextLine());
		int tong = 0;
		int i = 1;
		boolean flag = true;

		while (flag) {
			if (i <= number) {
				if (i % 2 == 0) {
					tong += i;
				}
			} else {
				flag = false;
			}
			i++;
		}
		System.out.println("Tong cac so chan tu 1 den " + number + " la " + tong);
	}

//bai 3
	public static void soChiaHetCho3For() {
		int count = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		System.out.println("Co " + count + " so chia het cho 3 tu 0-1000");
	}

	public static void soChiaHetCho3While() {
		boolean flag = true;
		int i = 0;
		int count = 0;
		while (flag) {
			if (i <= 1000) {
				if (i % 3 == 0)
					count++;
			} else {
				flag = false;
			}
			i++;
		}
		System.out.println("Co " + count + " so chia het cho 3 tu 0-1000");
	}

//bai 4
	public static void tinhGiaiThua(Scanner scan) {
		System.out.println("Nhap vao 1 so: ");
		int number = Integer.parseInt(scan.nextLine());
		int ketQua = 1;
		int i;

		if (number == 0 || number == 1) {
			ketQua = 1;
		} else if (number > 1){
			for (i = 1; i <= number; i++) {
				ketQua *= i;
			}
		}else {
			for (i = - 1 ; i >= number ; i--) {
				ketQua *= i;
			}
		}

		System.out.println("Ket qua " + number + "! la: " + ketQua);
	}
}
