class Student{
    int id;
    String name;
    String city;
    static int count;
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
public class _26_Static {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Priyanshu","Bhopal");
        System.out.println(Student.count);
        Student s2 = new Student(2,"Priya","Banglore");
        System.out.println(Student.count);
        Student s3 = new Student(3,"Pyanshu","Bho");
        System.out.println(Student.count);
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _26_Static (Student)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates how a `static` variable can be used to count
the number of objects created from a class.  
Unlike instance variables, a static variable is shared among all objects
of the class. Each constructor increments this shared count to track total
objects created.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

STATIC VARIABLE  
- `count` is declared as static → shared by all instances of Student.  
- Maintains a cumulative count of objects created.

CONSTRUCTORS  
- Initialize Student objects and increment the static count.

STATIC ACCESS VIA CLASS NAME  
- `System.out.println(Student.count);` accesses the static variable
  without using an object reference.


3. USAGE OF CONCEPTS IN THIS PROGRAM
------------------------------------

STATIC VARIABLE `count`  
- Tracks total number of Student objects created.  
- Incremented in both constructors.

INSTANCE VARIABLES `id, name, city`  
- Hold object-specific data for each student.

CONSTRUCTORS  
- Zero-parameter constructor: prints message and increments count.  
- Parameterized constructor: initializes instance data and increments count.

MAIN METHOD  
- Creates three Student objects (`s1`, `s2`, `s3`).  
- Prints the cumulative count after each object creation.


4. PURPOSE OF EVERY VARIABLE AND METHOD
---------------------------------------

`id`  
- Student ID (unique for each object).

`name`  
- Student name (object-specific).

`city`  
- Student city (object-specific).

`static int count`  
- Shared across all Student objects.  
- Increments each time a Student object is instantiated.

Constructors  
- Initialize objects and increment static count.

MAIN METHOD  
- Creates Student objects and prints cumulative count after each creation.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Student s1 = new Student(1,"Priyanshu","Bhopal");`  
   - Parameterized constructor executes.  
   - Initializes `id=1`, `name="Priyanshu"`, `city="Bhopal"`.  
   - Increments `Student.count` → count = 1.  
   - Prints `Student.count` → 1

③ `Student s2 = new Student(2,"Priya","Banglore");`  
   - Parameterized constructor executes.  
   - Initializes `id=2`, `name="Priya"`, `city="Banglore"`.  
   - Increments `Student.count` → count = 2.  
   - Prints `Student.count` → 2

④ `Student s3 = new Student(3,"Pyanshu","Bho");`  
   - Parameterized constructor executes.  
   - Initializes `id=3`, `name="Pyanshu"`, `city="Bho"`.  
   - Increments `Student.count` → count = 3.  
   - Prints `Student.count` → 3

⑤ Program ends.


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
3 lines printed with cumulative count:

1  
2  
3


------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
