import java.util.ArrayList;
import java.util.List;

public class _1_Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(18);
        list.add(72);
        list.add(44);
        System.out.println(list);

        // for(Integer i : list){
        //     System.out.print(i*2 + " ");
        // }
        // System.out.println(); 
        // Consumer<Integer> consumer = new Consumer<>() {

        //     @Override
        //     public void accept(Integer t) {
        //         // TODO Auto-generated method stub
        //         //throw new UnsupportedOperationException("Unimplemented method 'accept'");
        //         System.out.println(t);
        //     }
            
        // };

        // Consumer<Integer> consumer = (Integer t) -> System.out.println(t);

        // list.forEach(consumer);
        
        list.forEach((t) -> System.out.println(t));
    }
}
