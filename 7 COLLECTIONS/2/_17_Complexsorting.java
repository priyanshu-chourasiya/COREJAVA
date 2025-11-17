
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
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

}
// implements
// anonymous inner class
// lambda

class Alpha implements Comparator<Cricketer>{

    @Override
    public int compare(Cricketer o1,Cricketer o2){
        if(o1.avg > o2.avg){
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class _17_Complexsorting {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(12, "Priyanshu", 55.2);
        Cricketer c2 = new Cricketer(13, "Priyan", 27.2);
        Cricketer c3 = new Cricketer(14, "anshu", 8.2);

        ArrayList<Cricketer> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        System.out.println(c);
        // Collections.sort(c); error 
        System.out.println("After sorting : ----------------------");
        Alpha a = new Alpha();
        Collections.sort(c,a);
        System.out.println(c);

        

    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR _17_Complexsorting PROGRAM
-------------------------------------------------------------

1. PROGRAM PURPOSE
-------------------
The program creates a list of Cricketer objects and sorts them 
based on their batting average (avg) using a custom Comparator.  
It prints the list before sorting and after sorting.

2. IMPORTANT CONCEPTS USED
---------------------------

(1) Class with Custom Fields
    - A class (Cricketer) defines attributes age, name, and avg.
    - Used to create objects that represent cricketers.

(2) toString() Overriding
    - Overrides Object.toString() to give a readable representation 
      of Cricketer objects when printed.
    - Used by System.out.println(c) to display objects in the list.

(3) Comparator Interface
    - Used to define custom sorting logic for objects.
    - Here, Alpha implements Comparator<Cricketer> and defines how 
      two Cricketer objects are compared based on avg.

(4) Collections.sort(List, Comparator)
    - Sorts a list using a given Comparator.
    - Required here because Cricketer does NOT implement Comparable.

(5) ArrayList
    - A dynamic collection used to store Cricketer objects.
    - Supports add(), printing, and sorting.

3. USAGE OF CONCEPTS IN THIS SPECIFIC CODE
-------------------------------------------

• Cricketer class  
  - Stores data for each cricketer.  
  - Used to instantiate c1, c2, c3.

• toString()  
  - Ensures that printing the ArrayList shows the values of age, 
    name, and avg instead of memory addresses.

• Alpha (Comparator<Cricketer>)  
  - Provides the rule: higher avg → considered "greater".  
  - compare() returns:
        1  → if o1.avg > o2.avg  
       -1  → otherwise (o1.avg ≤ o2.avg)

• Collections.sort(c, a)
  - Uses Alpha’s compare() logic to reorder the list.

• ArrayList<Cricketer> c
  - Stores the 3 Cricketer objects.  
  - Passed to Collections.sort() for sorting.

4. PURPOSE OF EACH VARIABLE, METHOD, STRUCTURE
-----------------------------------------------

• Cricketer fields:
    age  → stores player's age  
    name → stores player's name  
    avg  → stores batting average

• Cricketer constructor  
    - Initializes age, name, and avg for each cricketer object.

• toString() method  
    - Converts each Cricketer object into a readable string format.

• Alpha class  
    - A comparator that defines custom comparison for sorting Cricketer objects.

• compare(o1, o2)  
    - Compares cricketers based on avg.

• c1, c2, c3  
    - Individual Cricketer objects containing sample values.

• ArrayList<Cricketer> c  
    - Holds all cricketer objects for sorting and printing.

• a (Alpha object)  
    - The comparator instance used for sorting.

• System.out.println()  
    - Prints the list before and after sorting.

5. CONTROL-FLOW EXPLANATION
----------------------------

(1) Program starts in main().
(2) Three Cricketer objects (c1, c2, c3) are created with different ages, names, and averages.
(3) An ArrayList c is created.
(4) The three Cricketer objects are added to the ArrayList.
(5) The list is printed:
      → invokes toString() for each object.
(6) "After sorting" message is printed.
(7) An Alpha comparator object is created.
(8) Collections.sort(c, a) is called:
      → Alpha.compare() runs multiple times internally
        to determine correct ordering based on avg.
(9) The sorted list is printed.

6. EXACT PROGRAM OUTPUT BEHAVIOR
---------------------------------

• First print: list in insertion order:
    [Cricketer{age=12, name=Priyanshu, avg=55.2}, 
     Cricketer{age=13, name=Priyan, avg=27.2}, 
     Cricketer{age=14, name=anshu, avg=8.2}]

• After sorting:
    The list is sorted in ascending order of avg, due to compare() logic.

    Final order:
       Cricketer with avg 8.2
       Cricketer with avg 27.2
       Cricketer with avg 55.2

So printed output will be:

    After sorting : ----------------------
    [Cricketer{age=14, name=anshu, avg=8.2}, 
     Cricketer{age=13, name=Priyan, avg=27.2}, 
     Cricketer{age=12, name=Priyanshu, avg=55.2}]

----------------------------------------------------------- */
