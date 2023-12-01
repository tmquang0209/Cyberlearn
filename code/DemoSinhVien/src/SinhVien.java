
public class SinhVien {
	private String hoTen;
	private String email;
	
	public SinhVien() {
		
	}
	
	public String getHoTen() {
		return this.hoTen;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public SinhVien(String ten,String mail) {
		this.hoTen = ten;
		this.email = mail;
	}
}
