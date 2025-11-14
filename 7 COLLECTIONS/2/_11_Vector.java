
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class _11_Vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(100);
        v.add(200);
        v.add(300);
        v.addElement(400);
        System.out.println(v);
        System.out.println("-----------------");
        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----------------");
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println("-----------------");
    }
}
