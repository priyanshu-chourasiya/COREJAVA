interface X{
    void show2();
}
public class _11_Lambda {
    public static void main(String[] args) {
        X obj2 = () -> System.out.println("HEEEEEE");
        obj2.show2();
    }
}
/*
 * types of interface 
 *  normal
 * SAM - single abstract method - functional interface - interface with only method
 * marker - no methods
 */