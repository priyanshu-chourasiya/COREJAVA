
import java.util.ArrayList;
import java.util.List;



class Human{
    int age;
    
    public void disp(){
        System.out.println("Humans are good");
    }
}
class Students extends Human{

}

class Employee{

}
public class _14_Generics {
    public static void main(String[] args) {
        // Object obj = new Object();
        // String s = new String("Alien");
        // obj = s;
        // s = obj;

        Human h = new Human();

        Students s = new Students();
        h = s;
        // s = h;
        ArrayList<Human> hlist1 = new ArrayList<>();
        ArrayList<Students> slist1 = new ArrayList<>();

        // hlist1 = slist1; not allowed

        ArrayList<?> hlist2 = new ArrayList<>(); // ? unknown type --> wildcard
        ArrayList<Students> slist2 = new ArrayList<>();
        hlist2 = slist2;

        ArrayList<? extends Human> hlist3 = new ArrayList<>(); // upperbound
        ArrayList<Students> slist3 = new ArrayList<>();
        hlist3 = slist3;

        ArrayList<? extends Human> hlist4 = new ArrayList<>(); 
        ArrayList<Students> slist4 = new ArrayList<>();
        ArrayList<Employee> elist4 = new ArrayList<>();
        ArrayList<Object> olist4 = new ArrayList<>();
        // hlist4 = elist4;  compiler time error
        hlist4 = slist4;
        // hlist4 = olist4; compiler time error

        ArrayList<? super Human> hlist5 = new ArrayList<>(); // lowerbound
        ArrayList<Students> slist5 = new ArrayList<>();
        ArrayList<Employee> elist5 = new ArrayList<>();
        ArrayList<Object> olist5 = new ArrayList<>();

        // hlist5 = elist5;
        // hlist5 = slist5;
        hlist5 = olist5;

        ArrayList<Human> hlist = new ArrayList<Human>(); // right side <> is not mandortary
        hlist.add(new Human());
        hlist.add(new Human());
        hlist.add(new Human());
        hlist.add(new Human());
        invockDisplay(hlist);

        System.out.println("--------------------");

        ArrayList<Students> slist = new ArrayList<>();
        slist.add(new Students());
        slist.add(new Students());
        slist.add(new Students());
        slist.add(new Students());
        invockDisplay(slist);

        System.out.println("--------------------");



    }  
    
    public static void invockDisplay(List< ? extends Human> list){ // expecting colletion of human or child of human
        for(Human h : list){
            System.out.println(h);
        }
    }
}
