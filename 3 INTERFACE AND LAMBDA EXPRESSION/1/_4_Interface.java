// interface Demo1{
//     void disp();

// }
// interface Demo2 implements Demo1{ not possible

// }
interface Demo1{
    void disp();

}
interface Demo2 extends Demo1{ 
    void show();
}
class Alpha implements Demo2{
    public void disp(){
        System.out.println("Alpha class");
    }
    public void show(){
        System.out.println("Focus is key");
    }
}
public class _4_Interface {
    public static void main(String[] args) {
        Demo1 d = new Alpha();
        d.disp();

        Demo2 d2 = new Alpha();
        d2.disp();
        d2.show();
        
    }
}
/*
 * an interface cannot implement another interface
 * an interface can extend another interface
 */