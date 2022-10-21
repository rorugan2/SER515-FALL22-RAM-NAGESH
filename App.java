import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Facade facade = new Facade();
        ProduceProductMenu menu = new ProduceProductMenu();
        MeatProductMenu m = new MeatProductMenu();
        Person p = new Person();
        Seller s = new Seller();
        Buyer b = new Buyer();
        Scanner sc = new Scanner(System.in);
        if(facade.login()){
            System.out.println("Bridge pattern implemented");
            System.out.println("1. meat menu 2. produce menu");
            System.out.println("enter the menu option");
            int option = sc.nextInt();
            if(option ==1){
                m.showMenu();
                //System.out.println("enter the number of item to add to cart");
               // int n = sc.nextInt();

            }
            else if (option == 2){
                menu.showMenu();
            }
            else{System.out.println("invalid option");}
               System.out.println("persons product information");
               System.out.println("factory design pattern implemented");
               p.showMenu();
               System.out.println(" ");
               System.out.println("seller selling menu");
               s.showMenu();
               System.out.println("Buyer interested items ");
               b.showMenu();


            
        }


    }
}
