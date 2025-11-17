interface Calc {
    void add(int a, int b); // method takes two arguments
    void sub(int a, int b);
}

class MyCalc1 implements Calc {
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
}

class MyCalc2 implements Calc {
    public void add(int a, int b) {
        System.out.println("Sum (MyCalc2) = " + (a + b + 100));
    }

    public void sub(int a, int b) {
        System.out.println("Difference (MyCalc2) = " + (a - b - 100));
    }
}

class Algebra {
    public void cal(Calc c, int a, int b) {
        c.add(a, b);
        c.sub(a, b);
    }
}

public class _2_Interface {
    public static void main(String[] args) {
        MyCalc1 cal1 = new MyCalc1();
        MyCalc2 cal2 = new MyCalc2();

        Algebra a = new Algebra();
        a.cal(cal1, 20, 10);
        a.cal(cal2, 12, 12);

        //Calc c = new Calc();
    }
}
/*
 * through interface we can acheive 100% abstraction
 * interface can be used to specify a requirement which to be implemented 
 * it helps to standardization
 * all the mehtods in an interface are public and abstract irrespective we specify or not
 * it is compulsary for an implementing class to override all methods of an interface
 * if implementing class is not overriding all the methods of an interface then it must be declared as abstract
 * one interface can have any number of implementing classes 
 * we cannot create object of an interface
 * we can create reference of an interface to acheive polymorphism
 * a class will implement an interface using 'implements' keyword
 * a class can implement multiple interfaces
 * a class can extends another class and can also implements one or more interfaces at a time
 * first it must extends a class then implement interface
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _2_Interface (Interface with Polymorphic Method)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **interface-based polymorphism**.  
It shows how an **Algebra class method** can accept any class implementing the `Calc` interface and execute its methods without knowing the concrete implementation.  
This achieves **100% abstraction** and **loose coupling**.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INTERFACE  
- `Calc` defines a contract with methods `add(int a,int b)` and `sub(int a,int b)`  
- All interface methods are **public and abstract by default**  

INTERFACE IMPLEMENTATION  
- Classes `MyCalc1` and `MyCalc2` implement the interface  
- Both provide concrete definitions of `add()` and `sub()`  

POLYMORPHIC METHOD PARAMETERS  
- `Algebra.cal(Calc c, int a, int b)` accepts any `Calc` object  
- Allows the same method to work with multiple implementations  

RUNTIME POLYMORPHISM  
- The actual method executed depends on the **type of object passed** at runtime  

MULTIPLE IMPLEMENTATIONS  
- Different classes provide different behavior for same method signatures  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

INTERFACE `Calc`  
- Declares two methods: `add()` and `sub()`  

CLASS `MyCalc1`  
- Implements `Calc`  
- `add()` → prints sum normally  
- `sub()` → prints difference normally  

CLASS `MyCalc2`  
- Implements `Calc`  
- `add()` → adds extra 100 to sum  
- `sub()` → subtracts extra 100 from difference  

CLASS `Algebra`  
- Method `cal(Calc c, int a, int b)` accepts **any Calc object**  
- Calls `c.add(a,b)` and `c.sub(a,b)` → executes overridden methods  

MAIN METHOD  
- Creates `MyCalc1` and `MyCalc2` objects  
- Passes them to `Algebra.cal()` to demonstrate **polymorphism via interface references**  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`cal1` → `MyCalc1` object → first implementation of Calc  
`cal2` → `MyCalc2` object → second implementation of Calc  

`Algebra a` → object used to invoke polymorphic method `cal()`  

`cal(Calc c, int a, int b)`  
- Demonstrates polymorphism via interface reference  
- Calls overridden methods of passed object  

`Calc` reference (commented out line)  
- Cannot instantiate interface objects directly  
- But can hold reference to any implementing object → enables polymorphism  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `MyCalc1 cal1 = new MyCalc1();` → creates object of first implementation  
② `MyCalc2 cal2 = new MyCalc2();` → creates object of second implementation  
③ `Algebra a = new Algebra();` → creates Algebra object  

④ `a.cal(cal1, 20, 10);`  
   - `c` refers to `MyCalc1`  
   - `c.add(20,10)` → prints "Addition = 30"  
   - `c.sub(20,10)` → prints "Subtraction = 10"  

⑤ `a.cal(cal2, 12, 12);`  
   - `c` refers to `MyCalc2`  
   - `c.add(12,12)` → prints "Sum (MyCalc2) = 124"  
   - `c.sub(12,12)` → prints "Difference (MyCalc2) = -100"  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Addition = 30  
Subtraction = 10  
Sum (MyCalc2) = 124  
Difference (MyCalc2) = -100  


7. ADDITIONAL NOTES
-------------------------------------------------
- **Interface enforces 100% abstraction**  
- Multiple classes can implement the same interface with **different behaviors**  
- Polymorphic references (`Calc c`) enable **dynamic method dispatch**  
- Interface **cannot be instantiated directly**  
- A class can implement **multiple interfaces** and also extend a class simultaneously  
- Promotes **standardization** and **loose coupling** in design  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
