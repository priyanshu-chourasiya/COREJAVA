class Demo{
    // static int a;
    
    // static{
    //     a = 10;  // valid
    // }
    // ========================================================
    // static {
    //     // a = 10;
    //     System.out.println(a); // error
    // }
    // static int a;

    static {
        display();
    }
    static int a = 10;

    public static void display(){
        System.out.println(a);
    }

}
public class _28_Static {
    public static void main(String[] args) {
        Demo.display();
        Demo d1 = new Demo();
        d1.display();
    }
}
