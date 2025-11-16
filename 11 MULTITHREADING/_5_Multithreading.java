
import java.util.Scanner;

class Alpha implements Runnable{
    @Override
    public void run(){
        Banking();
    }
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
class Beta implements Runnable{
    @Override
    public void run(){
        try {
            stars();
        } catch (Exception ex) {
        }
    }
    public void stars() throws Exception{
        System.out.println("Prining activity started");
        for (int i = 0; i < 3; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");
    }
}
class Gama implements Runnable{
    @Override
    public void run(){
        try {
            Importantmessage();
        } catch (Exception ex) {
        }
    }
    public void Importantmessage() throws Exception{
        System.out.println("Prining important message started");
        for (int i = 0; i < 3; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message terminated");
    }
}
public class _5_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");

        Alpha a = new Alpha();  // equivalent to creating new thread
        Beta b = new Beta();
        Gama g = new Gama();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(g);

        System.out.println(t1.isAlive()); // false
        System.out.println(t2.isAlive()); // false
        System.out.println(t3.isAlive()); // false

        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.isAlive()); // true
        System.out.println(t2.isAlive()); // true
        System.out.println(t3.isAlive()); // true

        System.out.println("Application terminated");
    }
}
// main thread always finishes first
