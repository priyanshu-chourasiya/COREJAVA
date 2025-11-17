import java.util.ArrayList;
import java.util.Collections;

class Cricketer implements Comparable<Cricketer>{
    int age;
    String name;
    double avg;
    public Cricketer(int age, String name, double avg) {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cricketer{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append(", avg=").append(avg);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Cricketer o){
        if(this.avg > o.avg){
            return 1;
        }
        else{
            return -1;
        }
    }

}
public class _18_Complexsorting {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(12, "Priyanshu", 55.2);
        Cricketer c2 = new Cricketer(13, "Priyan", 27.2);
        Cricketer c3 = new Cricketer(14, "anshu", 8.2);

        ArrayList<Cricketer> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        System.out.println(c);
        Collections.sort(c);
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR _18_Complexsorting PROGRAM
-------------------------------------------------------------

1. PROGRAM PURPOSE
-------------------
The program creates a list of Cricketer objects and sorts them 
based on their batting average (avg).  
Unlike the previous version, sorting is achieved using the 
Comparable interface implemented directly inside the Cricketer class.  
The unsorted list is printed, and then sorting occurs internally 
(using compareTo), though the sorted list is not printed.

2. IMPORTANT CONCEPTS USED
---------------------------

(1) Comparable<T> Interface  
    - Allows objects of a class to define their natural ordering.  
    - Implemented here by Cricketer to allow sorting without a Comparator.

(2) compareTo() Method  
    - Defines how one Cricketer object compares to another.  
    - Used by Collections.sort() to determine order.

(3) Collections.sort(List)  
    - Sorts a list according to the natural ordering defined via Comparable.  
    - Requires Cricketer to implement Comparable<Cricketer>.

(4) ArrayList  
    - A dynamic list storing Cricketer objects and supporting sorting.

(5) toString() Overriding  
    - Provides human-readable output when printing Cricketer objects.

3. USAGE OF THESE CONCEPTS IN THIS SPECIFIC CODE
-------------------------------------------------

• Comparable<Cricketer>  
  - Enables Cricketer objects to be sorted without providing any external comparator.

• compareTo(Cricketer o)
  - Compares the current object (this) to another object (o) by avg.  
  - Returns:
        1  → if this.avg > o.avg  
       -1  → if this.avg ≤ o.avg  
  - Creates ascending ordering based on avg.

• Collections.sort(c)
  - Invokes compareTo on Cricketer objects to sort them.

• ArrayList<Cricketer> c  
  - Stores cricketers before sorting and is modified after sort.

• toString()
  - Ensures objects print in readable "Cricketer{...}" format.

4. PURPOSE OF VARIABLES, METHODS, STRUCTURES
---------------------------------------------

• age, name, avg  
    - Hold information for each Cricketer.

• Cricketer constructor  
    - Initializes all fields for each created object.

• toString()  
    - Generates a string containing the object's field values.

• compareTo()  
    - Defines how Cricketer objects are ordered during sorting.

• c1, c2, c3  
    - Cricketer instances with preset data.

• ArrayList c  
    - Holds the three cricketers for sorting.

• Collections.sort(c)  
    - Sorts the list according to compareTo logic.

• System.out.println(c)  
    - Prints the unsorted list using toString().

5. CONTROL-FLOW EXPLANATION
----------------------------

(1) Program enters main().  
(2) Three Cricketer objects (c1, c2, c3) are created with their respective ages, names, and averages.  
(3) An ArrayList c is created.  
(4) All three Cricketer objects are added to this list.  
(5) The unsorted list is printed:
      → Uses toString() to display each object’s data.  
(6) Collections.sort(c) is called:
      → Internally invokes compareTo() on Cricketer objects.
      → Sorts them in ascending order of avg.  
(7) Program ends (sorted list is not printed).

6. EXACT PROGRAM OUTPUT BEHAVIOR
---------------------------------

• The only output printed is the initial, unsorted list:

    [Cricketer{age=12, name=Priyanshu, avg=55.2}, 
     Cricketer{age=13, name=Priyan, avg=27.2}, 
     Cricketer{age=14, name=anshu, avg=8.2}]

• Sorting happens after this print, but the sorted list is NOT displayed.

----------------------------------------------------------- */
