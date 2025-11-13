public class _20_Ternatry{
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 34;
        int num3 = 122;
        // if(num1 > num2){
        //     System.out.println("Num1 is greater");
        // }
        // else{
        //     System.out.println("Num2 is greater");
        // }

        int res = (num1>num2)? num1 : num2;
        //          if condition is  true then left of semicolom else right side of semicolon (it returns)
        System.out.println(res);

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("num1");
            }
            else{
                System.out.println("num3");
            }

        }
        else if(num1 > num2){
            System.out.println("num2");
        }

        res = (num1>num2)? (num1 > num3 ? num1 : num3):(num2 > num3? num2 : num3) ;
        System.out.println(res);
    }
}