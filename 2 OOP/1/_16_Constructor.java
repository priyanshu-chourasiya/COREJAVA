class Dog{
    private int cost;
    private String name;
    private String color;

    // public Dog(int cost, String name, String color){
    //     this.cost = cost;
    //     this.name = name;
    //     this.color = color;
    // }

    // Dog(){ // construtor overloading
    //     System.out.println("Zero parametrized constructor");
    //     cost = 455;
    //     name = "Rahul";
    //     color = "Pink";
    // }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
public class _16_Constructor {
    public static void main(String[] args) {
        Dog d1 = new Dog(4,"Sheru","Black"); // call to parametrized constructor but it is not present 
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());
        System.out.println("**************************************");
        Dog d2 = new Dog();
        System.out.println(d2.getCost());
        System.out.println(d2.getName());
        System.out.println(d2.getColor());
    }
} 
    
// Encapsulation : process of giving controlled access to data members (instance variable) of a class by making them
/* private and using getters and setters 
 * process of binding data members and member functions as a unit.
 * process of providing security to most important component of object(data member) by making it private and giving controlled
 * access through stters and getters
 * it can be acheived using private keyword, getters and setters
 * 
 * Constructor:
 * it is a specialized setter whose name is same as that of class name and doesnt have any explicit return type
 * it is envoked during object creation/instantion
 * if there is a call to constructor and java developer has not included any construtor in a class
 * then java compiler default zero parametrized constructor 
 * if there is a cons. is coded then java compiler will not include default cons.
 * we can have multiple cons. in a class. cons overloading
 * 
 * this keyword will have address of currently running instance/object i.e., currently whichever object is getting
 * executed it will refer to that object instance
 * it will be used inside setter and construtor to differentiate local and instance variable and to assign 
 * data to instance variale to local(solution of shadowing problem)
 */ 

 /*
===============================================================================
REVISION NOTES FOR _16_Constructor (Missing Constructors Demonstration)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- Demonstrates what happens when a class contains **no constructors** and the  
  programmer attempts to call both:
  - A non-existent **parameterized constructor**.
  - A **default constructor**.
- The code attempts to create two Dog objects, but since no constructors are 
  actually defined (both constructors are commented out), this will lead to a 
  **compile-time error** for the first object creation, while the second object 
  uses the compiler-generated default constructor.

-------------------------------------------------------------------------------
2. IMPORTANT CONCEPT DEFINITIONS USED IN THE CODE
-------------------------------------------------------------------------------

ENCAPSULATION  
- Restricting access to data using private variables and public getters/setters.

PRIVATE  
- Limits variable access to within the same class.

GETTERS / SETTERS  
- Methods used to access and modify private variables.

DEFAULT CONSTRUCTOR (Compiler-Generated)  
- A zero-parameter constructor automatically added by the compiler when  
  *no* constructor is defined in the class.

CONSTRUCTOR CALL  
- Syntax: `new ClassName(parameters)`  
- Must match an existing constructor.

COMPILE-TIME ERROR  
- Error detected by the compiler before running the program.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
-------------------------------------------------------------------------------

PRIVATE VARIABLES  
- cost, name, color → hidden and accessible only via getters/setters.

GETTERS  
- getCost(), getName(), getColor() → used in main() to print stored values.

SETTERS  
- setCost(), setName(), setColor() → included but unused in this program.

DEFAULT CONSTRUCTOR  
- Used automatically for `Dog d2 = new Dog();`  
- Does **not** initialize variables → cost = 0, name = null, color = null.

PARAMETERIZED CONSTRUCTOR (NOT PRESENT)  
- d1 creation attempts to call one: `new Dog(4,"Sheru","Black")`  
- But since this constructor is commented out, the call fails.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Dog  
- Contains encapsulated properties of a dog (cost, name, color).

INSTANCE VARIABLES  
- cost → numeric value  
- name → dog's name  
- color → dog's color  

GETTER METHODS  
- Return their respective private variables.

SETTER METHODS  
- Modify private variables.

CLASS _16_Constructor  
- Contains main method demonstrating constructor behavior.

MAIN METHOD  
- Attempts to create objects using both parameterized and default constructors.  
- Prints values stored in those objects.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION (START → END)
-------------------------------------------------------------------------------

1. Program begins at `main()`.
2. `Dog d1 = new Dog(4,"Sheru","Black");`  
   → Compiler checks for a matching constructor.  
   → No such constructor exists (it was commented out).  
   → **Compilation fails here. The program cannot run.**
3. No further statements execute.

(If the parameterized constructor line were removed or fixed, the remaining flow would be:)
- `Dog d2 = new Dog();`  
  → Compiler-generated default constructor runs.  
  → cost = 0, name = null, color = null  
- Getter methods print default values.

-------------------------------------------------------------------------------
6. EXACT BEHAVIOR / OUTPUT (ACTUAL RESULT)
-------------------------------------------------------------------------------

The program does NOT run.

Compilation error:

    constructor Dog in class Dog cannot be applied to given types;
    required: no arguments
    found: int,String,String

No console output is produced.

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
