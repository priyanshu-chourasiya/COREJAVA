
class Employee{
    private Integer id;
    private String name;
    private String city;

    public Employee(String city, Integer id, String name) {
        this.city = city;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
    }

}
 class _12_Generics {
    public static void main(String[] args) {
        // supports type safety
        int arr[] = new int[3];
        arr[0] = 14;
        arr[1] = 24;
        arr[2] = 34;

        int data = arr[0];

        String []str = new String[3];
        str[0] = "abc";
        str[1] = "def";
        str[2] = "java";

        String ans = str[1];

        // no typesafety
        ArrayList al = new ArrayList<>();
        al.add("abc");
        al.add("java");
        al.add("alien");
        al.add(44);

        String s1 = (String) al.get(0);
        s1 = s1.toLowerCase();
        System.out.println(s1);

        String s2 = (String) al.get(1);
        s2 = s2.toLowerCase();
        System.out.println(s2);

        String s3 = (String) al.get(2);
        s3 = s3.toLowerCase();
        System.out.println(s3);

        // String s4 = (String) al.get(3);
        // s4 = s4.toLowerCase();
        // System.out.println(s4);
        // /*
        //  *  abc
        //     java
        //     alien
        //     Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
        //             at _12_Generics.main(_12_Generics.java:40)
        //  */
        // typesafety
        System.out.println("-------");
        ArrayList<String> list = new ArrayList<>(); // generics 
        list.add(("java"));
        // list.add(90); error
        list.add("Spring");
        for(String i : list){
            System.out.println(i);
        }

        System.out.println("-------");


        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Bhopal", 1, "Priyanshu"));
        emp.add(new Employee("Bpal", 17, "Priyahu"));
        emp.add(new Employee("Bhoa", 41, "Priu"));

        for(Employee e : emp){
            System.out.println(e);
        }

        // ArrayList<int> ar = new ArrayList<>(); primitve datatype are not allowed as generices
        // ArrayList<Object> ar = new ArrayList<Integer>(); not allowed

        
    }
}
