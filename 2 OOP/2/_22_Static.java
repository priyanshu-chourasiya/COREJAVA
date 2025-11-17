class Demo{
    static int a,b,c;   // static variables can be accessed in static blocks and variables
    //static int b;
    //int x,y,z; we caanot do this or do use these we have to create object in main class
    
    static { // static block
        System.out.println("static inti block");
        a = 10;
        b = 20;
        c = 30;
    }
    static void display(){   
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class _22_Static {
    public static void main(String[] args) {
        Demo.display(); // no need to create any object we can call method by class
    }
}
/* ============================================================
   REVISION NOTES — ANALYSIS OF THE GIVEN PROGRAM
   ============================================================

1. WHAT THE ENTIRE PROGRAM DOES
------------------------------------------------------------
The program demonstrates the behavior of static variables, static
blocks, and static methods in Java.  
When the class `Demo` is loaded, its static block initializes the static
variables and prints a message.  
In `main`, the static method `display()` is called directly using the
class name, which prints the values of the static variables.


2. IMPORTANT CONCEPTS APPEARING IN THE CODE
------------------------------------------------------------

• Static Variables  
  Variables shared by all objects of a class, belonging to the class
  itself rather than any instance.

• Static Block  
  A block that runs only once, at the moment the class is loaded into
  memory. Used for static initialization.

• Static Method  
  A method that belongs to the class rather than an object and can be
  called without creating an instance of the class.

• Class Loading  
  The moment the JVM loads a class, triggering its static block and
  initializing static fields.


3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
------------------------------------------------------------

• Static Variables (a, b, c)  
  Assigned default values upon class loading, then explicitly updated
  inside the static block.

• Static Block  
  Runs as soon as `Demo` is referenced (before first method call).  
  Sets `a`, `b`, and `c`, and prints the message:  
      static inti block

• Static Method display()  
  Prints the current values of the static variables.  
  Called directly using the class name: `Demo.display()`.

• Class Loading  
  Occurs when `_22_Static.main()` references the `Demo` class, causing
  the static block inside `Demo` to execute automatically.


4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
------------------------------------------------------------

• static int a, b, c  
  Store integer values shared across the class. Used to demonstrate
  static initialization and static access.

• static { ... } (static block)  
  Executes once when `Demo` loads. Initializes `a`, `b`, and `c`, and
  prints initialization text.

• static void display()  
  Prints the three static variable values.

• class Demo  
  Contains all static content used for demonstration.

• class _22_Static  
  Contains `main` and triggers class loading of `Demo`.

• main(String[] args)  
  Calls `Demo.display();`, causing class loading and output.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
------------------------------------------------------------

(1) Program starts in `main()`.  
(2) The statement `Demo.display();` references class `Demo`.  
(3) JVM loads the `Demo` class.  
(4) As soon as the class loads, the static block executes:  
       Prints: "static inti block"  
       Sets a=10, b=20, c=30  
(5) After class initialization, the static method `display()` is called.  
(6) `display()` prints:  
       10  
       20  
       30  
(7) Program ends.


6. EXACT OUTPUT PRODUCED WHEN THE PROGRAM RUNS
------------------------------------------------------------

static inti block
10
20
30


7. (Per requirement) — No suggestions, improvements, or rewrites included.

============================================================ */
