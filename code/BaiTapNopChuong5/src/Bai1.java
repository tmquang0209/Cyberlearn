/*
 * Tên chương trình: Oẳn tù tì
 * Ngày tạo: 14/08/2021
 */

import java.util.Scanner;
public class Bai1 {

	public Bai1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("Chơi oẳn tù tì");
		kiemTra();
	}

	public static void kiemTra() {
		Scanner scan = new Scanner(System.in);

		int banThang = 0;
		int mayThang = 0;
		boolean exit = false;

		do {
			int mayChon = (int) (Math.random() * 3 + 1);

			System.out.println("1. Kéo \t 2. Búa \t 3. Bao \t Nhập số khác 0,1,2,3 để thoát");
			int luaChon = Integer.parseInt(scan.nextLine());

			if (luaChon == 1) { // kéo
				if (mayChon == 1) {
					System.out.println("Hòa");
				} else if (mayChon == 2) {
					System.out.println("Máy thắng");
					mayThang++;
				} else {
					System.out.println("Bạn thắng");
					banThang++;
				}
			} else if (luaChon == 2) { // búa
				if (mayChon == 2) {
					System.out.println("Hòa");
				} else if (mayChon == 3) {
					System.out.println("Máy thắng");
					mayThang++;
				} else {
					System.out.println("Bạn thắng");
					banThang++;
				}
			} else if (luaChon == 3) { // bao
				if (mayChon == 3) {
					System.out.println("Hòa");
				} else if (mayChon == 1) {
					System.out.println("Máy thắng");
					mayThang++;
				} else {
					System.out.println("Bạn thắng");
					banThang++;
				}
			}else if(luaChon != 0) {
				exit = true;
			}
		} while (!exit);
		if(banThang > mayThang) {
			System.out.println("Bạn thắng nhiều hơn máy");
		}else {
			System.out.println("Máy thắng nhiều hơn bạn");
		}
		System.out.println("Tỷ số: Bạn " + banThang + " Máy " + mayThang);
	}

}
