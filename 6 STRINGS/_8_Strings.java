public class _8_Strings {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Sachin");
        System.out.println(s1.capacity()); // 6 + 16 // if we add from constructor
        StringBuilder s2 = new StringBuilder("Sachin");

        System.out.println(s1.equals(s2)); // 

    }
}
/*
 * When to Use Which? The Golden Rule
Use StringBuilder by default. This covers over 99% of use cases. If your code is manipulating a string
 within a single method or in any context where you are certain only one thread will ever access it, 
 StringBuilder is the correct and more performant choice.

Use StringBuffer only when you specifically need a mutable string to be shared and modified by multiple
 threads. A rare example might be a shared log buffer or a piece of text being constructed by multiple
  concurrent workers. Even then, there are often better, more modern concurrency utilities to handle such scenarios.

In short: Default to StringBuilder. Only switch to StringBuffer if you have a clear and proven need for thread-safety.
 */