interface Calc{
    void add(int a,int b);// behind the scence public abstract void add(int a,int b)
    void sub(int a,int b);

}
class MyCalc1 implements Calc{
    public void add(int a,int b){ // mandatory public
        System.out.println(a+b);
    }
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}
class MyCalc2 implements Calc{
    public void add(int a,int b){ 
        System.out.println(a+b + " 2");
    }
    public void sub(int a,int b){
        System.out.println(a-b + " 2");
    }
}
public class _1_Interface {
    public static void main(String[] args) {
        MyCalc1 c1 = new MyCalc1();
        c1.add(12, 11);
        c1.sub(11, 1);

        MyCalc2 c2 = new MyCalc2();
        c2.add(12, 11);
        c2.sub(10, 1);
    } 
}
/*
 * all the methods in interface are by default public and abstract
 */
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _1_Interface (Basic Interface Implementation)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the use of **interfaces in Java**.  
It shows how multiple classes can implement the same interface and provide their own definitions of the interface methods.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INTERFACE  
- A reference type in Java similar to a class, but **cannot have method implementations** (except default/static methods in newer versions)  
- All methods are **implicitly `public` and `abstract`**  
- Used to define a **contract** that implementing classes must follow  

IMPLEMENTATION (implements keyword)  
- A class uses `implements` to provide concrete definitions of all interface methods  
- The implementing class **must declare methods as `public`**  

MULTIPLE IMPLEMENTATIONS  
- Different classes (`MyCalc1`, `MyCalc2`) can implement the same interface in different ways  

MANDATORY OVERRIDING  
- Every method in the interface must be **overridden in implementing class** unless the class is abstract  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

INTERFACE `Calc`  
- Defines two methods:  
  - `add(int a, int b)` → sums two integers  
  - `sub(int a, int b)` → subtracts two integers  

CLASS `MyCalc1` implements `Calc`  
- Overrides `add()` → prints `a+b`  
- Overrides `sub()` → prints `a-b`  

CLASS `MyCalc2` implements `Calc`  
- Overrides `add()` → prints `a+b` with " 2" appended  
- Overrides `sub()` → prints `a-b` with " 2" appended  

MAIN METHOD  
- Creates instances of both implementing classes  
- Calls `add()` and `sub()` methods on each object to demonstrate different implementations  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`c1` → `MyCalc1` object  
- Calls `add()` and `sub()` methods to show first implementation  

`c2` → `MyCalc2` object  
- Calls `add()` and `sub()` methods to show second implementation  

`Calc` interface  
- Acts as a **contract** defining operations that calculator classes must implement  

Methods `add()` and `sub()`  
- Provide **operation logic** in implementing classes  
- Behavior differs in `MyCalc1` and `MyCalc2`  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `MyCalc1 c1 = new MyCalc1();` → creates object of first implementation  
② `c1.add(12, 11);` → executes `MyCalc1.add()` → prints `23`  
③ `c1.sub(11, 1);` → executes `MyCalc1.sub()` → prints `10`  

④ `MyCalc2 c2 = new MyCalc2();` → creates object of second implementation  
⑤ `c2.add(12, 11);` → executes `MyCalc2.add()` → prints `23 2`  
⑥ `c2.sub(10, 1);` → executes `MyCalc2.sub()` → prints `9 2`  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
23  
10  
23 2  
9 2  


7. ADDITIONAL NOTES
-------------------------------------------------
- Methods in interface are automatically `public abstract` → implementing classes **must declare them public**  
- Interfaces allow **multiple implementations** with the same method signatures  
- Promotes **loose coupling** and **polymorphism**  
- Interface reference can also be used for polymorphism: `Calc c = new MyCalc1();`  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
