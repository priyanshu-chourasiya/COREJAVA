class Finisher {
    private int id;
    private String name;
    private String city;

    public Finisher() {
        super();
        System.out.println("Zero parametrized constructor");
    }

    public Finisher(int id, String name, String city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;

        System.out.println("Parametrized constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class _12_Constructor {
    public static void main(String[] args) {
        Finisher f1 = new Finisher();
        f1.setId(1);
        f1.setName("Priyanshu");
        f1.setCity("Bhopal");

        System.out.println(f1.getId());
        System.out.println(f1.getName());
        System.out.println(f1.getCity());

        System.out.println("_______________________________");

        Finisher f2 = new Finisher(2,"Rohit","Indore");
        f2.setId(10);
        f2.setName("ABC");
        f2.setCity("Mumbai");
        System.out.println(f2.getId());
        System.out.println(f2.getName());
        System.out.println(f2.getCity());


    }
}
 
