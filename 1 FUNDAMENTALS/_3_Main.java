//package 1 Java fundamentals;

public class _3_Main {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte result = a+b; // result of any whole number in java is int error : 
        //incompatible types: possible lossy conversion from int to byte
        int result = a+b;

        int n1 = 12;
        int n2 = 6;
        int res = n1/n2;
        System.out.println("1 : "+res);
        int n3 = 5;
        System.out.println("2 : "+n1/n3);
        System.out.println("3 : "+(double)n1/n3);
        System.out.println("4 : "+(float)n1/n3);
        float res2 = n1/n3;
        System.out.println("5 : "+res2);

        // rounding to zero or truncation
        // whenever int to int division happens the result is always int doesnt matter where u are storing the result
    }
}
