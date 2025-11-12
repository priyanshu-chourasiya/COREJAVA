import java.util.Scanner;
class Alpha{
    public void calc() throws ArithmeticException{ // informing that this method will throw
                // caller must handle exception
                // is called duck the exception
        System.out.println("Alpha connection established");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Kindly enter the numerator : ");
        int n = sc.nextInt();

        System.out.print("kindly enter denomirator : ");
        int d = sc.nextInt();

        int res = n/d;
        System.out.println("Result is : " +res);       
        
        System.out.println("Alpha Connection terminated");
    }
}
public class _6_Exception {
    public static void main(String[] args) {
        try{
        System.out.println("Main connection established");
        Alpha a = new Alpha();
        a.calc();
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught at main method");
        }
        System.out.println("Main connection terminated");

    }
}
