import java.util.ArrayList;

public class _8_Accessingdata {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        double d = (Integer)al.get(2);
        System.out.println(d);

        for(int i = 0; i < al.size();i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        for(Object o : al){
            System.out.print(o + " ");
        }
    }
}
