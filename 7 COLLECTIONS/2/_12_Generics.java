
class Employee{
    private Integer id;
    private String name;
    private String city;

    public Employee(String city, Integer id, String name) {
        this.city = city;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
    }

}
 class _12_Generics {
    public static void main(String[] args) {
        // supports type safety
        int arr[] = new int[3];
        arr[0] = 14;
        arr[1] = 24;
        arr[2] = 34;

        int data = arr[0];

        String []str = new String[3];
        str[0] = "abc";
        str[1] = "def";
        str[2] = "java";

        String ans = str[1];

        // no typesafety
        ArrayList al = new ArrayList<>();
        al.add("abc");
        al.add("java");
        al.add("alien");
        al.add(44);

        String s1 = (String) al.get(0);
        s1 = s1.toLowerCase();
        System.out.println(s1);

        String s2 = (String) al.get(1);
        s2 = s2.toLowerCase();
        System.out.println(s2);

        String s3 = (String) al.get(2);
        s3 = s3.toLowerCase();
        System.out.println(s3);

        // String s4 = (String) al.get(3);
        // s4 = s4.toLowerCase();
        // System.out.println(s4);
        // /*
        //  *  abc
        //     java
        //     alien
        //     Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        //             at _12_Generics.main(_12_Generics.java:40)
        //  */
        // typesafety
        System.out.println("-------");
        ArrayList<String> list = new ArrayList<>(); // generics 
        list.add(("java"));
        // list.add(90); error
        list.add("Spring");
        for(String i : list){
            System.out.println(i);
        }

        System.out.println("-------");


        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Bhopal", 1, "Priyanshu"));
        emp.add(new Employee("Bpal", 17, "Priyahu"));
        emp.add(new Employee("Bhoa", 41, "Priu"));

        for(Employee e : emp){
            System.out.println(e);
        }

        // ArrayList<int> ar = new ArrayList<>(); primitve datatype are not allowed as generices
        // ArrayList<Object> ar = new ArrayList<Integer>(); not allowed

        
    }
}
/*
===========================================================
REVISION NOTES FOR PROGRAM: _12_Generics
===========================================================

1. OVERALL PURPOSE OF THE PROGRAM
---------------------------------
This program demonstrates:
- Type safety with arrays and generics.
- Lack of type safety in non-generic collections.
- How ClassCastException occurs when mixing types in a raw ArrayList.
- How generics enforce compile-time type checking.
- How to store and iterate custom objects (Employee) in a generic ArrayList.


2. IMPORTANT CONCEPTS + THEIR ROLE IN THIS CODE
-----------------------------------------------

(1) Generics
------------
A Java feature that enforces type safety on collections and other classes.
Usage in this program:
- `ArrayList<String>` ensures only Strings are added.
- `ArrayList<Employee>` ensures only Employee objects are stored.
- Prevents accidental insertion of incompatible types and avoids runtime ClassCastException.

(2) Raw ArrayList (non-generic)
-------------------------------
An ArrayList without a type parameter.
Usage here:
- `ArrayList al = new ArrayList<>();`
- Allows mixed-type insertion (String + Integer).
- Requires manual casting on retrieval.
- Demonstrates how ClassCastException occurs at runtime.

(3) ClassCastException (runtime exception)
------------------------------------------
Occurs when an object is cast to an incompatible type.
Illustrated here:
- If `al.get(3)` (Integer 44) is cast to String, the exception occurs.
- Code block for this behavior is commented out.

(4) Enhanced for-loop (for-each)
--------------------------------
A loop used to iterate through collections.
Usage:
- Iterates over `ArrayList<String>` and `ArrayList<Employee>`.

(5) toString() method (overridden)
----------------------------------
Customizes object-to-string conversion.
Usage:
- The Employee class overrides toString() to print meaningful details.
- Used when printing Employee objects in the generic list.

(6) Custom class: Employee
--------------------------
Represents an employee record with id, name, and city.
Usage:
- Created and added to the `ArrayList<Employee>` list.
- Printed using the overridden toString().


3. PURPOSE OF EACH CLASS, VARIABLE, METHOD, AND BLOCK
-----------------------------------------------------

CLASS Employee
--------------
- Represents employee data.
- Fields: 
    id   → Employee ID
    name → Employee name
    city → Employee's city
- Constructor initializes all three fields.
- toString(): returns readable string representation.

CLASS _12_Generics
------------------
Contains the main method demonstrating generics and type safety.

Inside main():

1) int arr[]:
   Primitive int array holding three integer values.

2) String[] str:
   String array containing three string elements.

3) ArrayList al:
   Raw ArrayList demonstrating no type safety.
   Stores: "abc", "java", "alien", 44 (Integer).

4) String s1, s2, s3:
   Retrieved String elements from raw list (safe because they are Strings).
   Converted to lowercase using toLowerCase().

5) Commented block (s4):
   Shows how casting Integer to String leads to ClassCastException.

6) ArrayList<String> list:
   Generic String-only ArrayList.
   Adds: "java", "Spring".
   Iterated safely without casting.

7) ArrayList<Employee> emp:
   Generic ArrayList that stores Employee objects.
   Adds three Employee objects.
   Printed using for-each loop, invoking toString().

8) Comments about invalid generics:
   - `ArrayList<int>` not allowed because generics require reference types.
   - `ArrayList<Object> ar = new ArrayList<Integer>()` not allowed due to invariance.


4. FULL CONTROL-FLOW EXECUTION PATH
------------------------------------

(1) Program begins execution at main().
(2) An int array is created and initialized with 14, 24, 34.
(3) A String array is created and initialized with "abc", "def", "java".
(4) A raw ArrayList is created.
(5) Four items are added: three Strings and one Integer.
(6) Elements 0, 1, 2 are retrieved safely as Strings.
(7) Each of these Strings is converted to lowercase and printed.
(8) Potential ClassCastException on element 3 is shown in commented code.
(9) A separator ("-------") is printed.
(10) A generic ArrayList<String> is created.
(11) Two strings ("java", "Spring") are added.
(12) for-each loop prints:
        java
        Spring
(13) Another separator is printed.
(14) A generic ArrayList<Employee> is created.
(15) Three Employee objects are instantiated and added.
(16) for-each loop prints each Employee via toString().
(17) Program ends.


5. EXACT OUTPUT PRODUCED WHEN EXECUTED
--------------------------------------
abc
java
alien
-------
java
Spring
-------
Employee [id=1, name=Priyanshu, city=Bhopal]
Employee [id=17, name=Priyahu, city=Bpal]
Employee [id=41, name=Priu, city=Bhoa]


===========================================================
END OF REVISION NOTES
===========================================================
*/
