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
/*
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: Lambda Expression with Functional Interface
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the use of a **lambda expression** to implement a **functional interface** in Java.  
It shows how we can use lambda syntax to provide the body of a single abstract method in a concise way.

2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INTERFACE (`X`)  
- Declares a single abstract method `show2()`  
- Since it has **only one abstract method**, it is a **functional interface** (also called SAM: Single Abstract Method interface)  

LAMBDA EXPRESSION  
- Provides a concise way to implement a functional interface  
- Syntax: `(parameters) -> { body }`  
- Can be assigned to a reference of functional interface type  

FUNCTIONAL INTERFACE  
- An interface with exactly **one abstract method**  
- Can have default and static methods as well  
- Used for lambda expressions and method references  

3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

`X obj2 = () -> System.out.println("HEEEEEE");`  
- Implements the `show2()` method of interface `X` using a lambda expression  
- `()` → no parameters  
- `System.out.println("HEEEEEE")` → body of the method  

`obj2.show2();`  
- Calls the implemented method → executes the lambda body  

4. PURPOSE OF VARIABLES, METHODS, AND BLOCKS
--------------------------------------------

`obj2` → reference of type `X` holding a lambda implementation  
`show2()` → single abstract method, executed through the lambda expression  

5. CONTROL-FLOW EXPLANATION
---------------------------

① Lambda expression assigned to `obj2` → creates an implementation of `X`  
② `obj2.show2();` → calls the method → prints `"HEEEEEE"`  

6. EXPECTED OUTPUT
-----------------
HEEEEEE

7. ADDITIONAL NOTES
-------------------
- Types of interfaces in Java:
  1. **Normal Interface** → contains multiple abstract methods
  2. **SAM / Functional Interface** → contains exactly one abstract method, can be used with lambda
  3. **Marker Interface** → contains no methods (used to mark a class, e.g., Serializable)
- Lambda expressions reduce boilerplate code for implementing functional interfaces

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
