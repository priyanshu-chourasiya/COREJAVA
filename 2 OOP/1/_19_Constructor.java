class Finisher {
    private int id;
    private String name;
    private String city;

    public Finisher() {
        super();
        System.out.println("Zero parametrized constructor");
    }

    public Finisher(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;

        System.out.println("Parametrized constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class _19_Constructor {
    public static void main(String[] args) {
        Finisher f1 = new Finisher();
        f1.setId(1);
        f1.setName("Priyanshu");
        f1.setCity("Bhopal");

        System.out.println(f1.getId());
        System.out.println(f1.getName());
        System.out.println(f1.getCity());

        System.out.println("_______________________________");

        Finisher f2 = new Finisher(2,"Rohit","Indore");
        System.out.println(f2.getId());
        System.out.println(f2.getName());
        System.out.println(f2.getCity());


    }
}
/* ============================================================
   REVISION NOTES — ANALYSIS OF THE GIVEN PROGRAM
   ============================================================

1. WHAT THE ENTIRE PROGRAM DOES
------------------------------------------------------------
The program defines a class `Finisher` with two constructors and
standard getter/setter methods.  
In `main`, two objects are created:
• `f1` using the zero-parameter constructor, then initialized via setters.  
• `f2` using the parameterized constructor, which initializes all fields immediately.

The program prints the internal state (id, name, city) of both objects.


2. IMPORTANT CONCEPTS APPEARING IN THE CODE
------------------------------------------------------------

• Constructor Overloading  
  Two constructors allow object creation with or without supplying initial values.

• Explicit `super()` Call  
  Calls the parent class (Object) constructor from each `Finisher`
  constructor.

• Encapsulation via Private Fields  
  The variables `id`, `name`, and `city` are private and accessed only
  through getters and setters.

• Getter and Setter Methods  
  Public methods that read (`get`) or modify (`set`) private fields.


3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
------------------------------------------------------------

• Constructor Overloading  
  - `Finisher()` creates an object with default (uninitialized) fields.  
  - `Finisher(int id, String name, String city)` creates an object and
    directly assigns values to all fields.

• Explicit `super()`  
  Used in both constructors to explicitly invoke the parent class constructor
  before performing class-specific initialization.

• Encapsulation  
  `id`, `name`, and `city` are private; direct access is not allowed.
  The program assigns and retrieves their values exclusively through the
  setter and getter methods.

• Getter/Setter Methods  
  Used in `main` to modify and read object data.


4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
------------------------------------------------------------

• class Finisher  
  Represents a model object with three fields, constructors, and access methods.

• private int id  
  Stores a unique numeric identifier for a Finisher object.

• private String name  
  Stores the name associated with the object.

• private String city  
  Stores the city information for the object.

• Finisher()  
  Zero-parameter constructor.  
  Calls `super()`, prints:  
     "Zero parametrized constructor".

• Finisher(int id, String name, String city)  
  Parameterized constructor.  
  Calls `super()`, assigns all instance fields, prints:  
     "Parametrized constructor".

• getId(), setId(int id)  
  Read and modify the `id` value.

• getName(), setName(String name)  
  Read and modify the `name` value.

• getCity(), setCity(String city)  
  Read and modify the `city` value.

• class _19_Constructor  
  Contains the program’s `main` method.

• main(String[] args)  
  Creates two Finisher objects, initializes them (via setters or constructor),
  and prints their field values.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
------------------------------------------------------------

A. Execution for object f1:

(1) `Finisher f1 = new Finisher();`  
     → Calls zero-parameter constructor.  
     → `super()` runs.  
     → Prints:  
           Zero parametrized constructor  

(2) Setter calls:  
     f1.setId(1)  
     f1.setName("Priyanshu")  
     f1.setCity("Bhopal")  
     → These update the private fields.

(3) Getter calls print:  
     1  
     Priyanshu  
     Bhopal  

(4) Prints separator line:  
     _______________________________


B. Execution for object f2:

(1) `Finisher f2 = new Finisher(2,"Rohit","Indore");`  
     → Calls parameterized constructor.  
     → `super()` runs.  
     → Assigns id=2, name="Rohit", city="Indore".  
     → Prints:  
           Parametrized constructor  

(2) Getter calls print:  
     2  
     Rohit  
     Indore  


6. EXACT OUTPUT PRODUCED WHEN THE PROGRAM RUNS
------------------------------------------------------------

Zero parametrized constructor
1
Priyanshu
Bhopal
_______________________________
Parametrized constructor
2
Rohit
Indore


7. (Per requirement) — No suggestions, improvements, or rewrites included.

============================================================ */
