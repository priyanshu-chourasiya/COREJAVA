import java.util.Scanner;

public class _2_Array {
    public static void main(String[] args) {
        // int[][] marks = new int[3][4];

        int[][] marks = new int[3][];
        marks[0] = new int[4];
        marks[1] = new int[3];
        marks[2] = new int[2];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < marks.length;i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.print("Enter marks of class " + i + " of student "+ j + " : ");
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < marks.length;i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
/*
 * we cannot declare array size neagtive it will throw : NegativeArraySizeException
 */