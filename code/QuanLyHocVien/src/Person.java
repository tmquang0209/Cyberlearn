import java.util.Scanner;

public class Person {

	// 1 Attributes
	/*
	 * + ma : int + hoTen : String + diaChi : String + email : String
	 */
	protected int ma;
	protected String hoTen;
	protected String diaChi;
	protected String email;

	// 2 Get,set
	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 3 Constructor
	public Person() {

	}

	public Person(int ma, String hoTen, String diaChi, String email) {
		super();
		this.ma = ma;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.email = email;
	}

	// 4 Input, output
	public void nhap(Scanner scan) {
		System.out.print("Mã: ");
		this.ma = Integer.parseInt(scan.nextLine());
		System.out.print("Họ tên: ");
		this.hoTen = scan.nextLine();
		System.out.print("Địa chỉ: ");
		this.diaChi = scan.nextLine();
		System.out.print("Email: ");
		this.email = scan.nextLine();
	}

	public void xuat() {
		System.out.print("Mã: " + ma + "\t Họ tên: " + hoTen + "\t Địa chỉ: " + diaChi + "\t Email: " + email);
	}
	// 5 Business method

}
