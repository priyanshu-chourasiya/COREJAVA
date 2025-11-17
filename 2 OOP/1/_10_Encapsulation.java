
class  Employee1{
    private int id;
    private String name;

    // setter
    void setId(int i){
        id = i;
    }
    void setName(String n){
        name = n;
    }

    // getter
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}
public class _10_Encapsulation {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.setId(34);
        e1.setName("Priyanshu");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
    
}
/*
===============================================================================
REVISION NOTES FOR _10_Encapsulation
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **encapsulation** using a simple `Employee1` class.
- The class keeps its `id` and `name` variables private.
- Values are assigned using setter methods and accessed using getter methods.
- The main method creates an Employee1 object, sets its values, and prints them.

-------------------------------------------------------------------------------
2. IMPORTANT CONCEPT DEFINITIONS USED IN THIS CODE
-------------------------------------------------------------------------------

PRIVATE ACCESS MODIFIER  
- Restricts direct access to the variable from outside the class.  
- Ensures data protection and security.

SETTER METHODS  
- Methods used to assign values to private variables.  
- Provide controlled modification access.  
- Example: `setId(int i)` and `setName(String n)`.

GETTER METHODS  
- Methods used to retrieve values of private variables.  
- Provide controlled read access.  
- Example: `getId()` and `getName()`.

ENCAPSULATION  
- OOP principle that hides data and provides controlled access through methods.  
- Achieved by using private variables + getter/setter methods.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------------------------------
- **private int id; private String name;**  
  Variables hidden from direct access to protect data.

- **setId(int i)** and **setName(String n)**  
  Assign values to `id` and `name`.

- **getId()** and **getName()**  
  Return the values stored in the private variables.

- **main method**  
  Creates an Employee1 object and demonstrates setter/getter usage.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Employee1  
- Blueprint for an employee with encapsulated id and name fields.

VARIABLES  
- `private int id;`  
  Securely stores employee ID.

- `private String name;`  
  Securely stores employee name.

METHODS  
- `void setId(int i)`  
  Assigns employee ID.

- `void setName(String n)`  
  Assigns employee name.

- `int getId()`  
  Returns the stored employee ID.

- `String getName()`  
  Returns the stored employee name.

CLASS _10_Encapsulation  
- Contains the main method that tests the Employee1 class.

MAIN METHOD STEPS  
1. Creates Employee1 object `e1`.  
2. Uses setters to set:  
   - id to 34  
   - name to "Priyanshu"  
3. Prints values using getters.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
-------------------------------------------------------------------------------

1. Program enters `main`.
2. `Employee1 e1 = new Employee1();` creates an object with `id = 0` and `name = null` (default values).
3. `e1.setId(34);` sets the id to 34.
4. `e1.setName("Priyanshu");` sets the name to "Priyanshu".
5. `System.out.println(e1.getId());` retrieves and prints 34.
6. `System.out.println(e1.getName());` retrieves and prints "Priyanshu".
7. Program ends.

-------------------------------------------------------------------------------
6. EXACT OUTPUT PRODUCED
-------------------------------------------------------------------------------
34
Priyanshu

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
