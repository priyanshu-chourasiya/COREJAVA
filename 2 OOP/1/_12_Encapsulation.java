class Learner{
    private int id;
    private String name;
    private String city;

    void setId(int i){
        id = i;
    }
    void setName(String n){
        name = n;
    }
    void setCity(String c){ 
        city = c;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getCity(){
        return city;
    }
}
public class _12_Encapsulation {
    public static void main(String[] args) {
        Learner l1 = new Learner();
        l1.setId(1);
        l1.setCity("Bhopal");
        l1.setName("Priyanshu");

        //int id = l1.getId();
        System.out.println(l1.getId()); // 0
        System.out.println(l1.getCity()); // null
        System.out.println(l1.getName()); // null
    }
}
/*
===============================================================================
REVISION NOTES FOR _12_Encapsulation
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **Encapsulation** in Java using private variables
  and public setter/getter methods.
- It shows how object data is protected using private fields.
- The main method creates a `Learner` object, assigns values using setters,
  and retrieves values using getters.

-------------------------------------------------------------------------------
2. DEFINITIONS OF EVERY CONCEPT USED IN THE CODE
-------------------------------------------------------------------------------

CLASS  
- A blueprint from which objects are created.
- Used here to define the structure of `Learner`.

OBJECT  
- An instance of a class created using `new`.
- Example: `Learner l1 = new Learner();`

PRIVATE  
- Access modifier that restricts variable access only within the class.
- Used to protect data: `private int id;`

ENCAPSULATION  
- Wrapping data (variables) and methods (get/set) in a single unit.
- Secures data by hiding it and exposing controlled access.

METHOD  
- A block of code that performs a task.
- Here we have setters and getters.

SETTER METHOD  
- A method that assigns a value to a private variable.
- Example: `setId(int i)` assigns value to `id`.

GETTER METHOD  
- Returns the value stored in a private variable.
- Example: `getId()` returns the current `id`.

CONSTRUCTOR (NOT USED HERE)  
- A special method used to initialize objects.  
- In this program, Java automatically provides a default constructor.

SYSTEM.OUT.PRINTLN  
- Displays output to the console.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THE PROGRAM
-------------------------------------------------------------------------------

PRIVATE VARIABLES  
- `id`, `name`, `city` are private → cannot be accessed directly from main.
- Forces the use of getters/setters → encapsulation in action.

SETTERS IN Learner  
- Assign values to the private fields:
  - `setId(int i)` stores `i` into `id`.
  - `setCity(String c)` stores `c` into `city`.
  - `setName(String n)` stores `n` into `name`.

GETTERS IN Learner  
- Return current values of the private fields:
  - `getId()`, `getName()`, `getCity()`.

MAIN METHOD  
- Creates object `l1`.
- Uses setters to assign values.
- Uses getters to print the stored values.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, STRUCTURE
-------------------------------------------------------------------------------

CLASS Learner  
- Holds learner information using encapsulated fields.

VARIABLES  
- `id`: stores learner ID  
- `name`: stores learner name  
- `city`: stores learner city

METHODS  
- `setId(int i)`: writes data to `id`
- `setName(String n)`: writes data to `name`
- `setCity(String c)`: writes data to `city`
- `getId()`: returns value of `id`
- `getName()`: returns value of `name`
- `getCity()`: returns value of `city`

CLASS _12_Encapsulation  
- Contains the `main` method → program entry point.

MAIN METHOD FLOW  
1. Creates object `l1`.  
2. Calls setter methods to assign values.  
3. Prints values retrieved via getters.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION (START → END)
-------------------------------------------------------------------------------

1. Program starts at `main()`.
2. `Learner l1 = new Learner();`  
   - Default constructor executes.  
   - Variables are initialized to default values:  
     - id = 0  
     - name = null  
     - city = null
3. `l1.setId(1);`  
   - Stores value 1 in `id`.
4. `l1.setCity("Bhopal");`  
   - Stores "Bhopal" in `city`.
5. `l1.setName("Priyanshu");`  
   - Stores "Priyanshu" in `name`.
6. Print statements call getters:
   - `l1.getId()` → prints 1  
   - `l1.getCity()` → prints "Bhopal"  
   - `l1.getName()` → prints "Priyanshu"
7. Program ends.

-------------------------------------------------------------------------------
6. EXPECTED OUTPUT (CORRECTED)
-------------------------------------------------------------------------------

1  
Bhopal  
Priyanshu  

(Note: Comments given in your code saying "0", "null", "null" are incorrect because you assigned values before printing.)

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
