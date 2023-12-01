/*
 * Tên chương trình: tính giá trị trung bình của 5 số được nhập vào từ bàn phím
 * Ngày tạo: 6/8/2021
 */
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		final int QUOTIENT = 5;
		final int NUMBER_PADD_LEFT = -70;
		float number;
		
		Scanner nhap = new Scanner(System.in);
		System.out.print("Vui lòng nhập vào số thứ nhất:");
		number = Integer.parseInt(nhap.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ hai:");
		number += Integer.parseInt(nhap.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ ba:");
		number += Integer.parseInt(nhap.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ thư:");
		number += Integer.parseInt(nhap.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ năm:");
		number += Integer.parseInt(nhap.nextLine());
		
		//tinh tong
		number /= QUOTIENT;
		
		System.out.println(String.format("%1$" + NUMBER_PADD_LEFT + "s","Giá-trị-trung-bình-của-5-số-vừa-nhập-là:").replace(' ', '.').replace('-', ' ') + number);

	}

}
