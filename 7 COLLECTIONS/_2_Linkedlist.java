import java.util.LinkedList;
public class _2_Linkedlist {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList<>();
        ll1.add(45);
        ll1.add("java");
        ll1.add(7.5);
        ll1.addFirst(455);
        ll1.addLast(78);
        ll1.add(2,11);
        System.out.println(ll1);
        //ll1.clear();
        //System.out.println(ll1);
        System.out.println(ll1.contains(45));
        ll1.offer("DevOps");
        System.out.println(ll1);
        ll1.offer("HELLO");
        System.out.println(ll1);
        ll1.offerFirst("Sprint");
        System.out.println(ll1);
        System.out.println(ll1.peek());
        System.out.println(ll1.peekLast());
        System.out.println(ll1.poll()); // removes first element
        System.out.println(ll1);
    }
}
