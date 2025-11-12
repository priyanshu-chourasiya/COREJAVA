// class Person{
//     public void getDetails(){
//         System.out.println("Priyanshu");
//     }

//     class Phone{ // we can have inner class static
//         public void getDetails2(){
//         System.out.println("samsung");
//     }
//     }
// }

class A{
    public void show(){
        System.out.println("In A class");
    }
    public void display(){
        System.out.println("In A class display method");
    }
}
// class B extends A{
//     public void show(){
//         System.out.println("In B class");
//     }
// }
public class _9_Lambda {
    public static void main(String[] args) {
        A obj = new A(){  // Anonmous inner class
            public void show(){  // we can use only once
                System.out.println("In new show");
            }
            public void display(){
                System.out.println("New display");
            }
            public void newMethod(){
                System.out.println("New method in object");
            }
        };
        obj.show();
        obj.display();
        //obj.newMethod(); we can create new method in anonmous but we cannot access it 

        new A().show();
        

        new A(){  // Anonmous inner class
            public void show(){  // we can use only once
                System.out.println("In new show");
            }
            public void display(){
                System.out.println("New display");
            }
            public void newMethod(){
                System.out.println("New method in object");
            }
        }.newMethod();
    }
}
