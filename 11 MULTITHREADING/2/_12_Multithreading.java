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
            for(int i = 0 ; i < 3; i++){
                System.out.println("Spell check");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AutoSaving(){
        try {
            for(int i = 0 ; i < 3; i++){
                System.out.println("Auto Saving");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class _12_Multithreading {
    public static void main(String[] args) {
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();
        MSWord ms3 = new MSWord();

        ms1.setName("Typing");
        ms2.setName("Spell");
        ms3.setName("Saving");
        
        ms1.start();
        ms2.start();
        ms3.start();
    }
} 