import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}
	public void showMeatmenu(){
		try {
			FileReader f = new FileReader("C:\\Users\\rorugan2\\Downloads\\515 files\\ProductInfo.txt");
			BufferedReader br = new BufferedReader(f);
			String s = br.readLine();
			while (s!=null){
				StringTokenizer st = new StringTokenizer(s,":");
				while(st.hasMoreTokens()){
					String product = st.nextToken();
					String value = st.nextToken();
					if(product.equals("Meat"))
					{
						System.out.println("meat product menu");
						System.out.println(product +":"+value);
					}
					
				}
				
				s=br.readLine();
			}			
		}			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
