import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachTask implements NhapXuat {

	private ArrayList<Task> dsTask;

	public ArrayList<Task> getDsTask() {
		return dsTask;
	}

	public void setDsTask(ArrayList<Task> dsTask) {
		this.dsTask = dsTask;
	}

	public DanhSachTask() {
		dsTask = new ArrayList<Task>();
	}

	@Override
	public void xuat() {
		for (Task task : dsTask) {
			task.xuat();
		}
	}

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/Task1.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] listInfo = line.split(" # ");
				Task task = new Task(listInfo[0], listInfo[1], Float.parseFloat(listInfo[2]));
				dsTask.add(task);
			}
			reader.close();// Đóng tập tin
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
