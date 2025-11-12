//package 1 Java fundamentals;

public class _2_TyepCasting {
    public static void main(String[] args) {
        byte a = 45; //implicite typecasting or numeric type promotion
        double b;
        b = a;
        System.out.println(b);
        
        // double c = 45.0; // error : incompatible types: possible lossy conversion from double to int
        // int d;
        // d = c;
        // System.out.println(d);

        // double c = 45.0; // explicite typecasting
        // int d;
        // d = (int)c;
        // System.out.println(d);

        double c = 45.5; // loss of precition
        //d = (int)c;
        //System.out.println(d);
        
    }
}
