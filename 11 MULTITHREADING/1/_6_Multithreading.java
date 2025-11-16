
import java.util.Scanner;

class Alpha extends Thread{
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("BANK")){
            Banking();
        }
        else if(threadName.equals("STAR")){
            try {
                stars();
            } catch (Exception ex) {
            }
        }
        else{
            try {
                Importantmessage();
            } catch (Exception ex) {
            }
        }
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
    public void stars() throws Exception{
        System.out.println("Prining activity started");
        for (int i = 0; i < 3; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");
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
public class _6_Multithreading {
    public static void main(String[] args) {
        System.out.println("Application started");

        Alpha a = new Alpha();  // equivalent to creating new thread

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);   // we cannot control which thread will get executed
        Thread t3 = new Thread(a);

        t1.setName("BANK");
        t2.setName("STAR");
        t3.setName("FOCUS");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Application terminated");
    }
}
