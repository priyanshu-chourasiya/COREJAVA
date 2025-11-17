class Dog{
    private int cost;
    private String name;
    private String color;

    public Dog(int cost, String name, String color){
        this.cost = cost;
        this.name = name;
        this.color = color;
    }

    Dog(){ // construtor overloading
        System.out.println("Zero parametrized constructor");
        cost = 455;
        name = "Rahul";
        color = "Pink";
    }

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
public class _15_Constructor {
    public static void main(String[] args) {
        Dog d1 = new Dog(4,"Sheru","Black"); // call to constructor
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
REVISION NOTES FOR _15_Constructor (Dog Class with Constructor Overloading)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- Demonstrates **Encapsulation**, **Constructor Overloading**, and the use of  
  **this keyword**.
- The `Dog` class has two constructors:
  - A parameterized constructor that sets user-provided values.
  - A zero-parameter (default) constructor that initializes predefined values.
- The main method creates two Dog objects using both constructors and prints
  their details.

-------------------------------------------------------------------------------
2. IMPORTANT CONCEPT DEFINITIONS USED IN THIS CODE
-------------------------------------------------------------------------------

ENCAPSULATION  
- Hiding data using private variables and accessing them via getters/setters.

PRIVATE  
- Restricts access of variables to within the class.

CONSTRUCTOR  
- Special method used to initialize object data.  
- Has the same name as the class.  
- No return type.

CONSTRUCTOR OVERLOADING  
- Having multiple constructors with different parameter lists.  
- Allows different ways of creating objects.

THIS KEYWORD  
- Refers to the current object instance.  
- Used to differentiate between instance variables and parameters.

GETTERS & SETTERS  
- Methods to read (getter) and modify (setter) private variables.

SYSTEM.OUT.PRINTLN  
- Prints output to the console.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
-------------------------------------------------------------------------------

PRIVATE VARIABLES  
- cost, name, color → hidden from outside code.

PARAMETERIZED CONSTRUCTOR  
- Initializes instance variables using values passed during object creation.

ZERO-PARAMETER CONSTRUCTOR  
- Prints a message and assigns hardcoded values (455, Rahul, Pink).

THIS KEYWORD  
- Used in the parameterized constructor to assign parameter values to  
  instance variables.

SETTERS  
- Allow modification of private variables after object creation.

GETTERS  
- Retrieve and return the stored values for printing.

CONSTRUCTOR OVERLOADING  
- Two constructors provide two different ways to create Dog objects.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Dog  
- Represents a dog with cost, name, and color.

INSTANCE VARIABLES  
- cost → dog’s price  
- name → dog’s name  
- color → dog’s color  

CONSTRUCTORS  
- `Dog(int cost, String name, String color)`  
  Initializes variables with user-provided values.
- `Dog()`  
  Prints a message and assigns fixed default values.

GETTER METHODS  
- getCost(), getName(), getColor() → return stored values.

SETTER METHODS  
- setCost(), setName(), setColor() → modify stored values.

CLASS _15_Constructor  
- Contains the main method.

MAIN METHOD  
- Creates two Dog objects (one using parameterized constructor, one using zero-parameter constructor).  
- Prints each object's values.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION (START → END)
-------------------------------------------------------------------------------

1. Program starts at `main()`.
2. `Dog d1 = new Dog(4,"Sheru","Black");`  
   → Parameterized constructor executes.  
   → Assigns cost=4, name=Sheru, color=Black.
3. Getter methods print:  
   4  
   Sheru  
   Black
4. Separator line prints.
5. `Dog d2 = new Dog();`  
   → Zero-parameter constructor executes.  
   → Prints: "Zero parametrized constructor"  
   → Assigns cost=455, name=Rahul, color=Pink
6. Getter methods print:  
   455  
   Rahul  
   Pink
7. Program ends.

-------------------------------------------------------------------------------
6. EXACT OUTPUT PRODUCED
-------------------------------------------------------------------------------

4  
Sheru  
Black  
**************************************  
Zero parametrized constructor  
455  
Rahul  
Pink  

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
