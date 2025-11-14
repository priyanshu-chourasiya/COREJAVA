import java.util.LinkedHashSet;

public class _7_Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(50);
        lhs.add(150);
        lhs.add(25);
        lhs.add(75);
        lhs.add(125);
        lhs.add(125);
        lhs.add(175);  // duplicates are not allowed
        System.out.println(lhs); //order of insertion is there
    }
}
