class Demo{
    int num1,num2;

    Demo(){ // in first statement of any constructor there is always a super method call behind the scenes
        // if u write or even dont write
        // only not if there is a this method in constructor
        super();
        System.out.println("Zero paramertized constructor");
    }
    Demo(int num1,int num2){
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Two para construtor");
    }
    Demo(int num1){
        this(); // will call constructor of same class
        this.num1 = num1;
        num2 = 34;
        System.out.println("One para construtor");
    }

    void display(){
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+ num2);
    }
}
public class _17_Construtor {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        d1.display();
    }   
}
// super method is used to call parent class constructor

/* ============================================================
   REVISION NOTES — ANALYSIS OF THE GIVEN PROGRAM
   ============================================================

1. WHAT THE ENTIRE PROGRAM DOES
------------------------------------------------------------
The program defines a class `Demo` containing three overloaded
constructors and a `display()` method. It demonstrates how
constructor chaining works using `this()` and how `super()` is
implicitly/explicitly invoked.  
In `main`, an object `Demo d1 = new Demo(4);` is created, causing
a sequence of constructor calls that initialize `num1` and `num2`,
print messages, and finally print the values through `display()`.


2. IMPORTANT CONCEPTS APPEARING IN THE CODE
------------------------------------------------------------

• Constructor Overloading  
  Multiple constructors exist with different parameter lists,
  allowing objects of the same class to be created in different ways.

• Constructor Chaining Using `this()`  
  A call to another constructor within the same class. It must be
  the first statement in the constructor. Used to reuse initialization
  logic.

• `super()` Constructor Call  
  Explicit or implicit call to the parent class constructor. If not
  written, Java adds it automatically unless `this()` is present.

• Instance Variables  
  `num1` and `num2` are variables belonging to each `Demo` object
  and store object-specific values.

• Method Invocation  
  `display()` prints the internal state (`num1`, `num2`) of the object.


3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
------------------------------------------------------------

• Constructor Overloading  
  The class `Demo` defines three constructors:  
  - `Demo()` → no parameters  
  - `Demo(int num1, int num2)` → sets both instance variables  
  - `Demo(int num1)` → calls the zero-argument constructor, sets `num1`,
    assigns a fixed value to `num2`

• Constructor Chaining (`this()`)  
  Used in `Demo(int num1)` to invoke the zero-parameter constructor first.

• `super()`  
  Explicitly used only in the zero-parameter constructor (`Demo()`).
  In other constructors, Java inserts `super()` automatically since
  there is no `this()` call.

• Instance Variables  
  `num1` and `num2` hold values that are printed in `display()`.

• Method Invocation  
  `d1.display()` prints the values after constructor execution.


4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
------------------------------------------------------------

• Class Demo  
  Encapsulates data (`num1`, `num2`) and constructor logic illustrating
  constructor chaining and initialization.

• int num1, num2  
  Store numeric data for each `Demo` object.

• Demo()  
  Zero-parameter constructor.  
  Calls `super()`, prints a message, and serves as the base constructor
  invoked by `this()` inside the one-parameter constructor.

• Demo(int num1, int num2)  
  Two-parameter constructor.  
  Directly assigns passed values to instance variables and prints a message.

• Demo(int num1)  
  One-parameter constructor.  
  Calls `this()` → triggers the zero-parameter constructor.  
  Then assigns the provided value to `num1` and sets `num2 = 34`, 
  followed by printing a message.

• void display()  
  Prints the values of `num1` and `num2`.

• Class _17_Construtor  
  Contains the `main()` method that drives program execution.

• main(String[] args)  
  Creates an instance of `Demo` using the one-parameter constructor, 
  then calls `display()`.

• Demo d1 = new Demo(4);  
  Triggers constructor chaining and produces a series of console outputs.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
------------------------------------------------------------

(1) Program begins execution in `main()`.  
(2) Statement `Demo d1 = new Demo(4);` executes.  
(3) `Demo(int num1)` constructor is invoked.  
(4) First line inside this constructor is `this();`, so  
      → `Demo()` zero-parameter constructor is called.  
(5) Inside `Demo()` → `super()` executes (calling Object’s constructor).  
(6) `Demo()` prints:  
      "Zero paramertized constructor"  
(7) Control returns to `Demo(int num1)`.  
(8) `this.num1 = num1;` assigns the passed value (4) to instance variable `num1`.  
(9) `num2 = 34;` assigns 34 to instance variable `num2`.  
(10) Prints:  
       "One para construtor"  
(11) Constructor chain completes; object `d1` is now fully initialized.  
(12) `d1.display()` is executed.  
(13) `display()` prints current values of instance variables.  
(14) Program ends.


6. EXACT BEHAVIOR AND OUTPUT WHEN THE PROGRAM RUNS
------------------------------------------------------------

The constructors print messages in the order they execute:
1. From `Demo()`  
      Zero paramertized constructor
2. From `Demo(int num1)`  
      One para construtor
3. From `display()`  
      num1 : 4  
      num2 : 34


7. (Per requirement) — No suggestions, improvements, or rewrites included.

============================================================ */```
