import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

interface Alpha{
    interface Beta{
        static void display(){
            System.out.println("Static method of inner interface");
        }
    }
}
public class _2_Maps {
    public static void main(String[] args) {
        Alpha.Beta.display();
        System.out.println("------------------------------------------");

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "Java");
        hm.put(2,"Python");
        hm.put(3, "C++");
        hm.put(4, "Micro1");
        hm.put(6, "Micro2"); 
        hm.put(5, "Micro3");
        System.out.println(hm.get(3));
        System.out.println(hm.values());
        System.out.println(hm.keySet());

        System.out.println("------------------------------------------");

        Collection<String> values = hm.values();
        Iterator<String> itr = values.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");

        Set<Integer> keys = hm.keySet();
        Iterator<Integer> itr1 = keys.iterator();
        while(itr1.hasNext()){
            System.out.print(itr1.next() + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        
        Set<Map.Entry<Integer,String>> entry = hm.entrySet();
        Iterator<Map.Entry<Integer,String>> itr2 = entry.iterator();
        while (itr2.hasNext()) {
            Map.Entry<Integer,String> pair = itr2.next();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }
}
