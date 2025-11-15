
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class _2_Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(52);
        list.add(12);
        list.add(18);
        list.add(72);
        list.add(44);
        System.out.println(list);
        // have to work on list without affecting exesting list
        // Collections.sort(list);
        // System.out.println(list);
        Stream<Integer> sd1 = list.stream();
        // System.out.println(sd1.sorted());
        Stream<Integer> sd2 = sd1.sorted(); 
        // System.out.println(sd2);
        sd2.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println(list);
    }
}
// once stream is consumed you cannot reuse the stream
