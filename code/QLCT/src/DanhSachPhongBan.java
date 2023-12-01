import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachPhongBan implements NhapXuat {

	private ArrayList<PhongBan> dsPhongBan;
	
	public ArrayList<PhongBan> getDsPhongBan() {
		return dsPhongBan;
	}

	public void setDsPhongBan(ArrayList<PhongBan> dsPhongBan) {
		this.dsPhongBan = dsPhongBan;
	}

	public DanhSachPhongBan() {
		dsPhongBan = new ArrayList<PhongBan>();
	}

	@Override
	public void xuat() {
		for(PhongBan pb : dsPhongBan) {
			pb.xuat();
		}
	}
	
	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/PhongBan.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
			PhongBan pb = new PhongBan(listInfo[1], listInfo[0]);
			dsPhongBan.add(pb);
			}
			reader.close();// Đóng tập tin
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
