/*
------------------------------------------------------------
Difference Between StringBuilder and StringBuffer in Java
------------------------------------------------------------

1. Thread-Safety
   - StringBuffer is thread-safe (methods are synchronized)
   - StringBuilder is NOT thread-safe (no synchronization)

   Example:
*/
StringBuffer sbf = new StringBuffer("Hello");
sbf.append(" World"); // synchronized, safe for multithreading

StringBuilder sbd = new StringBuilder("Hello");
sbd.append(" World"); // not synchronized, faster in single thread

/*
------------------------------------------------------------
2. Performance
   - StringBuilder is faster (no synchronization overhead)
   - StringBuffer is slower (synchronization causes overhead)
*/
long startTime = System.nanoTime();
StringBuilder builder = new StringBuilder("Java");
for (int i = 0; i < 100000; i++) {
    builder.append("Programming");
}
System.out.println("StringBuilder time: " + (System.nanoTime() - startTime));

startTime = System.nanoTime();
StringBuffer buffer = new StringBuffer("Java");
for (int i = 0; i < 100000; i++) {
    buffer.append("Programming");
}
System.out.println("StringBuffer time: " + (System.nanoTime() - startTime));

/*
------------------------------------------------------------
3. Usage Context
   - StringBuffer → use in multi-threaded environments
   - StringBuilder → use in single-threaded environments
*/

/*
------------------------------------------------------------
4. Synchronization Keyword
   - StringBuffer methods → synchronized
   - StringBuilder methods → not synchronized

   Example (source-level difference):
   StringBuffer:
       public synchronized StringBuffer append(String str) { ... }
   StringBuilder:
       public StringBuilder append(String str) { ... } // no synchronized
*/

/*
------------------------------------------------------------
5. Inheritance
   - Both extend AbstractStringBuilder internally.
   - The difference lies only in synchronization.
*/

/*
------------------------------------------------------------
6. Immutability
   - Both are mutable (unlike String).
   - You can modify contents without creating a new object.
*/
StringBuilder sbMutable = new StringBuilder("Hello");
sbMutable.append(" World");
System.out.println(sbMutable); // Output: Hello World

/*
------------------------------------------------------------
7. Compatibility
   - StringBuffer → since JDK 1.0
   - StringBuilder → introduced in JDK 1.5
*/

/*
------------------------------------------------------------
8. Example Comparison
*/
public class _9_Strings {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer buffer = new StringBuffer("Thread");
        buffer.append(" Safe");
        System.out.println("StringBuffer: " + buffer);

        // Using StringBuilder
        StringBuilder builder = new StringBuilder("Not");
        builder.append(" Safe");
        System.out.println("StringBuilder: " + builder);
    }
}
/*
Expected Output:
StringBuffer: Thread Safe
StringBuilder: Not Safe
*/

/*
------------------------------------------------------------
9. When to Choose
------------------------------------------------------------
| Criteria        | StringBuffer    | StringBuilder   |
|-----------------|-----------------|-----------------|
| Thread Safety   | Yes             | No              |
| Performance     | Slower          | Faster          |
| Introduced In   | JDK 1.0         | JDK 1.5         |
| Usage           | Multi-threaded  | Single-threaded |
| Synchronization | Present         | Absent          |
*/

/*
------------------------------------------------------------
10. Memory & Capacity Behavior
   - Both use same expansion logic:
     newCapacity = (oldCapacity * 2) + 2
*/
StringBuilder sbCap = new StringBuilder();
System.out.println(sbCap.capacity()); // default 16
sbCap.append("abcdefghijklmnopqrstu"); // exceeds 16 chars
System.out.println(sbCap.capacity()); // capacity increases to 34

/*
------------------------------------------------------------
Summary:
- Use StringBuffer for thread-safe operations.
- Use StringBuilder for faster, single-threaded operations.
------------------------------------------------------------
*/

