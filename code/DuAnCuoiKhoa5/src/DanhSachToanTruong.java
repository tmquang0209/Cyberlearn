import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachToanTruong implements NhapXuat {

	// 1 Attributes
	private ArrayList<ToanTruong> dsToanTruong;

	// 2 Get,set
	public ArrayList<ToanTruong> getDsToanTruong() {
		return dsToanTruong;
	}

	public void setDsToanTruong(ArrayList<ToanTruong> dsToanTruong) {
		this.dsToanTruong = dsToanTruong;
	}

	// 3 Constructor
	public DanhSachToanTruong() {
		dsToanTruong = new ArrayList<ToanTruong>();
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub

	}

	@Override
	public void xuat() {
		for (ToanTruong tt : dsToanTruong) {
			tt.xuat();
		}
	}

	// 4 Input,output

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/NhanSu.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				ToanTruong tt;
			//Kiểm tra là giáo viên hay học sinh 
				if (listInfo[listInfo.length - 1].equalsIgnoreCase("true")) {
					tt = new GiaoVien();
					((GiaoVien) tt).setNamBatDauDay(listInfo[3]);
					((GiaoVien) tt).setChuyenMon(Integer.parseInt(listInfo[4]));

				} else {
					tt = new HocSinh();
					((HocSinh) tt).setDiemToan(Float.parseFloat(listInfo[3]));
					((HocSinh) tt).setDiemVan(Float.parseFloat(listInfo[4]));
					((HocSinh) tt).setDiemAnh(Float.parseFloat(listInfo[5]));
				}

				tt.setHoTen(listInfo[0]);
				tt.setDiaChi(listInfo[1]);
				tt.setNamSinh(listInfo[2]);

				this.dsToanTruong.add(tt);

			}
			reader.close();// Đóng tập tin
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 5 Business method
	

}
