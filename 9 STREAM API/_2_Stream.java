
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class _2_Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(52);
        list.add(12);
        list.add(18);
        list.add(72);
        list.add(44);
        System.out.println(list);
        // have to work on list without affecting exesting list
        // Collections.sort(list);
        // System.out.println(list);
        Stream<Integer> sd1 = list.stream();
        // System.out.println(sd1.sorted());
        Stream<Integer> sd2 = sd1.sorted(); 
        // System.out.println(sd2);
        sd2.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println(list);
    }
}
// once stream is consumed you cannot reuse the stream
/* ------------------------------------------------------------
   REVISION NOTES FOR _2_Stream PROGRAM
   ------------------------------------------------------------

1. PROGRAM SUMMARY
------------------
This program demonstrates:
- Creating and populating a List of integers.
- Creating a Stream from the list.
- Sorting the stream without modifying the original list.
- Printing the sorted stream elements.
- Showing that the original list remains unchanged.
- Highlighting the rule that a Stream cannot be reused once consumed.


2. IMPORTANT CONCEPTS IN THE CODE
---------------------------------

(1) Stream<T> (java.util.stream.Stream)
    - A sequence of elements supporting functional-style operations.
    - Used to process data without modifying the source collection.
    - Once a terminal operation (like forEach) is performed,
      the stream becomes consumed and cannot be reused.

(2) stream() Method (from java.util.List)
    - Converts a List into a Stream.
    - Enables functional operations such as sorted(), filter(), map(), etc.

(3) sorted() Method
    - An intermediate Stream operation.
    - Produces a new Stream where elements are in natural ascending order.
    - Does NOT mutate the original list.

(4) forEach() Terminal Operation
    - Consumes the stream.
    - Executes the given lambda expression on each element.

(5) Lambda Expression
    - `(n -> System.out.print(n + " "))`
    - Defines the action applied to each stream element during forEach().
    - Prints each integer followed by a space.


3. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
--------------------------------------------------

- `List<Integer> list = new ArrayList<>();`
     Creates a dynamic list to hold integer values.

- `list.add(...)`
     Adds five integers to the list.

- `System.out.println(list);`
     Prints the original (unsorted) list.

- `Stream<Integer> sd1 = list.stream();`
     Creates a new Stream from the list.

- `Stream<Integer> sd2 = sd1.sorted();`
     Creates a sorted Stream from the original stream.
     (Does NOT modify the list, only creates a sorted view.)

- `sd2.forEach(n -> System.out.print(n + " "));`
     Consumes the sorted stream and prints each element.

- `System.out.println(list);`
     Prints the list again to show that it remains unchanged.

- Final comment:
     “once stream is consumed you cannot reuse the stream”
     clarifies that after forEach(), sd2 is no longer usable.


4. CONTROL FLOW (START → END)
------------------------------

1. Program begins execution in `main()`.
2. Creates an ArrayList and adds values: 52, 12, 18, 72, 44.
3. Prints the list → `[52, 12, 18, 72, 44]`.
4. Converts the list to Stream sd1.
5. Creates a sorted Stream sd2 from sd1.
6. Performs forEach on sd2 → prints sorted order:
       `12 18 44 52 72`
7. Prints a newline.
8. Prints the list again → `[52, 12, 18, 72, 44]`
   confirming the list is unchanged.
9. Program ends.


5. EXACT OUTPUT PRODUCED
------------------------

[52, 12, 18, 72, 44]
12 18 44 52 72 
[52, 12, 18, 72, 44]

------------------------------------------------------------ */
