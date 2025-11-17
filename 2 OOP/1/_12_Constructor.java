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

public class _12_Constructor {
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
        f2.setId(10);
        f2.setName("ABC");
        f2.setCity("Mumbai");
        System.out.println(f2.getId());
        System.out.println(f2.getName());
        System.out.println(f2.getCity());


    }
}
 
/*
===============================================================================
REVISION NOTES FOR _12_Constructor
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **constructor overloading** and **encapsulation**.
- The `Finisher` class has:
  - A zero-parameter constructor.
  - A parameterized constructor with three parameters.
- Both constructors print messages when they run.
- The class also includes getters and setters for private fields.
- The main method creates two objects (one with each constructor) and prints their data.

-------------------------------------------------------------------------------
2. IMPORTANT CONCEPT DEFINITIONS USED IN THIS CODE
-------------------------------------------------------------------------------

CONSTRUCTOR  
- A special method used to initialize an object when it is created.
- It has the same name as the class and no return type.
- Used here to initialize object fields and print messages.

CONSTRUCTOR OVERLOADING  
- Defining multiple constructors with different parameter lists.
- Allows flexible ways to create and initialize objects.

THIS KEYWORD  
- Refers to the current object.
- Used in the parameterized constructor to differentiate between instance variables and method parameters.

SUPER()  
- Calls the constructor of the parent class.
- Here it calls `Object` class constructor implicitly (no visible effect other than correct constructor chaining).

ENCAPSULATION  
- Private variables with public getter/setter methods to control access.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------------------------------
- **Constructor Overloading**: The class has both zero and parameterized constructors.
- **this.id = id**: Resolves shadowing and assigns parameters to instance variables.
- **super()**: Ensures correct constructor calling hierarchy.
- **Getters/Setters**: Used to access and modify private fields after construction.
- **Main Method**: Demonstrates different ways of object initialization.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Finisher  
Represents an object containing `id`, `name`, and `city`.

PRIVATE VARIABLES  
- `int id` → stores ID.  
- `String name` → stores name.  
- `String city` → stores city.

CONSTRUCTORS  
- `public Finisher()`  
  - Initializes object with default values (0, null, null).  
  - Prints: "Zero parametrized constructor".

- `public Finisher(int id, String name, String city)`  
  - Initializes fields with provided values.  
  - Uses `this` to assign fields.  
  - Prints: "Parametrized constructor".

GETTERS  
- `getId()`, `getName()`, `getCity()` → return corresponding values.

SETTERS  
- `setId()`, `setName()`, `setCity()` → allow modifying fields after object creation.

CLASS _12_Constructor  
Contains the `main` method to create and manipulate Finisher objects.

MAIN METHOD STEPS  
1. Creates object `f1` using zero-parameter constructor.  
2. Sets values (1, "Priyanshu", "Bhopal") using setters.  
3. Prints those values.  
4. Prints separating line.  
5. Creates object `f2` using parameterized constructor with values (2, "Rohit", "Indore").  
6. Modifies values using setters (10, "ABC", "Mumbai").  
7. Prints modified values.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
-------------------------------------------------------------------------------

1. Program starts at `main`.
2. `Finisher f1 = new Finisher();`  
   - Zero constructor runs → prints: "Zero parametrized constructor".
3. Setters assign values to `f1`:  
   - id = 1  
   - name = "Priyanshu"  
   - city = "Bhopal"
4. Getters print:  
   - 1  
   - Priyanshu  
   - Bhopal
5. Prints separator line.
6. `Finisher f2 = new Finisher(2, "Rohit", "Indore");`  
   - Parameterized constructor runs → prints: "Parametrized constructor"  
   - Initializes fields to (2, "Rohit", "Indore")
7. Setters modify the values to:  
   - id = 10  
   - name = "ABC"  
   - city = "Mumbai"
8. Getters print:  
   - 10  
   - ABC  
   - Mumbai
9. Program ends.

-------------------------------------------------------------------------------
6. EXACT OUTPUT PRODUCED
-------------------------------------------------------------------------------
Zero parametrized constructor
1
Priyanshu
Bhopal
_______________________________
Parametrized constructor
10
ABC
Mumbai

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
