import java.util.ArrayList;

public abstract class ToanTruong implements NhapXuat {

	// 1 Attributes
	protected String hoTen;
	protected String namSinh;
	protected String diaChi;

	// 2 Get,set
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// 3 Constructor
	public ToanTruong() {
		// TODO Auto-generated constructor stub
	}

	public ToanTruong(String hoTen, String namSinh, String diaChi) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
	}

	// 4 Input,output
	@Override
	public void nhap() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xuat() {
		System.out.print("Họ tên: " + hoTen + "\t Năm sinh: " + namSinh + "\t Địa chỉ: " + diaChi);

	}

	// 5 Business method

}
