public class _11_Exception {
    // public static void main(String[] args) {
    //     System.out.println("Main method task started");

    //     try {
    //         Thread.sleep(5000);
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }

    //     System.out.println("Main method task completed");
    // }

    //                                          OR
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main method task started");

        
        Thread.sleep(5000);
        

        System.out.println("Main method task completed");
    }
}
/*
 * checked expection : compiler will check the possibilty of exception
 * exception occurs only at runtime
 */