import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Buyer extends Person {

	public void showMenu() {
		try {
			FileReader f = new FileReader("C:\\Users\\rorugan2\\Downloads\\515 files\\UserProduct.txt");
			BufferedReader br = new BufferedReader(f);
			String s = br.readLine();
			while (s!=null){
				StringTokenizer st = new StringTokenizer(s,":");
				while(st.hasMoreTokens()){
					String user = st.nextToken();
					String item = st.nextToken();
					if(user.equals("tutu") || user.equals("nana") || user.equals("mimi"))
					{
						
						System.out.println(user +":"+item);
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

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
