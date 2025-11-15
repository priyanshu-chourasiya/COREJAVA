// class A{
//     public void show(){
//         System.out.println("In A class");
//     }
// }
// class B extends A{
//     public void show(){
//         System.out.println("In B class");
//     }
// }
/** 
 * this is java documentation
 * 
 **/
class Person{
    public void getDetails(){
        System.out.println("Priyanshu");
    }

    static class Phone{ // we can have inner class static
        public void getDetails2(){
        System.out.println("samsung");
    }
    }
}
public class _7_Lambda {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A obj2 = new B();
        // obj2.show();

        Person p = new Person();
        p.getDetails();
        // Phone ph = new Phone(); //not possible
        Person.Phone ph = new Person.Phone();
        ph.getDetails2();
        //
    }
}
