
import java.util.PriorityQueue;

public class _4_Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>(); // min heap
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        //pq.add(450);

        System.out.println(pq); // BST // Min heap
        // duplicates are allowed
    }
}
