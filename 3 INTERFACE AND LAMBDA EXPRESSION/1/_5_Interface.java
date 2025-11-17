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

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _5_Interface (Interface Variables & Multiple Implementation)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates:
- **Interface variables** and their default properties.  
- **Multiple interface implementation** by a single class.  
- Shared method implementation for multiple interfaces.

It emphasizes the **rules and characteristics of interfaces in Java**.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INTERFACE VARIABLES  
- All variables declared in an interface are **public, static, and final** by default  
- Example: `float pi = 3.14f;` → `public static final float pi = 3.14f;`  

MULTIPLE INTERFACE IMPLEMENTATION  
- A class can implement multiple interfaces simultaneously:  
  `class Alpha implements Demo1, Demo2`  

SHARED METHOD IMPLEMENTATION  
- If multiple interfaces have methods with the **same signature**, implementing class can provide **one common method**  

INTERFACE RESTRICTIONS  
- Interface **cannot implement another interface**  
- Interface **cannot have a constructor**  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

INTERFACE `Demo1`  
- Declares `disp()` method  
- Declares variable `pi` → automatically `public static final`  

INTERFACE `Demo2`  
- Declares `disp()` method  

CLASS `Alpha`  
- Implements both `Demo1` and `Demo2`  
- Provides single implementation of `disp()` → satisfies both interfaces  
- Defines additional method `show()` → specialized method of class  

INTERFACE `Beta`  
- Declared but unused, demonstrates that multiple interfaces can exist independently  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`pi` → constant value accessible without creating object  
- Can be accessed as `Demo1.pi`  
- Immutable due to `final`  

`disp()` → overridden method in `Alpha`  
- Provides concrete behavior for both `Demo1` and `Demo2` interfaces  

`show()` → class-specific method, not part of any interface  
- Specialized functionality of `Alpha`  


5. ADDITIONAL NOTES
-------------------------------------------------
- **Interface variables** are always `public static final`  
- A class can implement **any number of interfaces**  
- If two interfaces declare a method with same signature, **only one implementation** is needed  
- Interfaces provide **100% abstraction**  
- Cannot create instances of interfaces directly  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
