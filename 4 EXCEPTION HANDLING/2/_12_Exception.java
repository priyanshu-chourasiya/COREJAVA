import java.io.IOException;

class Parent{
    public void study(){
        System.out.println("Study parent");
    }

}
class Child1 extends Parent{
    public void study() throws ArithmeticException{
        System.out.println("Child1 parent");
    }
}
class Child2 extends Parent{
    public void study() throws IOException{
        System.out.println("Child2 parent");
    }
}
public class _12_Exception {
    public static void main(String[] args) {
        
    }
}
/*
 * if a parent class is not declaring any exception child class can declare any unchecked exception but
 * cannot declare any checked exception
 */