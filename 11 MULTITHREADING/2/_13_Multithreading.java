class MSWord extends Thread{
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("Typing")){
            Typing();
        }
        else if(name.equals("Spell")){
            SpellCheck();
        }
        else{
            AutoSaving();
        }
    }
    public void Typing(){
        try {
            for(int i = 0 ; i < 3; i++){
                System.out.println("Typing");
                Thread.sleep(4000);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void SpellCheck(){
        try {
            for(;;){   // executed by demon thread 
                // demon thread follows root of main thread
                // if main is executing 3 times so demon thread will also execute 3 times
                System.out.println("Spell check");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AutoSaving(){
        try {
            for(;;){  // infinte loop
                System.out.println("Auto Saving");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class _13_Multithreading {
    public static void main(String[] args) {
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();
        MSWord ms3 = new MSWord();

        ms1.setName("Typing");
        ms2.setName("Spell");
        ms3.setName("Saving");

        ms2.setDaemon(true);
        ms3.setDaemon(true);
        ms2.setPriority(4);
        ms3.setPriority(3);   // 1 means low priority and 10 means high

        ms1.start();
        ms2.start();
        ms3.start();

        /*
         *  Typing
            Spell check
            Auto Saving
            Auto Saving
            Typing
            Spell check
            Typing
            Auto Saving
            Spell check
            Auto Saving
         */
    }
} 