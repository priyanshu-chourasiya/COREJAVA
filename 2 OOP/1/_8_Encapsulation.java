class Book{
    int pageNum;
    void display(){
        System.out.println("Java and inheritance is present at PageNum : " + pageNum);
    }
}
public class _8_Encapsulation {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        b1.pageNum = -5; // no security
        System.out.println(b1.pageNum);
        b1.display();
    }
}
/*
===============================================================================
REVISION NOTES FOR _8_Encapsulation (Encapsulation Violation Example)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program shows what happens **when encapsulation is NOT used**.
- The `Book` class exposes its instance variable `pageNum` directly.
- Because it is public by default (no private modifier), anyone can modify it,
  even putting invalid values like `-5`.
- This demonstrates the **problem of no security / no data protection**.

-------------------------------------------------------------------------------
2. DEFINITIONS OF ALL CONCEPTS USED
-------------------------------------------------------------------------------

CLASS  
- Blueprint for creating objects.  
- Here: `Book` class defines a book with a page number.

OBJECT  
- Instance of a class, created using `new`.  
- Here: `Book b1 = new Book();`

INSTANCE VARIABLE  
- Variable declared inside a class but outside any method.  
- Stored in the heap inside the object.  
- Here: `int pageNum;`

ENCAPSULATION  
- OOP principle of wrapping data + methods together and restricting direct access.  
- Achieved by:  
  → Making variables `private`  
  → Using getters & setters  
- This code shows **lack of encapsulation**.

METHOD  
- Block of code performing a task.  
- Here:  
  → `display()` prints the page number.

DEFAULT VALUES  
- For int: default is **0**  
- Since `pageNum` isn’t initialized, its first value printed is 0.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------------------------------
- **Class Book:** Defines one field and one method.
- **Instance variable pageNum:** Demonstrates how direct access allows invalid data.
- **display() method:** Uses string concatenation to show the current page number.
- **Main method:** Creates a Book object, prints default value, then assigns `-5`.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Book  
- Holds book-related data.

VARIABLE  
- `int pageNum;`  
  Stores page number (but currently unprotected).

METHOD  
- `void display()`  
  Prints:  
  `"Java and inheritance is present at PageNum : <value>"`

CLASS _8_Encapsulation  
- Contains main method.

MAIN METHOD STEPS  
1. Creates object: `Book b1 = new Book()`
2. Calls `b1.display()` → prints default page number (0)
3. Assigns: `b1.pageNum = -5` (invalid, but allowed)
4. Prints: `System.out.println(b1.pageNum)` → prints -5
5. Calls `b1.display()` again → prints updated (invalid) page number

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
-------------------------------------------------------------------------------

1. Program starts in `main`.
2. Object `b1` is created; `pageNum` defaults to 0.
3. `b1.display()` is executed → prints pageNum = 0.
4. The program assigns `b1.pageNum = -5`.
5. Prints -5 directly.
6. Calls `display()` again → prints pageNum = -5.
7. Program ends.

-------------------------------------------------------------------------------
6. EXACT OUTPUT  
-------------------------------------------------------------------------------
Java and inheritance is present at PageNum : 0
-5
Java and inheritance is present at PageNum : -5

-------------------------------------------------------------------------------
NOTE (Concept Understanding)
-------------------------------------------------------------------------------
This example clearly demonstrates:
❌ No encapsulation  
❌ No validation  
❌ No data protection  
→ Anyone can assign any value (even illogical ones)

To make it truly encapsulated, we must use **private variables + getters/setters**.

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
