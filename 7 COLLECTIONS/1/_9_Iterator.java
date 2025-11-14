import java.util.ArrayList;
import java.util.Iterator;

public class _9_Iterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        Iterator itr = al.iterator();
        while(itr.hasNext()){ // check data is there is next or not
            System.out.println(itr.next()); // print current data
        }
        System.out.println("-------------------");
        Iterator itr2 = al.iterator();
        while(itr2.hasNext()){ // check data is there is next or not
            System.out.println(itr2.next()); // print current data
            al.add(44);
            /*
             *  100
                200
                300
                400
                -------------------
                100
                Exception in thread "main" java.util.ConcurrentModificationException
                        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
                        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
                        at _9_Iterator.main(_9_Iterator.java:19)
                PS C:\Users\priyx\Desktop\COREJAVA\7 COLLECTIONS> 
             */
        }
    }
}
