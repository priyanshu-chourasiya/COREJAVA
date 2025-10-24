public class _8_Patterns {
    public static void main(String[] args) {
        for(int i = 0; i < 5;i++){
            for(int j = 0; j < 5; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("======================");
        int n = 5;
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("======================");
        n = 10;

        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || j == n-1 || i == (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("======================");

    }
}

