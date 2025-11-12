import java.util.Scanner;

public class _1_Array {
    public static void main(String[] args) {
        int marks[] = new int[5];
        // or
        int[] arr = new int[5];
        // marks[0] = 110;
        // marks[1] = 920;
        // marks[2] = 102;
        // marks[3] = 190;
        // marks[4] = 130;
        // System.out.println(marks[0]);

        // marks.length // keyword not method

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks of student : "); 
        // marks[0] = sc.nextInt();                      ;

        for (int i = 0; i < 5;i++) {
            System.out.print("Enter the marks of student : " + i + " : ");
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i < marks.length ; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
/*
 * in java array is treated as an Object
 * 
 */