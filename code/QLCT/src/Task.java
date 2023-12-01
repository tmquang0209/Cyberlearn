import java.util.Scanner;

/*
 * Mục đích: Quản lý nghiệp vụ liên quan đến task cho NV
 * ...
 */
public class Task implements NhapXuat {

	// 1 Attributes
	private String maTask;
	private String tenTask;
	private float thoiGianThucHien;
	private String maNV;

	// 2 Get,set
	public String getMaTask() {
		return maTask;
	}

	public void setMaTask(String maTask) {
		this.maTask = maTask;
	}

	public String getTenTask() {
		return tenTask;
	}

	public void setTenTask(String tenTask) {
		this.tenTask = tenTask;
	}

	public float getThoiGianThucHien() {
		return thoiGianThucHien;
	}

	public void setThoiGianThucHien(float thoiGianThucHien) {
		this.thoiGianThucHien = thoiGianThucHien;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	// 3 Constructor
	public Task() {
		this.maNV = "-1";
	}

	public Task(String maTask, String tenTask, float thoiGianThucHien, String maNV) {
		this.maTask = maTask;
		this.tenTask = tenTask;
		this.thoiGianThucHien = thoiGianThucHien;
		this.maNV = maNV;
	}

	public Task(String maTask, String tenTask, float thoiGianThucHien) {
		super();
		this.maTask = maTask;
		this.tenTask = tenTask;
		this.thoiGianThucHien = thoiGianThucHien;
	}

	// 4 Input,output
	public void nhap(Scanner scan) {

	}

	public void xuat() {
		System.out.println(
				"Mã: " + this.maTask + "\t Tên task: " + this.tenTask + "\t Giờ thực hiện: " + this.thoiGianThucHien);
	}
	// 5 Business method

}
