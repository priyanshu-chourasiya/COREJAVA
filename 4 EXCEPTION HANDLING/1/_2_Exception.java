import java.util.Scanner;

public class _2_Exception {
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
        
        System.out.println("Kindly enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Kindly enter element to be inserted in an array : ");
        int ele = sc.nextInt();

        System.out.println("kindly enter position at which element to be inserted : ");
        int index = sc.nextInt();
        arr[index] = ele;
        System.out.println("Data inserted in an array is : " + arr[index]);
        }
        catch(ArithmeticException e){
            System.out.println("Please enter non zero number");
        }
        catch(NegativeArraySizeException e){
            System.out.println("please give postive array size");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
        catch(Exception e){ // this main exception should be at last else will throw error
            System.out.println("Some problem");
        }
        System.out.println("Connection terminated");
    }
}
