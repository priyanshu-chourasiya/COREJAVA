class Book{
    private int pageNum;

    // setter
    void setPageNum(int pgNo){
        if(pgNo >= 0){
            pageNum = pgNo;
        }
        else{
            System.out.println("Page number cannot be less than 0! ");
        }
    }
    void display(){
        System.out.println("Java and inheritance is present at PageNum : " + pageNum);
    }
    // getter
    int getPageNum(){
        return pageNum;
    }

}
public class _9_Encapuslation {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        b1.setPageNum(-1);
        b1.display();
        System.out.println(b1.getPageNum());
    }
}
/*
===============================================================================
REVISION NOTES FOR _9_Encapsulation (Proper Encapsulation Example)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **proper encapsulation** in Java.
- The `Book` class hides its `pageNum` variable using `private`.
- Access to the variable is controlled using **setter** and **getter** methods.
- Invalid inputs (like negative page numbers) are rejected with a message.
- The program shows how secure data handling works in encapsulation.

-------------------------------------------------------------------------------
2. IMPORTANT CONCEPT DEFINITIONS USED IN THIS CODE
-------------------------------------------------------------------------------

PRIVATE ACCESS MODIFIER  
- Restricts access to a variable/method so it cannot be accessed directly from outside the class.  
- Used here to protect `pageNum`.

SETTER METHOD  
- A method that **assigns a value** to a private variable.  
- Usually includes validation logic.  
- Example: `setPageNum(int pgNo)` checks if the page number is valid.

GETTER METHOD  
- A method that **returns the value** of a private variable.  
- Example: `getPageNum()` returns the current page number.

ENCAPSULATION  
- OOP concept of protecting data by restricting direct access.  
- Achieved using private fields + getters/setters.

VALIDATION  
- Logic inside the setter that verifies input before assigning it.  
- Here: negative values are rejected.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------------------------------
- **private int pageNum**: Encapsulated data, hidden from outside.
- **setPageNum**: Controls how pageNum is modified, prevents invalid numbers.
- **getPageNum**: Provides controlled read access.
- **display()**: Shows the current page number to the user.
- **main()**: Demonstrates proper access through setters and getters.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS Book  
- Represents a book with an encapsulated page number.

VARIABLE  
- `private int pageNum;`  
  Stores the page number securely.

METHODS  
- `void setPageNum(int pgNo)`  
  Validates input and sets `pageNum`.  
  Rejects negative values with a message.

- `void display()`  
  Prints: "Java and inheritance is present at PageNum : <value>"

- `int getPageNum()`  
  Returns the current value of `pageNum`.

CLASS _9_Encapsulation  
- Contains the main method that tests the encapsulation mechanism.

MAIN METHOD STEPS  
1. Creates Book object `b1`.  
2. Calls `display()` → prints default 0.  
3. Attempts to set page number to -1 → validation fails → prints warning.  
4. Calls `display()` → still prints 0.  
5. Prints the result of `getPageNum()` → outputs 0.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
-------------------------------------------------------------------------------

1. Program enters `main`.
2. Object `b1` is created → `pageNum` defaults to 0.
3. `b1.display()` executes → prints pageNum = 0.
4. `b1.setPageNum(-1)` is called:  
     - Condition fails (`pgNo >= 0` is false)  
     - Prints: "Page number cannot be less than 0!"
     - `pageNum` remains unchanged.
5. `b1.display()` executes again → prints pageNum = 0.
6. `System.out.println(b1.getPageNum())` prints 0.
7. Program ends.

-------------------------------------------------------------------------------
6. EXACT OUTPUT PRODUCED
-------------------------------------------------------------------------------
Java and inheritance is present at PageNum : 0
Page number cannot be less than 0! 
Java and inheritance is present at PageNum : 0
0

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
