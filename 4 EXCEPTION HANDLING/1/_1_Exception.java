import java.util.Scanner;

class _1_Exception{
    public static void main(String[] args) {
        System.out.println("Connection established");

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
            System.out.println("Please enter non zero denominarator");
        }
        System.out.println("Connection terminated");
    }
}