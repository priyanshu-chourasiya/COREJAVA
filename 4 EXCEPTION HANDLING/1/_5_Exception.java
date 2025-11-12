import java.util.Scanner;
class Alpha{
    public void calc(){
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
        catch(Exception e){
            System.out.println("Problem occured");
        }
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
public class _5_Exception {
    public static void main(String[] args) {
        System.out.println("Main connection established");
        Beta b = new Beta();
        b.display();
        System.out.println("Main connection terminated");

    }
}
/*
 * if we already handle expection it does not get propogated
 */