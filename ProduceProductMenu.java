import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.StringTokenizer;
public class ProduceProductMenu implements ProductMenu {

	public void showMenu(){
		try {
			FileReader f = new FileReader("C:\\Users\\rorugan2\\Downloads\\515 files\\ProductInfo.txt");
			BufferedReader br = new BufferedReader(f);
			String s = br.readLine();
			while (s!=null){
				System.out.println(s);
				s=br.readLine();
			}			
		}			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	


	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}

}
