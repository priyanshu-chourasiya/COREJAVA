class Alpha{
    int a,b;

    public Alpha(){
        a = 10;
        b = 20;
        System.out.println("Alpha zero para constructor");
    }
    public Alpha(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("Para cons of Alpha");
    }
}
class Beta extends Alpha{
    int x,y;
    public Beta(){
        x = 1;
        y = 2;
        System.out.println("Beta zero para constructor");
    }
    public Beta(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("Para cons of Beta");
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class _37_Inheritance {
    public static void main(String[] args) {
        Beta b = new Beta(10, 20);
        b.display();
    }
    
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _37_Inheritance (Alpha & Beta with Parameterized Constructor)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates constructor behavior in inheritance, specifically when 
the **child class parameterized constructor does not explicitly call a parent 
constructor**.  
It shows that in such a case, the parent class **zero-parameter constructor** is 
automatically called before the child constructor.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

CONSTRUCTOR CHAINING  
- In a child class, if no explicit call to a parent constructor is made using `super(...)`,  
  Java inserts an implicit call to the parent’s zero-parameter constructor.  
- Ensures the parent part of the object is initialized first.

INHERITANCE  
- Child class (`Beta`) inherits instance variables `a` and `b` from parent (`Alpha`)  
- Child class can define its own variables (`x, y`) and methods (`display()`)

METHODS INHERITANCE  
- `display()` in Beta prints both parent (`a, b`) and child (`x, y`) variables


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Alpha`  
- Variables `a, b`  
- Zero-parameter constructor → initializes `a=10, b=20` and prints message  
- Parameterized constructor → initializes with given `a, b` and prints message

CLASS `Beta`  
- Variables `x, y`  
- Parameterized constructor `Beta(int x,int y)`  
  - Initializes only child variables  
  - Does not explicitly call `super(...)` → zero-parameter Alpha constructor called implicitly  
- Method `display()` prints all variables

MAIN METHOD  
- Creates a `Beta` object with `b = new Beta(10, 20)`  
- Calls `display()` to show values of both parent and child variables


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`a, b` (Alpha)  
- Parent variables, initialized in zero-parameter constructor

`x, y` (Beta)  
- Child variables, initialized in Beta parameterized constructor

Alpha constructors  
- Zero-parameter → initializes default parent values  
- Parameterized → not used in this example

Beta parameterized constructor  
- Initializes child variables (`x, y`)  
- Parent constructor called implicitly (zero-parameter)

`display()`  
- Prints `a, b, x, y`

MAIN METHOD  
- Demonstrates constructor chaining and printing of all variable values


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Beta b = new Beta(10, 20);` → object creation starts

③ Implicit `super()` call inserted at start of `Beta(int x,int y)` constructor

④ `Alpha()` zero-parameter constructor executes:  
    - Initializes `a = 10`, `b = 20`  
    - Prints "Alpha zero para constructor"

⑤ Control returns to `Beta(int x,int y)` constructor:  
    - Initializes `x = 10`, `y = 20`  
    - Prints "Para cons of Beta"

⑥ `b.display()` executes:  
    - Prints `a = 10` (from Alpha constructor)  
    - Prints `b = 20` (from Alpha constructor)  
    - Prints `x = 10` (from Beta constructor)  
    - Prints `y = 20` (from Beta constructor)

⑦ Program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Alpha zero para constructor  
Para cons of Beta  
10  
20  
10  
20


7. ADDITIONAL NOTES
-------------------------------------------------
- If a child parameterized constructor does not explicitly call a parent constructor,  
  the parent's zero-parameter constructor is always executed automatically.  
- Constructor chaining ensures proper initialization of the entire object  
- Child can define its own variables and methods while inheriting parent variables

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
