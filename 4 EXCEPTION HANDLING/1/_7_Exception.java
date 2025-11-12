import java.util.Scanner;
class Alpha{
    public void calc() throws ArithmeticException{ // informing that this method will throw
                // caller must handle exception
                // is called duck the exception
        System.out.println("Alpha connection established");
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Kindly enter the numerator : ");
        int n = sc.nextInt();

        System.out.print("kindly enter denomirator : ");
        int d = sc.nextInt();

        int res = n/d;
        System.out.println("Result is : " +res);       
        }
        catch(ArithmeticException e){
            System.out.println("Handles at Alpha class");
            throw e; // like return after throw lines will not get executed
        }
        System.out.println("Alpha Connection terminated"); // this line wont get executed
    }
}
public class _7_Exception {
    public static void main(String[] args) {
        
        System.out.println("Main connection established");
        try{
        Alpha a = new Alpha();
        a.calc();
        }
        catch(ArithmeticException e){
            System.out.println("Handles at Main class");
        }
        System.out.println("Main connection terminated");

    }
}
