import java.util.ArrayList;
import java.util.Collections;

class Cricketer implements Comparable<Cricketer>{
    int age;
    String name;
    double avg;
    public Cricketer(int age, String name, double avg) {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cricketer{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append(", avg=").append(avg);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Cricketer o){
        if(this.avg > o.avg){
            return 1;
        }
        else{
            return -1;
        }
    }

}
public class _18_Complexsorting {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(12, "Priyanshu", 55.2);
        Cricketer c2 = new Cricketer(13, "Priyan", 27.2);
        Cricketer c3 = new Cricketer(14, "anshu", 8.2);

        ArrayList<Cricketer> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        System.out.println(c);
        Collections.sort(c);
    }
}
