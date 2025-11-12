interface Calc1 {
    void add(int a, int b); 
    void sub(int a, int b);
}
interface Calc2{
    int mul(int a, int b); 
    int div(int a, int b);
}
class MyCalc1 implements Calc1,Calc2 {
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class Calculator{
    public void disp(){
        System.out.println("Calculator class");
    }
}
class MyCalc2 extends Calculator implements Calc1,Calc2 { // first extends then implements
    public void add(int a, int b) {
        System.out.println("Sum (MyCalc2) = " + (a + b + 100));
    }

    public void sub(int a, int b) {
        System.out.println("Difference (MyCalc2) = " + (a - b - 100));
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}

class Algebra {
    public void cal(Calc1 c, int a, int b) {
        c.add(a, b);
        c.sub(a, b);
    }
}

public class _3_Interface {
    public static void main(String[] args) {
        MyCalc1 cal1 = new MyCalc1();
        cal1.add(10, 20);
        cal1.sub(10, 20);
        System.out.println(cal1.mul(12, 2));
        System.out.println(cal1.div(12, 2));


        MyCalc2 cal2 = new MyCalc2();
        cal2.add(110, 201);
        cal2.sub(101, 210);
        System.out.println(cal2.mul(122, 22));
        System.out.println(cal2.div(122, 22));

        
        // Algebra a = new Algebra();
        // a.cal(cal1, 20, 10);
        // a.cal(cal2, 12, 12);

        //Calc c = new Calc();
    }
} 
/*
 * a class can implement multiple interfaces
 */