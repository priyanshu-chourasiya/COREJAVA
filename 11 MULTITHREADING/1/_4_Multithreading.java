
import java.util.Scanner;

class Alpha extends Thread{
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
class Beta extends Thread{
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
class Gama extends Thread{
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
public class _4_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");

        Alpha a = new Alpha();  // equivalent to creating new thread
        Beta b = new Beta();
        Gama g = new Gama();

        // a.Banking();
        // b.stars();      there activites are already present in run methods
        // g.Importantmessage();

        // a.run();
        // b.run();
        // g.run();

        a.start();
        b.start();
        // g.start();
        a.join();
        b.join();
        g.join(); // main thread have to wait until this thread is done and join main thread

        g.start();
        System.out.println("Application terminated");
    }
}
/*
 * creating object of child class == creating object of parent class
 * 
 * when we have to use Thread then we have to create object of thread class
 * 
 * whenever we call thread do we have to call run method explicitly ? no
 * we just have to give life to thread by giving start method
 * thread will start to execute without wasting CPU's time lifecycle
 * 
 * 
 */