import java.util.Scanner;
class Alpha{
    public void calc(){
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
class Beta{
    public void display(){
        System.out.println("Beta connection established");
        Alpha a = new Alpha();
        a.calc();
        System.out.println("Beta connection terminated");
    }
}
public class _4_Exception {
    public static void main(String[] args) {
        System.out.println("Main connection established");
        Beta b = new Beta();
        b.display();
        System.out.println("Main connection terminated");

    }
}
/*
 * if excpetion is not handled in one stack frame/ in one method
 * automatically exception object will be propogated down the hirarchy
 * 
 * 
 * 
 *  Main connection established
    Beta connection established
    Alpha connection established
    Kindly enter the numerator : 45
    kindly enter denomirator : 0
    Exception in thread "main" java.lang.ArithmeticException: / by zero
            at Alpha.calc(_4_Exception.java:13)
            at Beta.display(_4_Exception.java:23)
            at _4_Exception.main(_4_Exception.java:31)
 */