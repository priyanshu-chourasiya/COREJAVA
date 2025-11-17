abstract class P{
    abstract void show(); 
}
// class R extends P{
//     public void show(){
//         System.out.println("Hello");
//     }
// }
interface X{
    void show2();
}
public class _10_Lambda {
    public static void main(String[] args) {
        P obj = new P(){
            public void show(){
                System.out.println("Show");
            }
        };
        obj.show();

        X obj2 = new X() {
            public void show2(){
                System.out.println("SHOW2");
            }
        };
        obj2.show2();
    }
}
/*
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: Anonymous Inner Class with Abstract Class and Interface
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the use of **anonymous inner classes** to provide implementations for an **abstract class** (`P`) and an **interface** (`X`) in Java.  
It shows how anonymous classes can be used to override abstract methods or implement interface methods without creating separate named subclasses.

2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

ABSTRACT CLASS (`P`)  
- A class that may contain **abstract methods** (methods without a body)  
- Cannot be instantiated directly  
- Anonymous inner class can **provide implementation for abstract methods**  

INTERFACE (`X`)  
- Contains abstract method `show2()`  
- Cannot have instance variables (other than `public static final`) or constructors  
- Anonymous inner class can implement interface and provide method body  

ANONYMOUS INNER CLASS  
- Allows instantiation and implementation in a single expression  
- Useful for one-time implementation without naming a class  

3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

`P obj = new P(){ ... };`  
- Creates an **anonymous subclass** of `P`  
- Overrides `show()` to print `"Show"`  

`X obj2 = new X(){ ... };`  
- Creates an **anonymous implementation** of interface `X`  
- Implements `show2()` to print `"SHOW2"`  

4. PURPOSE OF VARIABLES, METHODS, AND BLOCKS
--------------------------------------------

`obj` → reference of type `P` pointing to an anonymous subclass  
`show()` → overridden abstract method, prints `"Show"`  

`obj2` → reference of type `X` pointing to anonymous class implementing the interface  
`show2()` → implemented interface method, prints `"SHOW2"`  

5. CONTROL-FLOW EXPLANATION
---------------------------

① `P obj = new P(){ ... };` → create anonymous subclass of `P`  
② `obj.show();` → calls overridden method → prints `"Show"`  
③ `X obj2 = new X(){ ... };` → create anonymous class implementing `X`  
④ `obj2.show2();` → calls implemented method → prints `"SHOW2"`  

6. EXPECTED OUTPUT
-----------------
Show
SHOW2

7. ADDITIONAL NOTES
-------------------
- Anonymous inner classes can implement interfaces or extend abstract classes  
- They are **one-time use**, no separate class file is created  
- Cannot declare constructors in anonymous classes  
- Useful for quick implementations, event handling, and callbacks  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
