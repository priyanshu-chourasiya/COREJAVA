interface Calc1 {
    void add(int a, int b); 
    void sub(int a, int b);
}
interface Calc2{
    int mul(int a, int b); 
    int div(int a, int b);
}
class MyCalc1 implements Calc1,Calc2 {
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class Calculator{
    public void disp(){
        System.out.println("Calculator class");
    }
}
class MyCalc2 extends Calculator implements Calc1,Calc2 { // first extends then implements
    public void add(int a, int b) {
        System.out.println("Sum (MyCalc2) = " + (a + b + 100));
    }

    public void sub(int a, int b) {
        System.out.println("Difference (MyCalc2) = " + (a - b - 100));
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}

class Algebra {
    public void cal(Calc1 c, int a, int b) {
        c.add(a, b);
        c.sub(a, b);
    }
}

public class _3_Interface {
    public static void main(String[] args) {
        MyCalc1 cal1 = new MyCalc1();
        cal1.add(10, 20);
        cal1.sub(10, 20);
        System.out.println(cal1.mul(12, 2));
        System.out.println(cal1.div(12, 2));


        MyCalc2 cal2 = new MyCalc2();
        cal2.add(110, 201);
        cal2.sub(101, 210);
        System.out.println(cal2.mul(122, 22));
        System.out.println(cal2.div(122, 22));

        
        // Algebra a = new Algebra();
        // a.cal(cal1, 20, 10);
        // a.cal(cal2, 12, 12);

        //Calc c = new Calc();
    }
} 
/*
 * a class can implement multiple interfaces
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _3_Interface (Multiple Interface Implementation)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **implementing multiple interfaces** in Java.  
It shows how a single class can implement **more than one interface**, provide definitions for all interface methods, and also extend a parent class if needed.  
It also demonstrates using the implemented methods for calculations.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

MULTIPLE INTERFACES  
- A class can implement **more than one interface**  
- Syntax: `class MyClass implements Interface1, Interface2`  

INTERFACE IMPLEMENTATION  
- Every method in each interface must be implemented by the class  
- Ensures **100% abstraction** for multiple contracts  

CLASS EXTENDING AND IMPLEMENTING INTERFACES  
- A class can **extend another class** and implement one or more interfaces simultaneously  
- Syntax: `class MyCalc2 extends Calculator implements Calc1, Calc2` → first `extends`, then `implements`  

METHOD OVERRIDING  
- Implemented methods in classes must be `public`  
- Provides concrete behavior for abstract methods in interfaces  

POLYMORPHISM (optional, commented out in this code)  
- Interface reference can hold object of implementing class, e.g., `Calc1 c = new MyCalc1()`  
- Enables dynamic method dispatch at runtime  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

INTERFACE `Calc1`  
- Methods: `add(int a,int b)` and `sub(int a,int b)`  

INTERFACE `Calc2`  
- Methods: `mul(int a,int b)` and `div(int a,int b)` → return `int`  

CLASS `MyCalc1` implements `Calc1, Calc2`  
- Implements all methods from both interfaces  
- `add()` and `sub()` → prints results  
- `mul()` and `div()` → returns integer results  

CLASS `Calculator`  
- Parent class with method `disp()` → prints "Calculator class"  

CLASS `MyCalc2` extends `Calculator` and implements `Calc1, Calc2`  
- Implements all interface methods  
- Shows **combination of class inheritance and multiple interface implementation**  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`cal1` → `MyCalc1` object  
- Calls all methods (`add`, `sub`, `mul`, `div`) for first implementation  

`cal2` → `MyCalc2` object  
- Calls all methods (`add`, `sub`, `mul`, `div`) for second implementation  

Methods `add()` and `sub()`  
- Provide behavior for `Calc1` interface  

Methods `mul()` and `div()`  
- Provide behavior for `Calc2` interface  

`Calculator` class  
- Base class for `MyCalc2` demonstrating combination of **inheritance + interface implementation**  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `MyCalc1 cal1 = new MyCalc1();` → creates object of class implementing multiple interfaces  
② `cal1.add(10,20)` → prints "Addition = 30"  
③ `cal1.sub(10,20)` → prints "Subtraction = -10"  
④ `System.out.println(cal1.mul(12,2))` → prints 24  
⑤ `System.out.println(cal1.div(12,2))` → prints 6  

⑥ `MyCalc2 cal2 = new MyCalc2();` → creates object of class that **extends Calculator and implements interfaces**  
⑦ `cal2.add(110,201)` → prints "Sum (MyCalc2) = 411"  
⑧ `cal2.sub(101,210)` → prints "Difference (MyCalc2) = -209"  
⑨ `System.out.println(cal2.mul(122,22))` → prints 2684  
⑩ `System.out.println(cal2.div(122,22))` → prints 5  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Addition = 30  
Subtraction = -10  
24  
6  
Sum (MyCalc2) = 411  
Difference (MyCalc2) = -209  
2684  
5  


7. ADDITIONAL NOTES
-------------------------------------------------
- A class can implement **multiple interfaces** to satisfy multiple contracts  
- A class can also **extend another class** while implementing interfaces  
- Interface methods must always be overridden as `public`  
- Interface reference can be used for **polymorphic behavior**, although not used in this code  
- Promotes **code standardization**, **flexibility**, and **loose coupling**  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
