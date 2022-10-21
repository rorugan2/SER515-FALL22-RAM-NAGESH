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
        Scanner sc = new Scanner(System.in);
        if(facade.login()){
            System.out.println(" ");
            menu.showMenu();
            System.out.println(" ");
            m.showMenu();
            System.out.println(" ");
            p.showMenu();
            System.out.println(" ");
            s.showMenu();

            
        }


    }
}
