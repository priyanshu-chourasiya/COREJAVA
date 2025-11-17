public class _7_Strings {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

        System.out.println("STRING BUILDER");
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.capacity());
        sb2.append("Sachin");
        sb2.append("India Tendulkar");
        System.out.println(sb2.capacity()); // (old capacity * 2) + 2
        System.out.println("---------");
        StringBuilder s3 = new StringBuilder();
        s3.append("Sachin");
        System.out.println(s3.capacity());
        s3.trimToSize();
        System.out.println(s3.capacity()); // will remove extra spaces
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _7_Strings
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PROGRAM PURPOSE
-------------------------------------------------------------
The program demonstrates:
- Default capacity of StringBuffer and StringBuilder
- How capacity grows dynamically during append operations
- How trimToSize() reduces capacity to match current content length

It prints the capacity values before and after modifications.

-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (Defined Only if Appearing in Code)
-------------------------------------------------------------

(1) Capacity (StringBuffer / StringBuilder)  
    - The size of the internal character storage buffer.
    - Capacity grows automatically when more space is required.
    - Default capacity (for both) = 16 characters.
    - Capacity expansion formula:
          newCapacity = (oldCapacity * 2) + 2

(2) append()  
    - Adds new characters to the buffer.
    - If existing capacity is insufficient, buffer expands using the formula above.

(3) trimToSize()  
    - Reduces the capacity to match the current actual length of characters.
    - Removes unused internal buffer space.

-------------------------------------------------------------
3. PURPOSE OF VARIABLES, METHODS, STRUCTURES
-------------------------------------------------------------

CLASS: _7_Strings  
- Demonstrates how capacity works in StringBuffer and StringBuilder.

METHOD: main()  
- Creates buffers, checks capacities, appends content, then trims capacity.

VARIABLES:
- sb1: Empty StringBuffer created using default constructor.
       Used to show initial capacity (16).

- sb2: Empty StringBuilder.
       Used to show:
         • default capacity,
         • append operations,
         • capacity expansion after appending long content.

- s3: Another StringBuilder instance.
       Used to demonstrate trimToSize().

PRINT STATEMENTS:
- Display initial capacities.
- Display updated capacity after appending.
- Show capacity before and after trimToSize().

-------------------------------------------------------------
4. FULL CONTROL FLOW
-------------------------------------------------------------

1. Program enters main().

2. sb1 = new StringBuffer().
3. Print sb1.capacity() → prints 16 (default).

4. Print "STRING BUILDER".

5. sb2 = new StringBuilder().
6. Print sb2.capacity() → 16.
7. sb2.append("Sachin").  
   No expansion needed; fits within capacity.
8. sb2.append("India Tendulkar").  
   Total length exceeds 16, so capacity expands using:
       newCapacity = (old * 2) + 2 = (16 * 2) + 2 = 34
   Print sb2.capacity() → prints 34.

9. Print separator.

10. s3 = new StringBuilder() → capacity = 16.
11. s3.append("Sachin") → still within capacity.
12. Print s3.capacity() → 16.
13. s3.trimToSize() → capacity becomes equal to current length (6).
14. Print s3.capacity() → 6.

15. Program ends.

-------------------------------------------------------------
5. EXACT OUTPUT BEHAVIOR
-------------------------------------------------------------

16
STRING BUILDER
16
34
---------
16
6

-------------------------------------------------------------
END OF REVISION NOTES
-----------------------------------------------------------
*/
