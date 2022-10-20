import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Facade facade = new Facade();
        Scanner sc = new Scanner(System.in);
        facade.login();


    }
}
