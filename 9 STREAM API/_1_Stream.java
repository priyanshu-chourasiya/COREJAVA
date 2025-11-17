import java.util.ArrayList;
import java.util.List;

public class _1_Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(18);
        list.add(72);
        list.add(44);
        System.out.println(list);

        // for(Integer i : list){
        //     System.out.print(i*2 + " ");
        // }
        // System.out.println(); 
        // Consumer<Integer> consumer = new Consumer<>() {

        //     @Override
        //     public void accept(Integer t) {
        //         // TODO Auto-generated method stub
        //         //throw new UnsupportedOperationException("Unimplemented method 'accept'");
        //         System.out.println(t);
        //     }
            
        // };

        // Consumer<Integer> consumer = (Integer t) -> System.out.println(t);

        // list.forEach(consumer);
        
        list.forEach((t) -> System.out.println(t));
    }
}
/* ------------------------------------------------------------
   REVISION NOTES FOR _1_Stream PROGRAM
   ------------------------------------------------------------

1. PROGRAM SUMMARY
------------------
This program demonstrates how to:
- Create and populate a List of Integer values.
- Use the Stream-like forEach() method with a lambda expression
  to iterate through a collection and process each element.


2. IMPORTANT CONCEPTS IN THE CODE
---------------------------------

(1) List Interface (java.util.List)
    - Represents an ordered collection allowing duplicates.
    - Used here to store integers in sequence.

(2) ArrayList Class
    - A resizable array-based implementation of List.
    - Allows dynamic addition of elements.
    - Stores integers added by the user.

(3) forEach() Method
    - A default method in the Iterable interface.
    - Accepts a Consumer functional interface as an argument.
    - Executes the given action for each element in the collection.

(4) Lambda Expression
    - A short syntax to implement functional interfaces.
    - Used to define the action performed inside forEach().
    - Syntax used: `(t) -> System.out.println(t)`.

(5) Consumer<T> Functional Interface
    - Represents an operation that takes one argument and returns no result.
    - Used implicitly inside forEach() when passing a lambda.


3. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
--------------------------------------------------

- `List<Integer> list = new ArrayList<>();`
     Creates a dynamic list to store integer elements.

- `list.add(...)`
     Adds five integer values to the list.

- `System.out.println(list);`
     Prints the entire list in default ArrayList format.

- `list.forEach((t) -> System.out.println(t));`
     Iterates over each integer `t` in the list
     and prints it using a lambda expression.

- Commented blocks (old loops, anonymous class)
     Show alternative ways to iterate over the list,
     but they do not execute.


4. CONTROL FLOW (START → END)
------------------------------

1. Program enters `main()`.
2. Creates an empty ArrayList of Integers.
3. Adds five integer values: 5, 12, 18, 72, 44.
4. Prints the entire list → `[5, 12, 18, 72, 44]`.
5. Executes `forEach()`:
     - Takes each element in order.
     - Passes it to the lambda `(t) -> System.out.println(t)`.
6. Prints each element on a new line.
7. Program terminates.


5. EXACT OUTPUT PRODUCED
------------------------

First line:
[5, 12, 18, 72, 44]

Then each element printed individually in order:
5
12
18
72
44

------------------------------------------------------------ */
