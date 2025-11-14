
import java.util.ArrayList;


public class _1_Arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add("ABC");
        al.add(4.5);
        System.out.println(al);

        ArrayList al2 = new ArrayList<>();
        al2.add(10);
        al2.add(20);
        al2.add(0,33);
        al2.addAll(al);
        System.out.println(al2); // duplicates are allowed in Arraylist
        System.out.println(al2.containsAll(al));
        
    }
}
/*
 * arraylist - list - dynamic DS  
 * linkedlist
 * arraydeque
 * priority queue
 * treeset
 * hashset
 * linkedset
 */
