import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int day;
		int month;
		int year;
		int songay;
		int dayOfWeek = 0;
		String top;
		boolean err = true;
		Scanner sc = new Scanner(System.in);

		System.out.print("Vui lòng nhập ngày: ");
		day = Integer.parseInt(sc.nextLine());

		System.out.print("Vui lòng nhập tháng: ");
		month = Integer.parseInt(sc.nextLine());

		System.out.print("Vui lòng nhập năm: ");
		year = Integer.parseInt(sc.nextLine());

		if (year < 1582) {
			err = false;
		}

		if (month < 0 || month > 12) {
			err = false;
		}
		// kiểm tra ngày, tháng, năm
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			songay = 31;
			break;
		case 2:
			songay = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			songay = 30;
			break;
		default:
			err = false;
		}

		if (err) {
			int a = (14-month)/12;
			year -= a;
			month += 12 * a - 2;
			dayOfWeek = (day + year + year / 4 - year / 100 + year / 400 + (31 * month) / 12) % 7;
			if(dayOfWeek == 0) {
				top = "Chủ nhật";
			}else {
				top = "Thứ " + (dayOfWeek + 1);
			}
			System.out.print(top);
		} else {
			System.out.print("Đầu vào không hợp lệ.");
		}
	
//System.out.print(dayOfWeek);
	}

}
