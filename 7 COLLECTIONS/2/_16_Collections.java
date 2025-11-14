
import java.util.ArrayList;
import java.util.Collections;

public class _16_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(50);
        list.add(150);
        list.add(25);
        list.add(75);
        list.add(125);
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        System.out.println("------------------");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Banana");   
        list1.add("Grapes");
        System.out.println(list1);
        Collections.sort(list1);
    }
}
