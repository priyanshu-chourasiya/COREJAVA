class Demo2{
    static int a,b,c;   // static variables can be accessed in static blocks and variables // class variables
    //static int b;
    int x,y,z; 
    
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

    { // java initialization block
        x = 44;
        y = 45;
        z = 90;
        System.out.println("Java initializtion block");
    }

    Demo2(){
        System.out.println("Constructor");
    }

    void display2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
public class _24_Static {
    public static void main(String[] args) {
        Demo2.display();

        Demo2 d2 = new Demo2();
        d2.display2();
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _24_Static (Demo2)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates:
- How static variables and a static block behave.
- How instance variables and an instance initialization block behave.
- The order of execution involving static blocks, instance initialization blocks,
  constructors, and methods.
- The difference between class-level data (static) and object-level data (instance).


2. IMPORTANT CONCEPTS (ONLY THOSE USED IN THIS CODE)
-----------------------------------------------------

STATIC VARIABLES  
- Variables belonging to the class itself, shared by all objects.

STATIC BLOCK  
- Runs once when the class is loaded.  
- Used to initialize static/class-level data.

INSTANCE VARIABLES  
- Variables belonging to each individual object of the class.

INSTANCE INITIALIZATION BLOCK (Java Initialization Block)  
- A block that runs automatically *every time an object is created*,  
  before the constructor executes.

CONSTRUCTOR  
- A special method that runs after the instance initialization block,  
  used to perform object setup tasks.

STATIC METHOD  
- A method that can be called using the class name without creating an object.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

STATIC VARIABLES `a, b, c`  
- Initialized in the static block to 10, 20, and 30.  
- Shared by all instances of Demo2.

STATIC BLOCK  
- Executes once when the Demo2 class loads.  
- Prints "static inti block" and initializes static variables.

INSTANCE VARIABLES `x, y, z`  
- Belong to each Demo2 object.  
- Initialized in the instance initialization block.

INSTANCE INITIALIZATION BLOCK  
- Assigns x=44, y=45, z=90.  
- Prints "Java initializtion block".  
- Runs BEFORE the constructor each time an object is created.

CONSTRUCTOR `Demo2()`  
- Prints "Constructor".  
- Runs AFTER the instance initialization block.

STATIC METHOD `display()`  
- Prints the static variables a, b, c.

INSTANCE METHOD `display2()`  
- Prints the static variables a, b, c and instance variables x, y, z.

MAIN METHOD  
- Calls the static method display().  
- Creates a Demo2 object (triggering instance initialization + constructor).  
- Calls display2() on the created object.


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

STATIC VARIABLES  
- `a, b, c`: Store class-level numeric data initialized in static block.

INSTANCE VARIABLES  
- `x, y, z`: Store object-level numeric data initialized in instance block.

STATIC BLOCK  
- Initializes static variables and prints a message.

INSTANCE INITIALIZATION BLOCK  
- Initializes instance variables and prints a message before constructor runs.

CONSTRUCTOR  
- Prints "Constructor" to show when object creation reaches this stage.

STATIC METHOD `display()`  
- Displays the current values of static variables.

INSTANCE METHOD `display2()`  
- Displays both static and instance variable values.

MAIN METHOD  
- First calls the class-level display() method.  
- Then creates an object of Demo2.  
- Calls display2() on the object.


5. FULL CONTROL FLOW (START → END)
----------------------------------

① Program begins; class `_24_Static` loads.  
② The main method starts.

③ The *Demo2* class is referenced → JVM loads Demo2 → static block runs:  
   - Prints: "static inti block"  
   - Initializes a=10, b=20, c=30.

④ `Demo2.display()` executes:  
   - Prints:  
       10  
       20  
       30

⑤ A Demo2 object is created → triggers object initialization:  
   a. Instance initialization block runs:  
      - Sets x=44, y=45, z=90  
      - Prints "Java initializtion block"  
   b. Constructor runs:  
      - Prints "Constructor"

⑥ `d2.display2()` executes and prints static + instance variable values:  
   10  
   20  
   30  
   44  
   45  
   90

⑦ Program ends.


6. EXACT OUTPUT WHEN PROGRAM RUNS
---------------------------------
static inti block  
10  
20  
30  
Java initializtion block  
Constructor  
10  
20  
30  
44  
45  
90

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
