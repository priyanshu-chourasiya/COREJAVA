interface Calc{
    void add(int a,int b);// behind the scence public abstract void add(int a,int b)
    void sub(int a,int b);

}
class MyCalc1 implements Calc{
    public void add(int a,int b){ // mandatory public
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}
class MyCalc2 implements Calc{
    public void add(int a,int b){ 
        System.out.println(a+b + " 2");
    }
    public void sub(int a,int b){
        System.out.println(a-b + " 2");
    }
}
public class _1_Interface {
    public static void main(String[] args) {
        MyCalc1 c1 = new MyCalc1();
        c1.add(12, 11);
        c1.sub(11, 1);

        MyCalc2 c2 = new MyCalc2();
        c2.add(12, 11);
        c2.sub(10, 1);
    } 
}
/*
 * all the methods in interface are by default public and abstract
 */