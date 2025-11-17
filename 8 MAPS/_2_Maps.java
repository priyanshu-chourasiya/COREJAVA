import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

interface Alpha{
    interface Beta{
        static void display(){
            System.out.println("Static method of inner interface");
        }
    }
}
public class _2_Maps {
    public static void main(String[] args) {
        Alpha.Beta.display();
        System.out.println("------------------------------------------");

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Java");
        hm.put(2,"Python");
        hm.put(3, "C++");
        hm.put(4, "Micro1");
        hm.put(6, "Micro2"); 
        hm.put(5, "Micro3");
        System.out.println(hm.get(3));
        System.out.println(hm.values());
        System.out.println(hm.keySet());

        System.out.println("------------------------------------------");

        Collection<String> values = hm.values();
        Iterator<String> itr = values.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");

        Set<Integer> keys = hm.keySet();
        Iterator<Integer> itr1 = keys.iterator();
        while(itr1.hasNext()){
            System.out.print(itr1.next() + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        
        Set<Map.Entry<Integer,String>> entry = hm.entrySet();
        Iterator<Map.Entry<Integer,String>> itr2 = entry.iterator();
        while (itr2.hasNext()) {
            Map.Entry<Integer,String> pair = itr2.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR _2_Maps PROGRAM
-------------------------------------------------------------

1. PROGRAM PURPOSE
-------------------
The program demonstrates:
• Calling a static method inside a nested interface.  
• How to retrieve and iterate through a HashMap’s:
      - values()
      - keySet()
      - entrySet()
It shows the use of Collections, Iterators, and Map.Entry to access
map data in multiple ways.

2. IMPORTANT CONCEPTS USED
---------------------------

(1) Nested Interface (Alpha.Beta)  
    - An interface declared inside another interface.  
    - Supports static methods which are accessed via the outer interface name.

(2) Static Method in an Interface  
    - Accessible using InterfaceName.MethodName.  
    - Used here to print a message.

(3) HashMap  
    - Stores key-value pairs with no guaranteed ordering.

(4) Collection<V> from values()  
    - Represents all map values in a collection.

(5) Set<K> from keySet()  
    - Represents all keys in a set.

(6) Set<Map.Entry<K,V>> from entrySet()  
    - Contains key–value pairs as Entry objects.  
    - Allows iteration over both keys and values together.

(7) Iterator  
    - Used to iterate through Collection, Set, and entrySet.

3. USAGE OF THESE CONCEPTS IN THIS SPECIFIC CODE
-------------------------------------------------

• Alpha.Beta.display()  
  - Calls a static method inside a nested interface.

• HashMap<Integer,String> hm  
  - Stores mapping of integers to string course names.

• hm.get(3)  
  - Retrieves value associated with key 3 ("C++").

• hm.values()  
  - Returns a Collection<String> of all values:
      [Java, Python, C++, Micro1, Micro2, Micro3]

• hm.keySet()  
  - Returns all keys: [1,2,3,4,6,5]

• values.iterator()  
  - Iterates and prints all values sequentially.

• keys.iterator()  
  - Iterates and prints all keys sequentially.

• hm.entrySet()  
  - Returns key-value pairs which are iterated using Map.Entry.

4. PURPOSE OF VARIABLES, METHODS, STRUCTURES
---------------------------------------------

• interface Alpha  
  - Outer interface containing nested interface Beta.

• interface Beta  
  - Provides static method display().

• display()  
  - Prints the line "Static method of inner interface".

• HashMap hm  
  - Stores integer-to-string course mappings.

• hm.put(...)  
  - Inserts key-value pairs.

• hm.get(3)  
  - Displays value for key 3.

• values (Collection<String>)  
  - Holds all the map values for iteration.

• keys (Set<Integer>)  
  - Holds all map keys for iteration.

• entry (Set<Map.Entry<Integer,String>>)  
  - Holds all key-value pairs.

• itr, itr1, itr2  
  - Iterators used to loop through values, keys, and entries.

• while(itr.hasNext()) / while(itr1.hasNext()) / while(itr2.hasNext())  
  - Loops through each collection type and prints elements.

5. CONTROL-FLOW EXPLANATION
----------------------------

(1) Program starts in main().  
(2) Calls Alpha.Beta.display() → prints static method message.  
(3) Creates HashMap hm and inserts 6 key-value pairs.  
(4) Prints hm.get(3).  
(5) Prints all values and all keys using built-in map methods.  
(6) Iterates over values collection and prints each value.  
(7) Iterates over keys set and prints each key.  
(8) Retrieves entrySet and iterates, printing key and value together.  
(9) Program ends.

6. EXACT PROGRAM OUTPUT BEHAVIOR
---------------------------------

Output format (order of HashMap elements may vary):

Static method of inner interface  
------------------------------------------  
C++  
[Java, Python, C++, Micro1, Micro2, Micro3]  
[1, 2, 3, 4, 6, 5]  
------------------------------------------  
Java Python C++ Micro1 Micro2 Micro3  
------------------------------------------  
1 2 3 4 6 5  
------------------------------------------  
1 Java  
2 Python  
3 C++  
4 Micro1  
6 Micro2  
5 Micro3  

------------------------------------------

----------------------------------------------------------- */
