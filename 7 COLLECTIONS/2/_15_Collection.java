import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _15_Collection {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        List<Integer> l1= new LinkedList<>();
        
        List<Integer> l2 = Arrays.asList(10,20,30,40);
        System.out.println(l2);
    }
    pubic static Iterable<Integer> getIntegers(){
        // return new ArrayList<Integer>; // allowed
        return new TreeSet<Integer>; // allowed
    }
    pubic static List<Integer> getInteger(){
        return new ArrayList<Integer>; // allowed
        // return new TreeSet<Integer>; not allowed
    }
}
