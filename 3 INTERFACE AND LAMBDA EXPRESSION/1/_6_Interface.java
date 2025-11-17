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

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _6_Interface (Default and Static Methods in Interface)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **default and static methods in Java interfaces** (Java 8 feature).  
It shows how implementing classes can inherit default methods, optionally override them, and how static methods are accessed through the interface itself.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

DEFAULT METHOD  
- Declared with `default` keyword inside an interface  
- Can have a method body  
- Automatically **inherited by implementing classes**  
- Overriding in implementing class is **optional**  

STATIC METHOD IN INTERFACE  
- Declared with `static` keyword and must have a body  
- Belongs to the interface, **cannot be inherited** by implementing classes  
- Must be accessed using interface name: `InterfaceName.methodName()`  

INTERFACE IMPLEMENTATION  
- Class must implement all **abstract methods** of the interface  
- Can choose to override **default methods**  
- Can define **specialized methods** of its own  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

INTERFACE `ABC`  
- Abstract method: `show()` → must be implemented by any implementing class  
- Default method: `display()` → prints "ABC Interface"  
- Static method: `announce()` → prints "JAVA DEVELOPER"  

CLASS `Alien`  
- Implements `ABC`  
- Overrides abstract method `show()` → prints "Show from ABC"  
- Inherits default method `display()` → prints "ABC Interface"  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`show()` → concrete implementation in `Alien` class  
- Provides required behavior of abstract interface method  

`display()` → default method in interface  
- Inherited automatically by `Alien` class  
- Can optionally be overridden in `Alien`  

`announce()` → static interface method  
- Can only be accessed as `ABC.announce()`  
- Not inherited by `Alien`  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `Alien a = new Alien();` → creates object of `Alien` class  
② `a.show();` → calls overridden `show()` method → prints "Show from ABC"  
③ `a.display();` → calls inherited default method → prints "ABC Interface"  
④ `ABC.announce();` → calls static method of interface → prints "JAVA DEVELOPER"  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Show from ABC  
ABC Interface  
JAVA DEVELOPER  


7. ADDITIONAL NOTES
-------------------------------------------------
- **Default methods** allow interface evolution without breaking existing implementations  
- **Static methods** in interfaces are utility methods and cannot be overridden  
- Implementing class can have additional specialized methods  
- Interface references cannot directly access class-specific methods unless downcasted  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
