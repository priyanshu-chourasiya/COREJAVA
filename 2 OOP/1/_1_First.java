//package 2 OOP;

class Student{
    String name;
    int age;
    int id;

    void studying(){
        System.out.println("STUDYING");
    }

    void playing(){
        System.out.println("PLAYING");
    }

}

public class _1_First {
        public static void main(String[] args) {
            Student s1 = new Student(); // instaniation of a class
            s1.studying();
            s1.playing();

        }  
}
/*  
========================================================
REVISION NOTES FOR _1_First (OOP - Student Class)
========================================================

--------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------------------------------
This program defines a `Student` class with attributes and behaviors,  
creates an object of that class, and calls two of its methods to print actions  
("STUDYING" and "PLAYING").

--------------------------------------------------------
2. IMPORTANT CONCEPT DEFINITIONS (USED IN THIS CODE)
--------------------------------------------------------
**Class**  
A user-defined blueprint containing variables (attributes) and methods (behaviors).  
Used here to define what a `Student` is and what actions it can perform.

**Object / Instantiation**  
Creating a real instance of a class using `new`.  
Used here to create `s1` from `Student`.

**Instance Variables**  
Variables defined inside a class but outside methods; unique for each object.  
Used for storing each student's name, age, and id.

**Instance Methods**  
Methods that operate on an object of the class.  
Used here to print actions like studying or playing.

--------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
--------------------------------------------------------
- The `Student` class groups the student’s data and behaviors.
- The instance variables (`name`, `age`, `id`) represent characteristics of each student.
- The instance methods (`studying()`, `playing()`) define actions that a student object can perform.
- `new Student()` creates one student object.
- `s1.studying()` and `s1.playing()` call the object’s behaviors.

--------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, STRUCTURE
--------------------------------------------------------
**Class Student**  
Blueprint describing what data and actions a student has.

**Variables inside Student**  
- `String name;` → stores the student's name.  
- `int age;` → stores the student's age.  
- `int id;` → stores the student's unique identifier.  

**Methods inside Student**  
- `void studying()` → prints `"STUDYING"` to represent the student's action.  
- `void playing()` → prints `"PLAYING"` to represent another action.

**Class _1_First**  
Contains the `main` method where execution starts.

**main(String[] args)**  
Runs the object creation and method calls.

**Student s1 = new Student();**  
Creates (instantiates) a new Student object.

**s1.studying();**  
Calls the `studying` method of object `s1`.

**s1.playing();**  
Calls the `playing` method of object `s1`.

--------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
--------------------------------------------------------
1) Program starts in `main`.  
2) A new `Student` object (`s1`) is created.  
3) The `studying()` method is called, printing `"STUDYING"`.  
4) The `playing()` method is called, printing `"PLAYING"`.  
5) Program ends.

--------------------------------------------------------
6. EXACT BEHAVIOR AND OUTPUT
--------------------------------------------------------
When executed, the program prints:

STUDYING  
PLAYING  

========================================================
END OF REVISION NOTES
========================================================
*/
