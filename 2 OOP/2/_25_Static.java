class Student{
    int id;
    String name;
    String city;
    int count;
    Student() {
        System.out.println("Zero para constructor");
        count++;
    }

    Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        count++;
    }
}
public class _25_Static {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Priyanshu","Bhopal");
        System.out.println(s1.count);
        Student s2 = new Student(2,"Priya","Banglore");
        System.out.println(s2.count);
        Student s3 = new Student(3,"Pyanshu","Bho");
        System.out.println(s3.count);
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _25_Static (Student)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates why an object-level variable cannot be used to count
how many objects have been created.  
It shows that each object has its own separate copy of instance variables,
so the count never accumulates.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INSTANCE VARIABLES  
- Variables declared inside the class but outside methods.  
- Each object gets its own independent copy.

CONSTRUCTORS  
- Special methods used to initialize objects.  
- Run automatically when an object is created.

WHY COUNT FAILS IN THIS CODE  
- `count` is an instance variable (non-static).  
- Every time a new Student object is created, that object starts with `count = 0`.  
- Constructor increments *that object's own count*, not a shared count.


3. USAGE OF CONCEPTS IN THIS PROGRAM
------------------------------------

INSTANCE VARIABLES  
- `id`, `name`, `city` store student data.  
- `count` is meant to track number of objects, but incorrectly implemented as instance-level.

CONSTRUCTORS  
- Zero-parameter constructor: prints a message and increments *this object's* count.  
- Parameterized constructor: initializes object data and increments *this object's* count.

MAIN METHOD  
- Creates three Student objects: `s1`, `s2`, `s3`.  
- Prints count for each object separately.


4. PURPOSE OF EVERY VARIABLE AND METHOD
---------------------------------------

`id`  
- Stores student's ID.

`name`  
- Stores student's name.

`city`  
- Stores student's city.

`count`  
- Attempts to track number of Student objects created,  
  BUT as an instance variable, it does **not** work for this purpose.

Constructors  
- Initialize student objects and increment the instance count.

Main method  
- Creates objects and prints their individual object count.


5. CORRECT AND INCORRECT BEHAVIOR OF count
-------------------------------------------

INCORRECT IMPLEMENTATION (current code)  
- Each object has its own `count` variable.  
- Therefore:
  - `s1.count` = 1  
  - `s2.count` = 1  
  - `s3.count` = 1  
- You get 1 every time because each object increments only its own copy of `count`.

CORRECT WAY  
- Use: `static int count;`  
- Then all objects share one single count value.  
- And each constructor increments the shared count.

(But you did not implement it that way in this program — this is just the reasoning.)


6. EXACT OUTPUT WHEN PROGRAM RUNS (WITH CURRENT CODE)
-----------------------------------------------------

1  
1  
1  

Because each object has its own count variable starting from 0.


------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
