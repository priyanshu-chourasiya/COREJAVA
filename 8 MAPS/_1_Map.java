
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class Telusko{
    private Integer id;
    private String courseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Telusko [id=" + id + ", courseName=" + courseName + "]";
    }

    public Telusko(Integer id, String courseName) {
        super();
        this.id = id;
        this.courseName = courseName;
    }
    public Telusko(){
        super();
    }
    
}
public class _1_Map {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap<>();
        hm1.put(1, "Java");
        hm1.put(2,"Python");
        hm1.put(3, "C++");

        System.out.println(hm1);
        System.out.println("------------------------------------------");
        Telusko t = new Telusko(1,"java");
        HashMap hm2 = new HashMap<>();
        hm2.put("Alien", "Java");
        hm2.put(t, "Spring"); // key-value
        hm2.put(4, "Micro");
        hm2.put(4, "Micro"); // key must be unique
        hm2.put(5, "Micro"); //  and value need not to be unique
        hm2.put(null,"Python"); // key can be null
        hm2.put(6, null); // value can also be null
        System.out.println(hm2); // no order of insertion is maintained

        System.out.println("------------------------------------------");

        LinkedHashMap hm3 = new LinkedHashMap<>(); // child class of hashmap
        hm3.put("Alien", "Java");
        hm3.put(t, "Spring"); 
        hm3.put(4, "Micro");
        hm3.put(4, "Micro"); 
        hm3.put(5, "Micro"); 
        hm3.put(null,"Python"); 
        hm3.put(6, null);
        System.out.println(hm3);  // insertion order is preserved

        System.out.println("------------------------------------------");

        HashMap<Integer,String> hm4 = new HashMap<>(); // key as Integer and value as String
        hm4.put(1,"Java");
        hm4.put(2,"Spring");
        hm4.put(3,"Micro");
        hm4.put(4,"JDBC"); // key value pairs together are called Entry
        //hm4.put("KEY","Java");
        System.out.println(hm4);

        System.out.println("------------------------------------------");

        Hashtable ht = new Hashtable<>();
        ht.put(1,"Alien");
        ht.put(2,"Java");
        ht.put(3,"India");
        ht.put(4,"Capgemini");
        // ht.put(null,"Alien"); // cannot have key as null
        // ht.put("ABC",null); // cannot havevalue as null
        System.out.println(ht);

        System.out.println("------------------------------------------");

        TreeMap tm = new TreeMap(); // sorted order based on key
        tm.put(1, "Hibernate");
        tm.put(10,"Alien");
        tm.put(2,"Java");
        tm.put(3,"India");
        tm.put(4,"Capgemini");
        // tm.put(null,"Alien"); key cannot be null
        //tm.put("ABC",null); // value can be null
        // this line was throwing error because key was String
        System.out.println(tm);
    }
}
