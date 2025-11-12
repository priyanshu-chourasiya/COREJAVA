import java.io.IOException;

class Parent{
    public void study() throws IOException{ // checked
        System.out.println("Study parent");
    }

}
class Child1 extends Parent{
    public void study() throws ArithmeticException{ // unchecked
        System.out.println("Child1 parent");
    }
}
class Child2 extends Parent{
    public void study() throws IOException{ // checked
        System.out.println("Child2 parent");
    }
}
class child3 extends Parent{
    public void study() throws Exception{ // partially checked
        System.out.println("Child2 parent");
    }
}
public class _14_Exception {
    public static void main(String[] args) {
        
    }
}
