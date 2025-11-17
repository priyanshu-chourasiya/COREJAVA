
import java.util.ArrayList;
import java.util.List;



class Human{
    int age;
    
    public void disp(){
        System.out.println("Humans are good");
    }
}
class Students extends Human{

}

class Employee{

}
public class _14_Generics {
    public static void main(String[] args) {
        // Object obj = new Object();
        // String s = new String("Alien");
        // obj = s;
        // s = obj;

        Human h = new Human();

        Students s = new Students();
        h = s;
        // s = h;
        ArrayList<Human> hlist1 = new ArrayList<>();
        ArrayList<Students> slist1 = new ArrayList<>();

        // hlist1 = slist1; not allowed

        ArrayList<?> hlist2 = new ArrayList<>(); // ? unknown type --> wildcard
        ArrayList<Students> slist2 = new ArrayList<>();
        hlist2 = slist2;

        ArrayList<? extends Human> hlist3 = new ArrayList<>(); // upperbound
        ArrayList<Students> slist3 = new ArrayList<>();
        hlist3 = slist3;

        ArrayList<? extends Human> hlist4 = new ArrayList<>(); 
        ArrayList<Students> slist4 = new ArrayList<>();
        ArrayList<Employee> elist4 = new ArrayList<>();
        ArrayList<Object> olist4 = new ArrayList<>();
        // hlist4 = elist4;  compiler time error
        hlist4 = slist4;
        // hlist4 = olist4; compiler time error

        ArrayList<? super Human> hlist5 = new ArrayList<>(); // lowerbound
        ArrayList<Students> slist5 = new ArrayList<>();
        ArrayList<Employee> elist5 = new ArrayList<>();
        ArrayList<Object> olist5 = new ArrayList<>();

        // hlist5 = elist5;
        // hlist5 = slist5;
        hlist5 = olist5;

        ArrayList<Human> hlist = new ArrayList<Human>(); // right side <> is not mandortary
        hlist.add(new Human());
        hlist.add(new Human());
        hlist.add(new Human());
        hlist.add(new Human());
        invockDisplay(hlist);

        System.out.println("--------------------");

        ArrayList<Students> slist = new ArrayList<>();
        slist.add(new Students());
        slist.add(new Students());
        slist.add(new Students());
        slist.add(new Students());
        invockDisplay(slist);

        System.out.println("--------------------");



    }  
    
    public static void invockDisplay(List< ? extends Human> list){ // expecting colletion of human or child of human
        for(Human h : list){
            System.out.println(h);
        }
    }
}
/*
===========================================================
REVISION NOTES FOR PROGRAM: _14_Generics
===========================================================

1. OVERALL PURPOSE OF THE PROGRAM
---------------------------------
This program demonstrates:
- Generic type invariance in Java (why ArrayList<Human> ≠ ArrayList<Students>).
- Unbounded wildcards (<?>).
- Upper-bounded wildcards (? extends).
- Lower-bounded wildcards (? super).
- Polymorphism with classes Human and Students.
- How wildcard bounds affect assignment compatibility and method parameters.
- How upper-bounded wildcards allow reading items from collections in a type-safe manner.


2. IMPORTANT CONCEPTS + THEIR ROLE IN THIS CODE
-----------------------------------------------

(1) Generic Invariance
----------------------
Java generics are invariant:
- Meaning ArrayList<Human> is NOT a parent of ArrayList<Students>.
Usage:
- `hlist1 = slist1;` is not allowed.
- Demonstrates that generics do not follow normal class inheritance rules.

(2) Unbounded Wildcard (<?>)
----------------------------
Represents a list of an unknown type.
Usage:
- `ArrayList<?> hlist2`
- Allows assigning any ArrayList<T> to hlist2.
- Prevents adding elements (except null) because actual type is unknown.

(3) Upper-Bounded Wildcard (? extends Human)
---------------------------------------------
Represents a list whose type is Human or any subclass of Human.
Usage:
- `hlist3 = slist3;` is valid because Students extends Human.
- Reading is allowed (objects are treated as Human).
- Adding elements is disallowed (other than null) because the exact subtype is unknown.

(4) Lower-Bounded Wildcard (? super Human)
------------------------------------------
Represents a list of Human or any of its supertypes.
Usage:
- `hlist5 = olist5;` allowed because Object is a supertype of Human.
- Allows adding Human and its subtypes to the list.
- Reading returns Object (not Human), due to type erasure/unknown actual type.

(5) Polymorphism
----------------
Human h = new Students();
Usage:
- Demonstrates normal inheritance-based upcasting (valid).
- Reverse assignment (s = h) is not allowed.

(6) Method with Wildcard Parameter
----------------------------------
Method: invockDisplay(List<? extends Human> list)
Usage:
- Accepts lists of Human or subclasses like Students.
- Allows iterating and reading elements safely as Human.

(7) for-each Loop
-----------------
Used in invockDisplay() to iterate over any Human or Student objects.


3. PURPOSE OF EACH CLASS, FIELD, METHOD, BLOCK, AND VARIABLE
------------------------------------------------------------

CLASS Human
-----------
- Field: age (not used).
- Method disp(): prints “Humans are good”.

CLASS Students
---------------
- Subclass of Human.
- Inherits age and disp().

CLASS Employee
--------------
- Separate type not related to Human.
- Demonstrates type restriction in wildcards.

MAIN CLASS _14_Generics
-----------------------

Inside main():

1) Human h, Students s:
   - Demonstrate object-level polymorphism.
   - h = s is valid; s = h is invalid.

2) ArrayList<Human> hlist1, ArrayList<Students> slist1:
   - Shown to be incompatible (generic invariance).

3) ArrayList<?> hlist2:
   - Accepts slist2 because ? allows any type.

4) ArrayList<? extends Human> hlist3:
   - Accepts slist3 (Students extends Human).

5) hlist4 interactions:
   - slist4 works (Students is a subclass).
   - elist4 and olist4 do NOT work (Employee and Object not subclasses of Human).

6) ArrayList<? super Human> hlist5:
   - olist5 works (Object is a supertype).
   - slist5 and elist5 do NOT work (they aren’t supertypes of Human).

7) ArrayList<Human> hlist:
   - Filled with Human objects.
   - Passed to invockDisplay().

8) ArrayList<Students> slist:
   - Filled with Students objects.
   - Also passed to invockDisplay() because ? extends Human allows it.

METHOD invockDisplay(List<? extends Human> list)
-------------------------------------------------
- Accepts Human or any subclass.
- Reads elements as Human.
- Prints each object’s toString() value (default Object.toString()).

FINAL PRINTING:
- Prints memory addresses of Human objects in first call.
- Prints memory addresses of Students objects in second call.


4. FULL CONTROL-FLOW DESCRIPTION
---------------------------------

(1) Program begins in main().
(2) Human and Students objects are created.
(3) h = s executes successfully (upcasting).
(4) Various ArrayList declarations illustrate what assignments are valid or invalid.
(5) hlist and slist are created and filled with multiple objects.
(6) invockDisplay(hlist) prints four Human objects.
(7) Separator line printed.
(8) invockDisplay(slist) prints four Students objects.
(9) Program finishes after second separator line.


5. EXACT OUTPUT PRODUCED WHEN EXECUTED
--------------------------------------
(Default Object.toString() output will vary; shown generically.)

Human@<hash1>
Human@<hash2>
Human@<hash3>
Human@<hash4>
--------------------
Students@<hash5>
Students@<hash6>
Students@<hash7>
Students@<hash8>
--------------------


===========================================================
END OF REVISION NOTES
===========================================================
*/
