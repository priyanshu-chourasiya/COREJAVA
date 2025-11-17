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
        this(2, 2);// first run commenting this and this
        x = 1;
        y = 2;
        System.out.println("Beta zero para constructor");
    }
    public Beta(int x,int y){
        super(4,33);
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
public class _38_Inheritance {
    public static void main(String[] args) {
        Beta b = new Beta(1,2); // creating instance of child class == creating instance of parent class
        b.display();

        Beta b1 = new Beta(); // this
        b1.display(); // this
    }
    
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _38_Inheritance (Alpha & Beta with super() and this())
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **constructor chaining** in Java using both `super()` 
and `this()` in a multi-level constructor scenario.  
It shows how parent and child constructors are executed in sequence, 
depending on explicit calls to other constructors, and how variables are initialized.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

CONSTRUCTOR CHAINING  
- Refers to one constructor calling another constructor in the same class (`this(...)`) 
  or parent class (`super(...)`) to reuse initialization logic.

`this()`  
- Calls another constructor **in the same class**.  
- Must be the **first statement** in a constructor.

`super()`  
- Calls a constructor of the **parent class**.  
- Must be the **first statement** if used.

INHERITANCE  
- Child class (`Beta`) inherits variables `a, b` from parent (`Alpha`)  
- Child class has its own variables `x, y`  

METHODS INHERITANCE  
- `display()` in Beta prints all parent and child variables


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Alpha`  
- `int a, b`  
- Zero-parameter constructor → initializes `a=10, b=20` and prints message  
- Parameterized constructor → initializes `a` and `b` with given values

CLASS `Beta`  
- `int x, y` → child variables  
- Zero-parameter constructor → calls `this(2, 2)` first (invokes Beta parameterized constructor)  
- Parameterized constructor → calls `super(4, 33)` to initialize parent variables, sets child variables  
- `display()` → prints `a, b, x, y`  

MAIN METHOD  
- Creates two Beta objects:  
  - `Beta b = new Beta(1, 2)` → invokes parameterized constructor  
  - `Beta b1 = new Beta()` → invokes zero-parameter constructor which internally calls `this(2, 2)`


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`a, b` (Alpha)  
- Parent variables, initialized via `super(...)` in Beta parameterized constructor

`x, y` (Beta)  
- Child variables, initialized in Beta constructors

Alpha constructors  
- Zero-parameter → default values and message  
- Parameterized → sets `a` and `b` explicitly

Beta constructors  
- Parameterized → sets `x, y` and calls parent constructor  
- Zero-parameter → calls `this(2,2)` first, then prints message

`display()`  
- Prints both parent and child variables

MAIN METHOD  
- Demonstrates constructor chaining, inheritance, and variable initialization order


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

**Case 1:** `Beta b = new Beta(1,2);`

① `Beta(int x,int y)` constructor executes:  
   - Calls `super(4, 33)` → Alpha parameterized constructor executes:  
       - Sets `a = 4`, `b = 33`  
       - Prints "Para cons of Alpha"  
   - Sets `x = 1`, `y = 2`  
   - Prints "Para cons of Beta"

② `b.display()` executes → prints:  
   - `a = 4`  
   - `b = 33`  
   - `x = 1`  
   - `y = 2`

---

**Case 2:** `Beta b1 = new Beta();`

① `Beta()` zero-parameter constructor executes:  
   - First statement: `this(2, 2)` → calls parameterized Beta constructor  
       - Inside Beta(int x,int y): `super(4, 33)` → Alpha parameterized constructor runs:  
           - Sets `a = 4`, `b = 33`  
           - Prints "Para cons of Alpha"  
       - Sets `x = 2`, `y = 2`  
       - Prints "Para cons of Beta"  
   - Returns to zero-parameter Beta constructor:  
       - Sets `x = 1`, `y = 2` (overwrites previous values)  
       - Prints "Beta zero para constructor"

② `b1.display()` executes → prints:  
   - `a = 4` (from Alpha constructor)  
   - `b = 33` (from Alpha constructor)  
   - `x = 1` (overwritten in zero-parameter Beta constructor)  
   - `y = 2` (overwritten in zero-parameter Beta constructor)


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Para cons of Alpha  
Para cons of Beta  
4  
33  
1  
2  
Para cons of Alpha  
Para cons of Beta  
Beta zero para constructor  
4  
33  
1  
2


7. ADDITIONAL NOTES
-------------------------------------------------
- `this()` and `super()` cannot both appear on the same constructor except via chaining rules:  
  - `this()` must be first if used; `super()` must be first if used  
- Constructor chaining ensures correct initialization of parent and child variables  
- Zero-parameter Beta constructor calls parameterized Beta constructor first, then executes its own body  
- Overwriting of `x, y` occurs due to statements after `this()` call in zero-parameter constructor

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
