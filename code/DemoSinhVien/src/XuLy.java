
public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		sv1.setHoTen("Cyberlearn");
		sv1.setEmail("cyberlearn@gmail.coim");

		SinhVien sv2 = new SinhVien("Cybersoft", "cybersoft@gmail.com");

		System.out.println("Họ tên " + sv1.getHoTen() + " - Email " + sv1.getEmail());
		System.out.println("Họ tên " + sv2.getHoTen() + " - Email " + sv2.getEmail());

	}

}
