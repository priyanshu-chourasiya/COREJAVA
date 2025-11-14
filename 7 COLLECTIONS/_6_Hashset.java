
import java.util.HashSet;

public class _6_Hashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);  // duplicates are not allowed
        System.out.println(hs);
        
    }
}
