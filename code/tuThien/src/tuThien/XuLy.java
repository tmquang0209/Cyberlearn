package tuThien;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		final int NUM_CHAR_PADD_LEFT = -120;
		String nameFilm;
		int giaveLon,giaveEm,soveLon,soveEm,percentTuThien;
		float doanhThu,moneyTuThien,moneyRemaining;
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap ten film: ");
		nameFilm = nhap.nextLine();
		System.out.print("Nhap gia ve nguoi lon: ");
		giaveLon = Integer.parseInt(nhap.nextLine());
		System.out.print("Nhap gia ve tre em: ");
		giaveEm = Integer.parseInt(nhap.nextLine());
		System.out.print("Nhap so nguoi lon: ");
		soveLon = Integer.parseInt(nhap.nextLine());
		System.out.print("Nhap so tre em: ");
		soveEm = Integer.parseInt(nhap.nextLine());
		System.out.print("Phan tram tu thien: ");
		percentTuThien = Integer.parseInt(nhap.nextLine());
		
		doanhThu = soveLon*giaveLon + soveEm*giaveEm;
		moneyTuThien = (1.0f)*percentTuThien/100 * doanhThu;
		moneyRemaining = doanhThu - moneyTuThien;
		
		
		System.out.println(String.format("%1$"+ NUM_CHAR_PADD_LEFT + "s","Tên-phim").replace(' ', '.').replace('-', ' ') + nameFilm);
		System.out.println(String.format("%1$"+ NUM_CHAR_PADD_LEFT + "s","Số-vé-đã-bán:").replace(' ', '.').replace('-', ' ') + (soveEm+soveLon));
		System.out.println(String.format("%1$"+ NUM_CHAR_PADD_LEFT + "s","Doanh-thu:").replace(' ', '.').replace('-', ' ') + doanhThu);
		System.out.println(String.format("%1$"+ NUM_CHAR_PADD_LEFT + "s","Trích-phần-trăm-từ-thiện:").replace(' ', '.').replace('-', ' ') + percentTuThien);
		System.out.println(String.format("%1$"+ NUM_CHAR_PADD_LEFT + "s","Tổng-tiền-trích-từ-thiện:").replace(' ', '.').replace('-', ' ') + moneyTuThien);
		System.out.println(String.format("%1$"+ NUM_CHAR_PADD_LEFT + "s","Tổng-thu-được-sau-khi-trừ:").replace(' ', '.').replace('-', ' ') + moneyRemaining);
	}

}
