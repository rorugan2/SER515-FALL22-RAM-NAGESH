import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() throws FileNotFoundException, IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select buyer or seller");
		String ind=sc.next();
		boolean bool1 = false;
		if(ind.equals("buyer"))
		{
	     FileReader f = new FileReader("C:\\Users\\rorugan2\\Downloads\\515 files\\BuyerInfo.txt");
		 BufferedReader br = new BufferedReader(f);
		 String username,password;
		 boolean bool = false;
		 System.out.println("Enter the username :");
		 username = sc.next();
		 String s = br.readLine();
		 while(s != null){
			StringTokenizer st = new StringTokenizer(s,":");
			while(st.hasMoreTokens()){
              String usr = st.nextToken();
			  String pwd = st.nextToken();
			  if(username.equals(usr)){
				bool = true;
				System.out.println("Enter the password");
				password = sc.next();
				if(password.equals(pwd)){
					System.out.println("login success");
					break;
				}
                System.out.println("Incorrect password");
				break;
			  }
			  bool = false;
			}
			if(bool) break;
			s = br.readLine();
		 }
		 if(!bool) System.out.println("user not found");
        return bool;
		}
		else if(ind.equals("seller"))
		{
			FileReader f = new FileReader("C:\\Users\\rorugan2\\Downloads\\515 files\\SellerInfo.txt");
			BufferedReader br = new BufferedReader(f);
			String username,password;
			boolean bool = false;
			System.out.println("Enter the username :");
			username = sc.next();
			String s = br.readLine();
			while(s != null){
			   StringTokenizer st = new StringTokenizer(s,":");
			   while(st.hasMoreTokens()){
				 String usr = st.nextToken();
				 String pwd = st.nextToken();
				 if(username.equals(usr)){
				   bool = true;
				   System.out.println("Enter the password");
				   password = sc.next();
				   if(password.equals(pwd)){
					   System.out.println("login success");
					   break;
				   }
				   System.out.println("Incorrect password");
				   break;
				 }
				 bool = false;
			   }
			   if(bool) break;
			   s = br.readLine();
			}
			if(!bool) System.out.println("user not found");
		   return bool;
		}
		else
		{
			System.out.println("Invalid input. Do you want to try again(Y/N)");
			 String opt =sc.next();
			 if(opt.equals("Y") || opt.equals("N")){
			 if(opt.equals("Y"))
			 {
				login();
			 }
			 System.out.println("Program exited");
			}
			System.out.println("Invalid option");

			 return bool1;

		}
	}


		


		

		
		
	

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void SelectProduct() {

	}

	public void productOperation() {

	}

}
