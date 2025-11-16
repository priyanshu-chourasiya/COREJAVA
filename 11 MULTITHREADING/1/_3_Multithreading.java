
import java.util.Scanner;

class Alpha{
    public void Banking(){
        System.out.println("Banking activity started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user number : ");
        int un = sc.nextInt();
        System.out.println("Enter the password");
        int pass = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking activity terminated");
    }
}
class Beta{
    public void stars() throws Exception{
        System.out.println("Prining activity started");
        for (int i = 0; i < 3; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");
    }
}
class Gama{
    public void Importantmessage() throws Exception{
        System.out.println("Prining important message started");
        for (int i = 0; i < 3; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message terminated");
    }
}
public class _3_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");

        Alpha a = new Alpha();
        Beta b = new Beta();
        Gama g = new Gama();
        a.Banking();
        b.stars();
        g.Importantmessage();
        System.out.println("Application terminated");
    }
}
