    class Demo{
        int num1,num2;

        Demo(){ // in first statement of any constructor there is always a super method call behind the scenes
            // if u write or even dont write
            // only not if there is a this method in constructor
            super();
            System.out.println("Zero paramertized constructor");
        }
        Demo(int num1,int num2){
            this(num1);
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
    public class _18_Construtor {
        public static void main(String[] args) {
            Demo d1 = new Demo(4);
            d1.display();

            System.out.println("______________________________");

            Demo d2 = new Demo(8,9);
            d2.display();
        }   
    }
    // super method is used to call parent class constructor

/* ============================================================
   REVISION NOTES — ANALYSIS OF THE GIVEN PROGRAM
   ============================================================

1. WHAT THE ENTIRE PROGRAM DOES
------------------------------------------------------------
The program demonstrates multi-level constructor chaining within
the `Demo` class using both `this()` and `super()`.  
Different constructors initialize `num1` and `num2` in different ways.
In `main`, two objects (`d1` and `d2`) are created, triggering
different constructor chains. Then their internal values are printed
via `display()`.


2. IMPORTANT CONCEPTS APPEARING IN THE CODE
------------------------------------------------------------

• Constructor Overloading  
  Several constructors with different parameter lists allow multiple
  ways of creating objects.

• Constructor Chaining Using `this()`  
  A mechanism to call another constructor of the same class. Always
  appears as the first statement.

• Explicit `super()` Call  
  Calls the parent class constructor. Used only in the zero-parameter
  constructor, otherwise inserted automatically unless `this()` is used.

• Instance Variables  
  `num1` and `num2` hold data specific to each object.

• Method Invocation  
  `display()` prints the object’s state.


3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
------------------------------------------------------------

• Constructor Overloading  
  - `Demo()` → no parameters  
  - `Demo(int num1)` → initializes object using base constructor  
  - `Demo(int num1, int num2)` → further chains through the 1-parameter constructor

• Constructor Chaining  
  - `Demo(int num1)` calls `this()` → triggers `Demo()`  
  - `Demo(int num1, int num2)` calls `this(num1)` → triggers 1-parameter constructor,
    which further triggers the zero-parameter constructor

• Explicit `super()`  
  Used in `Demo()` to explicitly call the parent class constructor.

• Instance Variables  
  - `num1` → stores the main numeric input  
  - `num2` → stores either default (34) or provided value

• `display()`  
  Prints the final values after all constructor executions complete.


4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
------------------------------------------------------------

• Class Demo  
  Demonstrates how different constructors interact and initialize state.

• int num1, num2  
  Store numeric fields associated with each Demo object.

• Demo()  
  Zero-parameter constructor.  
  Calls `super()`, prints  
     "Zero paramertized constructor".

• Demo(int num1)  
  One-parameter constructor.  
  Calls `this()` → executes the zero-parameter constructor.  
  Initializes `num1`, sets `num2 = 34`, prints  
     "One para construtor".

• Demo(int num1, int num2)  
  Two-parameter constructor.  
  Calls `this(num1)` → triggers the one-parameter constructor  
  (which triggers the zero-parameter constructor).  
  Reassigns `this.num1 = num1` and `this.num2 = num2`, prints  
     "Two para construtor".

• void display()  
  Prints values of `num1` and `num2`.

• Class _18_Construtor  
  Contains the main entry point of the program.

• main(String[] args)  
  Creates two Demo objects using different constructor paths
  and prints their values.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
------------------------------------------------------------

A. Execution for:   Demo d1 = new Demo(4);

(1) `Demo(int num1)` is invoked.  
(2) First statement is `this()` → calls `Demo()`.  
(3) Inside `Demo()` → `super()` runs → then prints:  
        Zero paramertized constructor  
(4) Returning to `Demo(int num1)` → assigns  
        this.num1 = 4  
        num2 = 34  
(5) Prints:  
        One para construtor  
(6) `d1.display()` prints:  
        num1 : 4  
        num2 : 34  


B. Execution for:   Demo d2 = new Demo(8, 9);

(1) `Demo(int num1, int num2)` is invoked.  
(2) First statement is `this(num1)` → calls `Demo(int num1)`.  
(3) Inside `Demo(int num1)` → first statement is `this()` → calls `Demo()`.  
(4) Inside `Demo()` → prints:  
        Zero paramertized constructor  
(5) Returning to `Demo(int num1)` → assigns:  
        this.num1 = 8  
        num2 = 34  
(6) Prints:  
        One para construtor  
(7) Returning to `Demo(int num1, int num2)` → assigns:  
        this.num1 = 8  
        this.num2 = 9  
(8) Prints:  
        Two para construtor  
(9) `d2.display()` prints:  
        num1 : 8  
        num2 : 9  


6. EXACT OUTPUT PRODUCED WHEN THE PROGRAM RUNS
------------------------------------------------------------

For d1:
    Zero paramertized constructor
    One para construtor
    num1 : 4
    num2 : 34

______________________________

For d2:
    Zero paramertized constructor
    One para construtor
    Two para construtor
    num1 : 8
    num2 : 9


7. (Per requirement) — No suggestions, improvements, or rewrites included.

============================================================ */
