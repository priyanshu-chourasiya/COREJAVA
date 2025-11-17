class Dog{
    private int cost;
    private String name;
    private String color;

    public Dog(int cost, String name, String color){
        this.cost = cost;
        this.name = name;
        this.color = color;
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
public class _14_Constructor {
    public static void main(String[] args) {
        Dog d1 = new Dog(4,"Sheru","Black"); // call to constructor
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());

        //Dog d2 = new Dog(); error
    }
}
// java will include a default construtor only if we dont initialize any constructor
// non parametrized constructor

/*
===============================================================================
REVISION NOTES FOR _14_Constructor (Dog Class with Parameterized Constructor)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- Demonstrates **Encapsulation** + **Parameterized Constructors** in Java.
- A `Dog` class is created with private fields (cost, name, color).
- A parameterized constructor initializes these values when an object is created.
- Getter and setter methods allow safe access and modification.
- The main method creates one Dog object and prints its details.

-------------------------------------------------------------------------------
2. DEFINITIONS OF EVERY CONCEPT USED IN THE CODE
-------------------------------------------------------------------------------

CLASS  
- A blueprint for creating objects.  
- Here: `Dog` and `_14_Constructor`.

OBJECT  
- An instance of a class created using `new`.  
- Example: `Dog d1 = new Dog(4,"Sheru","Black");`

ENCAPSULATION  
- Data hiding using private variables and public getters/setters.

PRIVATE  
- Access modifier restricting access to within the class only.

CONSTRUCTOR  
- Special method that initializes objects.  
- Has the same name as the class.  
- Does NOT have a return type.

PARAMETERIZED CONSTRUCTOR  
- A constructor that accepts arguments to initialize variables.  
- Example: `Dog(int cost, String name, String color)`

DEFAULT CONSTRUCTOR  
- A constructor with no parameters created by Java automatically  
  **only when no constructor is manually defined**.

THIS KEYWORD  
- Refers to the current object.  
- Used to differentiate between instance variables and parameters.

GETTERS  
- Methods that return the value of private variables.

SETTERS  
- Methods that update the value of private variables.

SYSTEM.OUT.PRINTLN  
- Used to print output to the console.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT SPECIFICALLY IN YOUR CODE
-------------------------------------------------------------------------------

PRIVATE VARIABLES  
- `cost`, `name`, `color` → hidden from outside code.

PARAMETERIZED CONSTRUCTOR  
- Initializes all three private variables.

THIS KEYWORD  
- Used in constructor → `this.cost = cost;`  
- Ensures instance variable receives the parameter.

SETTERS & GETTERS  
- Allow controlled access and modification of private fields.

OBJECT CREATION  
- `Dog d1 = new Dog(4,"Sheru","Black");`  
  Calls the parameterized constructor.

DEFAULT CONSTRUCTOR  
- Not available because a parameterized constructor is manually defined.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

Dog CLASS  
- Represents a Dog with cost, name, and color.

VARIABLES  
- `int cost` → price or cost of the dog  
- `String name` → dog’s name  
- `String color` → dog’s color  

CONSTRUCTOR  
- `Dog(int cost, String name, String color)`  
  Initializes all three instance variables.

GETTER METHODS  
- getCost(), getName(), getColor() → return stored values

SETTER METHODS  
- setCost(), setName(), setColor() → modify stored values

CLASS _14_Constructor  
- Contains the main method.

MAIN METHOD  
- Creates a Dog object using the parameterized constructor.  
- Prints the values using getter methods.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION (START → END)
-------------------------------------------------------------------------------

1. Program starts at `main()`.
2. `Dog d1 = new Dog(4,"Sheru","Black");`  
   → Calls constructor  
   → Assigns: cost=4, name=Sheru, color=Black
3. Getter methods print the stored values:
   - 4  
   - Sheru  
   - Black
4. Program ends.

-------------------------------------------------------------------------------
6. EXPECTED OUTPUT
-------------------------------------------------------------------------------

4  
Sheru  
Black  

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