/*
====================================================================
REVISION NOTES FOR COMPLETE FILE (ALL SNIPPETS + FINAL PROGRAM)
====================================================================

--------------------------------------------------------------------
1. WHAT THE ENTIRE FILE REPRESENTS
--------------------------------------------------------------------
The file is a comprehensive demonstration and comparison of 
StringBuilder and StringBuffer in Java. It includes:

• Example code showing thread-safety differences.  
• A performance benchmark comparing both classes.  
• Practical usage examples.  
• Code showing synchronization differences.  
• Example of mutability.  
• A runnable class `_9_Strings` demonstrating real usage.  
• Capacity behavior demonstration using expansion logic.  
• A final summary of when to choose each class.

All code snippets collectively explain how both classes behave under 
different conditions.

--------------------------------------------------------------------
2. IMPORTANT CONCEPTS APPEARING IN THE CODE
(Only concepts actually used in the provided code)
--------------------------------------------------------------------

A. StringBuffer  
   - A mutable, synchronized, thread-safe string-handling class.  
   - Appears in examples and in `_9_Strings` to show safe modification 
     across multiple threads.

B. StringBuilder  
   - A mutable, non-synchronized, non-thread-safe class.  
   - Appears in performance tests, examples, capacity demo, and 
     `_9_Strings` to show faster operations in single-threaded scenarios.

C. append()  
   - Adds content to the existing character sequence.  
   - Used repeatedly to show mutability, thread-safety differences, 
     and performance impact.

D. System.nanoTime()  
   - Returns precise time in nanoseconds.  
   - Used to benchmark speed differences between StringBuilder and 
     StringBuffer under identical workloads.

E. for-loops  
   - Used in performance benchmarking by repeatedly appending text 
     100,000 times.

F. System.out.println()  
   - Prints results of performance tests, capacity values, and output 
     from the `_9_Strings` program.

G. capacity()  
   - Returns the internal buffer size of a StringBuilder.  
   - Used to demonstrate growth mechanism when content exceeds 
     current capacity.

H. Capacity expansion formula:  
       newCapacity = (oldCapacity * 2) + 2  
   - Verified in the snippet where exceeding 16 characters expands 
     capacity to 34.

I. Java class structure  
   - The `_9_Strings` class contains the only runnable main method 
     in this file.  
   - All other code snippets are demonstrations or examples.

--------------------------------------------------------------------
3. PURPOSE OF EACH CODE BLOCK, VARIABLE, AND METHOD
--------------------------------------------------------------------

1) Thread-Safety Demonstration Block
   - StringBuffer sbf = new StringBuffer("Hello");  
     Purpose: Create synchronized mutable text.
   - sbf.append(" World");  
     Purpose: Demonstrate thread-safe modification.
   - StringBuilder sbd = new StringBuilder("Hello");  
     Purpose: Create non-thread-safe mutable text.
   - sbd.append(" World");  
     Purpose: Show difference in synchronization.

2) Performance Benchmark Block
   - long startTime = System.nanoTime();  
     Purpose: Record timing for performance comparison.
   - StringBuilder builder = new StringBuilder("Java");  
     Purpose: Builder benchmark object.
   - for-loop appending "Programming" 100000 times  
     Purpose: Heavy workload for timing.
   - Similar block repeated using StringBuffer  
     Purpose: Compare performance with synchronization overhead.
   - Printed results show actual timing difference.

3) Synchronization Keyword Explanation Block
   - Shows method signatures:  
       • synchronized append (StringBuffer)  
       • non-synchronized append (StringBuilder)  
     Purpose: Demonstrate internal API difference.

4) Mutability Demonstration Block
   - StringBuilder sbMutable = new StringBuilder("Hello");  
     Purpose: Example of mutability.  
   - sbMutable.append(" World");  
     Purpose: Modify without creating a new object.  
   - Printed output shows final mutable result.

5) Capacity Expansion Block
   - StringBuilder sbCap = new StringBuilder();  
     Purpose: Show default capacity.
   - sbCap.capacity();  
     Purpose: Output initial buffer size (16).
   - sbCap.append("abcdefghijklmnopqrstu");  
     Purpose: Force capacity expansion by exceeding 16 characters.
   - sbCap.capacity();  
     Purpose: Show new capacity (34).

6) Final Class `_9_Strings`
   - public class _9_Strings { ... }  
     Purpose: Runnable example demonstrating both classes in use.

   Inside main():
   • StringBuffer buffer = new StringBuffer("Thread");  
       Purpose: Create synchronized buffer.
   • buffer.append(" Safe");  
       Purpose: Modify content.
   • Print → "StringBuffer: Thread Safe"  
       Purpose: Show final combined text.

   • StringBuilder builder = new StringBuilder("Not");  
       Purpose: Create non-synchronized builder.
   • builder.append(" Safe");  
       Purpose: Modify content.
   • Print → "StringBuilder: Not Safe"  
       Purpose: Show final combined text.

--------------------------------------------------------------------
4. FULL CONTROL-FLOW OF THE ENTIRE FILE
--------------------------------------------------------------------

Note: Only `_9_Strings` actually executes when run.  
All other code blocks are illustrative, not executed.

Execution steps:

1. Program starts at `_9_Strings.main()`.
2. A StringBuffer with text "Thread" is created.
3. " Safe" is appended, resulting in "Thread Safe".
4. This final text is printed.
5. A StringBuilder with text "Not" is created.
6. " Safe" is appended, resulting in "Not Safe".
7. This final text is printed.
8. Program ends.

All other code snippets above main:
• Do NOT execute  
• Serve as examples to explain concepts  
• Have no effect on runtime output

--------------------------------------------------------------------
5. EXACT OUTPUT PRODUCED WHEN THE PROGRAM RUNS
--------------------------------------------------------------------
StringBuffer: Thread Safe
StringBuilder: Not Safe

(This matches the expected output shown in the file.)

--------------------------------------------------------------------
6. COMPLETE BEHAVIOR SUMMARY
--------------------------------------------------------------------
• Only `_9_Strings` executes.  
• It creates one StringBuffer and one StringBuilder, modifies both 
  using append(), and prints the resulting strings.  
• All other snippets demonstrate thread-safety, performance, 
  synchronization, mutability, and capacity expansion but do not 
  contribute to runtime output.

====================================================================
END OF REVISION NOTES
====================================================================
*/
