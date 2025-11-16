import java.util.Scanner;

public class _2_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");
        System.out.println("Banking activity started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user number : ");
        int un = sc.nextInt();
        System.out.println("Enter the password");
        int pass = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking activity terminated");

        System.out.println("Prining activity started");
        for (int i = 0; i < 10; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");

        System.out.println("Prining important message started");
        for (int i = 0; i < 10; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message terminated");

        System.out.println("Application terminated");
    }
}
// cpu time cycle is getting wasted 
// line by line execution
// only single thread