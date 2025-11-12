interface ABC{
    void show();
    default void display(){
        System.out.println("ABC Interface");
    }
    static void announce(){ // static methods must have body in an interface
        System.out.println("JAVA DEVELOPER");
    }
}
class Alien implements ABC{
    public void show(){
        System.out.println("Show from ABC");
    }

}
public class _6_Interface {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.show();
        a.display();

        ABC.announce();
    }
}
/*
 * from java 8 we can have interface method with body
 * however if interface has body it should be declared as defualt
 * default method in interface is such method with implementation in interface
 * for an implementing class it is not compulsary to override the default method if need arrises we can 
 * override
 * default method will get inherited in implementing class in java
 * 
 * we can also have static methods in an interface however staic methods of an interface
 * must not be abstract it must have implementation and static method of an interface will not get
 * inherited in implementing classes
 * 
 * an implementing class can have specialized methods also however using 
 * interface type reference we cannot access directly can be done through downcasting
 */