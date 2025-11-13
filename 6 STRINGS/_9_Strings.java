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
