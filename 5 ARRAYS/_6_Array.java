public class _6_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        for(int i : arr){
            System.out.println(i);
        }

        int arr1[][] = {{1,2,3},{4,5,6}};
        for(int row[]:arr1){
            for(int ele: row){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
/*
 * for each loop
 * enhanced for loop
 * advanced for loop
 */