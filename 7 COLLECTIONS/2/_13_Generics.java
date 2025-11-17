
class Generics<T>{
    private T ref;
    public Generics(T ref){
        this.ref = ref; 
    }
    public void display(){
        System.out.println("Type of t is : " + ref.getClass().getName());
    }
    public T getRef() {
        return ref;
    }
}
public class _13_Generics {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics(44);
        g.display();
        System.out.println(g.getRef());

        Generics<String> g1 = new Generics("Java");
        g1.display();
        System.out.println(g1.getRef());

    }
}
/*
===========================================================
REVISION NOTES FOR PROGRAM: _13_Generics
===========================================================

1. OVERALL PURPOSE OF THE PROGRAM
---------------------------------
This program demonstrates:
- How to define and use a generic class.
- How type parameters allow a class to operate with different data types.
- How to retrieve runtime type information of the object stored in a generic class.
- How generics provide type safety when creating instances with different types
  (Integer and String in this example).


2. IMPORTANT CONCEPTS + THEIR ROLE IN THIS CODE
-----------------------------------------------

(1) Generic Class (Generics<T>)
-------------------------------
A class parameterized with a type variable T.
Usage in this program:
- Enables storing any type (Integer, String, etc.) inside the same class design.
- Ensures compile-time type safety when instantiating objects.

(2) Type Parameter T
--------------------
Represents a placeholder type decided at object creation.
Usage:
- T is used as the type of the field `ref`.
- T is the return type of getRef().
- T ensures that once an object is created (e.g., Generics<Integer>),
  only that specific type is handled inside the instance.

(3) getClass().getName()
-------------------------
A method that returns the runtime class name of an object.
Usage:
- Used inside display() to print the actual type stored in the generic instance.

(4) Runtime Type Identification
------------------------------
The process of finding out an object’s actual type at runtime.
Usage:
- display() method prints the type (e.g., java.lang.Integer, java.lang.String).

(5) Constructor with Generic Parameter
--------------------------------------
The constructor `Generics(T ref)` initializes the internal reference with
a type-safe value at object creation.


3. PURPOSE OF EACH CLASS, VARIABLE, METHOD, AND BLOCK
-----------------------------------------------------

CLASS Generics<T>
-----------------
- Defines a generic container that stores a single object of type T.
- Field:
    ref → Holds the object of type T.
- Constructor:
    Initializes ref with the value passed during object creation.
- Method display():
    Prints the runtime type of ref.
- Method getRef():
    Returns the stored value with type T.

CLASS _13_Generics
------------------
Contains main() and demonstrates how to use the generic class.

Inside main():

1) Generics<Integer> g = new Generics(44);
   - Creates a generic object storing an Integer (44).
   - Uses raw type in constructor call but still binds to Integer.

2) g.display();
   - Prints: "Type of t is : java.lang.Integer"

3) System.out.println(g.getRef());
   - Prints: 44

4) Generics<String> g1 = new Generics("Java");
   - Creates a generic object storing a String ("Java").

5) g1.display();
   - Prints: "Type of t is : java.lang.String"

6) System.out.println(g1.getRef());
   - Prints: Java


4. FULL CONTROL-FLOW EXECUTION PATH
------------------------------------

(1) Program starts at main().
(2) A Generics<Integer> object g is created with value 44.
(3) display() is called → prints its runtime type.
(4) getRef() returns 44 → printed to console.
(5) A Generics<String> object g1 is created with value "Java".
(6) display() is called → prints its runtime type.
(7) getRef() returns "Java" → printed to console.
(8) Program ends.


5. EXACT OUTPUT PRODUCED WHEN EXECUTED
--------------------------------------
Type of t is : java.lang.Integer
44
Type of t is : java.lang.String
Java


===========================================================
END OF REVISION NOTES
===========================================================
*/
