interface Beta{

}
interface Demo1{
    void disp();
    float pi = 3.14f; // public static final (by default variables in interface)
}
interface Demo2{ 
    void disp();
}
class Alpha implements Demo2,Demo1{
    public void disp(){
        System.out.println("Alpha class"); // common implementation for both interface
    }
    public void show(){
        System.out.println("Focus is key");
    }
}
public class _5_Interface {
    public static void main(String[] args) {
        //Demo1.pi();
    }
}
/*
 * an interface cannot implement another interface
 * an interface can extend another interface
 * in an interface we can have variable however all the variables in an interface are 
 * public static final by default
 * we cannot have constructor in an interface
 */