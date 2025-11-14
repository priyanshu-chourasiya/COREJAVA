
import java.util.TreeSet;

public class _5_Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts); // sprted order // inorder
        System.out.println(ts.descendingSet()); // decending order
        // duplicates are not allowed
    }
}
/*
 * treeset : set - BST - Balanced binary search tree also 
 *                     - Sequed tree also
 */
