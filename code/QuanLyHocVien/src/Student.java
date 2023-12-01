import java.util.Scanner;

public class Student extends Person {

	// 1 Attributes
	/*
	 * + diemToan : float + diemLy : float + diemHoa : float
	 */
	private float diemToan;
	private float diemLy;
	private float diemHoa;

	// 2 Get,set
	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	// 3 Constructor
	public Student() {
		super();
	}

	public Student(int ma, String hoTen, String diaChi, String email, float diemToan, float diemLy, float diemHoa) {
		super(ma, hoTen, diaChi, email);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	// 4 Input, output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Điểm toán: ");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.print("Điểm lý: ");
		this.diemLy = Float.parseFloat(scan.nextLine());
		System.out.print("Điểm hóa: ");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}

	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Điểm toán: " + diemToan + "\t Điểm lý: " + diemLy + "\t Điểm hóa: " + diemHoa);
	}
	// 5 Business method

}
