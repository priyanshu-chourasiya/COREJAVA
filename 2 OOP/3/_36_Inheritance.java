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
public class _36_Inheritance {
    public static void main(String[] args) {
        Beta b = new Beta(); // creating instance of child class == creating instance of parent class
        b.display();
    }
    
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _36_Inheritance (Alpha & Beta)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates constructor behavior in inheritance.  
It shows that when a child class object is created:
- The parent class constructor executes first (even if not explicitly called).  
- Then the child class constructor executes.  
- Instance variables from both parent and child are initialized and accessible.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

CONSTRUCTOR CHAINING  
- In Java, the child class constructor implicitly calls `super()` if no explicit
  parent constructor call is made.  
- Ensures parent class initialization before child initialization.

INHERITANCE  
- Child class (`Beta`) inherits instance variables `a` and `b` from parent class (`Alpha`)  
- Child can access both its own variables (`x, y`) and inherited variables (`a, b`).

METHODS INHERITANCE  
- Child class inherits parent’s public/protected/default methods (none used explicitly here)  
- Child class defines its own method `display()` to print all variables.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Alpha` (Parent)  
- `int a, b` → instance variables  
- Zero-parameter constructor: initializes `a=10, b=20` and prints a message  
- Parameterized constructor: initializes `a` and `b` with given values and prints a message

CLASS `Beta` (Child)  
- `int x, y` → instance variables  
- Zero-parameter constructor: initializes `x=1, y=2` and prints a message  
- Parameterized constructor: initializes `x` and `y` and prints a message  
- Method `display()` prints parent (`a, b`) and child (`x, y`) variables

MAIN METHOD  
- Creates a `Beta` object → triggers constructor chaining  
- Calls `display()` to show all variable values


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`a, b` (Alpha)  
- Parent variables, initialized in Alpha constructors

`x, y` (Beta)  
- Child variables, initialized in Beta constructors

Alpha constructors  
- Zero-parameter → initializes default values  
- Parameterized → initializes with given values

Beta constructors  
- Zero-parameter → initializes default child values  
- Parameterized → initializes with given values

`display()`  
- Prints values of all instance variables (`a, b, x, y`)

MAIN METHOD  
- Creates a Beta object to demonstrate constructor chaining  
- Calls `display()` to print initialized values


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Beta b = new Beta();` → child object creation starts

③ Implicit `super()` call is inserted at the start of `Beta()` constructor

④ `Alpha()` constructor executes:  
    - Initializes `a = 10`, `b = 20`  
    - Prints "Alpha zero para constructor"

⑤ Control returns to `Beta()` constructor:  
    - Initializes `x = 1`, `y = 2`  
    - Prints "Beta zero para constructor"

⑥ `b.display()` executes:  
    - Prints `a = 10`  
    - Prints `b = 20`  
    - Prints `x = 1`  
    - Prints `y = 2`

⑦ Program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Alpha zero para constructor  
Beta zero para constructor  
10  
20  
1  
2


7. ADDITIONAL NOTES
-------------------------------------------------
- Constructor chaining ensures parent class is always initialized before child class  
- Child class inherits parent variables but constructors are **not inherited**  
- Child can define its own constructors and methods while using inherited variables

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/

