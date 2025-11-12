class Person{
    public void getDetails(){
        System.out.println("Priyanshu");
    }

    class Phone{ // we can have inner class static
        public void getDetails2(){
        System.out.println("samsung");
    }
    }
}
public class _8_Lambda {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A obj2 = new B();
        // obj2.show();

        Person p = new Person();
        p.getDetails();
        // Phone ph = new Phone(); //not possible
        Person.Phone ph = p.new Phone();
        ph.getDetails2();
    }
}
