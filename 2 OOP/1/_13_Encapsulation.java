class Learner{
    private int id;
    private String name;
    private String city;

    void setId(int id){  // this is used to differentiate between local instance variable inside a setter
        this.id = id;        
    }
    void setName(String name){ // this is used to access or modify currently running objects
        this.name = name;
    }
    void setCity(String city){ 
        this.city = city;
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
public class _13_Encapsulation {
    public static void main(String[] args) {
        Learner l1 = new Learner();
        l1.setId(1);
        l1.setCity("Bhopal");
        l1.setName("Priyanshu");

        //int id = l1.getId();
        System.out.println(l1.getId()); 
        System.out.println(l1.getCity()); 
        System.out.println(l1.getName()); 

        System.out.println("***********************************");

        Learner l2 = new Learner();
        l2.setId(2);
        l2.setCity("Delhi");
        l2.setName("Tejas");

        //int id = l1.getId();
        System.out.println(l2.getId()); 
        System.out.println(l2.getCity()); 
        System.out.println(l2.getName()); 
    }
}
/*
===============================================================================
REVISION NOTES FOR _13_Encapsulation
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **Encapsulation** using private variables and
  public setter/getter methods.
- It also demonstrates the use of the **this keyword** to remove variable
  shadowing.
- Two different `Learner` objects are created, assigned values, and printed.

-------------------------------------------------------------------------------
2. DEFINITIONS OF EVERY CONCEPT USED IN THE CODE
-------------------------------------------------------------------------------

CLASS  
- A blueprint for creating objects.  
- Here: `Learner` and `_13_Encapsulation`.

OBJECT  
- An instance of a class created with `new`.  
- Example: `Learner l1 = new Learner();`

PRIVATE  
- Access modifier that allows variables to be used only inside the class.  
- Protects data.

ENCAPSULATION  
- Hiding data by keeping variables private and accessing them via methods.

METHOD  
- A block of code designed to perform a task.

SETTER METHOD  
- Assigns values to private fields.  
- Example: `setId(int id)`.

GETTER METHOD  
- Returns the stored values.  
- Example: `getId()`.

THIS KEYWORD  
- Refers to the current object (currently running object's instance variable).
- Used to solve naming conflicts between local variables and instance variables.

VARIABLE SHADOWING  
- Occurs when method parameters (local variables) have the same name as instance variables.
- Example: `void setId(int id)` has a local variable `id`.  
- Without `this.id = id`, assignment would not work.

SYSTEM.OUT.PRINTLN  
- Displays output to the console.

-------------------------------------------------------------------------------
3. HOW EACH CONCEPT IS USED IN THIS CODE
-------------------------------------------------------------------------------

PRIVATE VARIABLES  
- `id`, `name`, `city` are private → only accessible using getters/setters.

SETTERS WITH "this"  
- `this.id = id;` assigns value to the actual object's variable.
- Prevents shadowing confusion.

GETTERS  
- Return values stored inside the object.

OBJECT CREATION  
- `Learner l1 = new Learner();`  
- `Learner l2 = new Learner();`

MAIN METHOD  
- Assigns values to l1 and l2.  
- Prints stored values.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Learner  
- Holds 3 properties: id, name, city.

VARIABLES  
- `id`: learner's ID  
- `name`: learner's name  
- `city`: learner's city

METHODS  
- setId(int id) → stores id into the object's id using `this`.  
- setName(String name) → stores name.  
- setCity(String city) → stores city.  
- getId() → returns id.  
- getName() → returns name.  
- getCity() → returns city.

CLASS _13_Encapsulation  
- Contains main() which runs the whole program.

MAIN METHOD FLOW  
- Creates l1 → assigns ID=1, Name=Priyanshu, City=Bhopal.  
- Prints l1 data.  
- Creates l2 → assigns ID=2, Name=Tejas, City=Delhi.  
- Prints l2 data.

-------------------------------------------------------------------------------
5. CONTROL-FLOW EXPLANATION (START → END)
-------------------------------------------------------------------------------

1. Program starts with main().
2. `Learner l1 = new Learner();`  
   - Default constructor initializes variables to default values (0, null, null).
3. Setter methods for l1:  
   - `setId(1)` → this.id = 1  
   - `setCity("Bhopal")` → this.city = "Bhopal"  
   - `setName("Priyanshu")` → this.name = "Priyanshu"
4. Print getters for l1:
   - 1  
   - Bhopal  
   - Priyanshu
5. Print separator line.
6. Creates l2 → default values assigned again.
7. Setter methods for l2:
   - ID=2, City=Delhi, Name=Tejas.
8. Prints getters for l2:
   - 2  
   - Delhi  
   - Tejas
9. Program ends.

-------------------------------------------------------------------------------
6. EXPECTED OUTPUT
-------------------------------------------------------------------------------

1  
Bhopal  
Priyanshu  
***********************************  
2  
Delhi  
Tejas  

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
