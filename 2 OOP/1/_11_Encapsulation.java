class Learner{
    private int id;
    private String name;
    private String city;

    void setId(int id){  // shadowing problem : conflict within a setter between instance variable and local variable 
        id = id;        // compiler will confused and wont assign anything
    }
    void setName(String name){
        name = name;
    }
    void setCity(String city){ 
        city = city;
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
public class _11_Encapsulation {
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
REVISION NOTES FOR _11_Encapsulation (Shadowing Problem)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **encapsulation with incorrect setter implementation**.
- The `Learner` class has private fields: id, name, and city.
- The setter methods incorrectly assign values because of **variable shadowing**.
- As a result, the private variables never get updated.
- The main method attempts to set values, but the output shows default values instead.

-------------------------------------------------------------------------------
2. IMPORTANT CONCEPT DEFINITIONS USED IN THIS CODE
-------------------------------------------------------------------------------

ENCAPSULATION  
- Protecting data by keeping variables private and accessing them through setters/getters.

VARIABLE SHADOWING  
- Occurs when a local variable (method parameter) has the same name as an instance variable.  
- The local variable *shadows* the instance variable inside the method.  
- Without using `this`, the assignment `id = id` assigns the local variable to itself, not the instance variable.

DEFAULT VALUES (FOR UNINITIALIZED INSTANCE VARIABLES)  
- `int` defaults to `0`  
- `String` defaults to `null`

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------------------------------
- **private variables** (`id`, `name`, `city`)  
  Used to protect data.

- **faulty setter methods**  
  - `id = id;` assigns the parameter to itself (no effect on instance variable).  
  - Same issue for `name` and `city`.

- **getter methods**  
  Return the private variables, which remain at default values.

- **main method**  
  Calls the incorrect setters, demonstrating the effect of shadowing.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Learner  
- Represents a learner with id, name, and city, but setter logic is faulty.

VARIABLES  
- `private int id;` stores learner ID (remains 0 due to shadowing).  
- `private String name;` stores learner name (remains null).  
- `private String city;` stores learner city (remains null).

SETTER METHODS  
- `setId(int id)`  
  Intended to assign value to `this.id`, but due to shadowing, assigns `id` to itself.

- `setName(String name)`  
  Same problem—does not update instance variable.

- `setCity(String city)`  
  Same shadowing issue.

GETTER METHODS  
- Return the instance variables (which remain default values).

CLASS _11_Encapsulation  
- Tests the Learner class and shows the impact of incorrect setters.

MAIN METHOD STEPS  
1. Creates `Learner l1`.  
2. Calls setters with valid values:  
   - `setId(1)`  
   - `setCity("Bhopal")`  
   - `setName("Priyanshu")`  
   But *none update the actual instance variables*.
3. Prints the retrieved values using getters.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
-------------------------------------------------------------------------------

1. Program enters `main`.  
2. `Learner l1 = new Learner();` creates an object:  
   - id = 0  
   - name = null  
   - city = null  
3. `l1.setId(1)` runs:  
   - local id shadows instance id  
   - assignment `id = id` assigns parameter to itself  
   - instance id remains 0  
4. `l1.setCity("Bhopal")` runs:  
   - same shadowing → instance city stays null  
5. `l1.setName("Priyanshu")` runs:  
   - same shadowing → name remains null  
6. Getter methods retrieve values:  
   - id prints 0  
   - city prints null  
   - name prints null  
7. Program ends.

-------------------------------------------------------------------------------
6. EXACT OUTPUT PRODUCED
-------------------------------------------------------------------------------
0
null
null

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
