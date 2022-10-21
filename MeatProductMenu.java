import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MeatProductMenu implements ProductMenu {

	public void showMenu() {
		try {
			FileReader f = new FileReader("C:\\Users\\rorugan2\\Downloads\\515 files\\ProductInfo.txt");
			BufferedReader br = new BufferedReader(f);
			System.out.println("meat product menu");
			int i=0;
			String s = br.readLine();
			while (s!=null){
				StringTokenizer st = new StringTokenizer(s,":");
				while(st.hasMoreTokens()){
					
					String product = st.nextToken();
					String value = st.nextToken();
					if(product.equals("Meat"))
					{
						i=i+1;
						System.out.println(i+" "+product +":"+value);

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
	
		
	

}
