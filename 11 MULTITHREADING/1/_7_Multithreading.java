class MyCar implements Runnable{
    
    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " has entered parking lot");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has entered into car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has stared to drive the car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has came back and parked the car");
        } catch (Exception e) {
        }
    }
}
public class _7_Multithreading {
    public static void main(String[] args) {
        MyCar mc = new MyCar();

        Thread t1 = new Thread(mc);
        Thread t2 = new Thread(mc);
        Thread t3 = new Thread(mc);

        t1.setName("CHILD 1");
        t2.setName("CHILD 2");
        t3.setName("CHILD 3");

        t1.start();
        t2.start();
        t3.start();

        /*
         *  CHILD 1 has entered parking lot
            CHILD 2 has entered parking lot
            CHILD 3 has entered parking lot
            CHILD 1 has entered into car
            CHILD 2 has entered into car
            CHILD 3 has entered into car
            CHILD 2 has stared to drive the car
            CHILD 1 has stared to drive the car
            CHILD 3 has stared to drive the car
            CHILD 2 has came back and parked the car
            CHILD 3 has came back and parked the car
            CHILD 1 has came back and parked the car
         */
    }
}
