import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Facade facade = new Facade();
        ProduceProductMenu menu = new ProduceProductMenu();
        Scanner sc = new Scanner(System.in);
        if(facade.login()){
            menu.showMenu();
        }


    }
}
