
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class _10_Failsafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList al = new CopyOnWriteArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        System.out.println(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            al.add(44);
        }
        System.out.println("----------");
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
            //al.add(44);
        }
        System.out.println("----------");
        ListIterator li2 = al.listIterator();
        while(li2.hasNext()){
            System.out.println(li2.next());
            //al.add(44);
        }
        System.out.println("----------");
        ListIterator li3 = al.listIterator(al.size()); 
        while(li3.hasPrevious()){
            System.out.println(li3.previous());
            //al.add(44);
        }
        System.out.println("----------");
    }
}
