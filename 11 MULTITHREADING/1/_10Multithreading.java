class Library implements Runnable{

    String res1 = new String("JAVA");
    String res2 = new String("PYTHON");
    String res3 = new String("DSA");

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("Student 1")){
            try {
                System.out.println("Student 1 got into library");
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println("Student 1 has : " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 1 has : " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student 1 has : " + res3);
                            Thread.sleep(3000);
                        } // the moment control comes out to this braces resource is released
                    }
                }
            } catch (Exception e) {
            }
        }
        else{
            try {
                System.out.println("Student 2 got into library");
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println("Student 1 has : " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 2 has : " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student 3 has : " + res3);
                            Thread.sleep(3000);
                        } // the moment control comes out to this braces resource is released
                    }
                }
            } catch (Exception e) {
            }
        }

    }
}
public class _10Multithreading {
    public static void main(String[] args) {
        Library l = new Library();

        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        t1.setName("Student 1");
        t2.setName("Student 2");

        t1.start();
        t2.start();
    }
}
