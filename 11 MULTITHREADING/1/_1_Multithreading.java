
public class _1_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");
        // Thread.sleep(5000);
        Thread thread =  Thread.currentThread();
        System.out.println(thread.getName());  // default name
        System.out.println(thread.getPriority()); // default priority
        thread.setName("Priyanshu");
        thread.setPriority(4);
        System.out.println(thread.getName());  
        System.out.println(thread.getPriority());
        System.out.println("Application terminated");
    }
}
// we can change name and priority of main thread