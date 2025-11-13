class Calc{
    int mul(int a,int b){
        System.out.println("1 method");
        return a*b;
    }
    double mul(int a,int b, double c){
        System.out.println("2 method");
        return a*b*c;
    }
    double mul(double a, double b,double c){
        System.out.println("3 mthod");
        return a*b;
    }
}
public class _5_MethodOverloading {
    public static void main(String[] args) {
        Calc c = new Calc();
        //System.out.println(c.mul(2,2,2));
        System.out.println(c.mul(44,33,33));
    }
}
