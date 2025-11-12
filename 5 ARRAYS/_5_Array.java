
import java.util.Arrays;

class Tel{
    String courseName;
    int courseCost;
    String city;
}
public class _5_Array {
    public static void main(String[] args) {
        Tel t = new Tel();
        System.out.println(t);

        System.out.println(t.getClass().getName());

        // Tshaped t2 = new Tshaped(); without class we cannot create object

        System.out.println("_________________");

        int a[] = new int[4];
        System.out.println(a);
        System.out.println(a.getClass().getName());


        System.out.println("_________________");
        
        int arr[][] = new int[4][4];
        System.out.println(arr);
        System.out.println(arr.getClass().getName());

        int arr2[] = {8,6,2,4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }   
}
