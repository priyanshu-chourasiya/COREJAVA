
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR}) // target
@interface CricketPlayer{ // annotation
    String country() default "India";
    //int age();
}//@ this specifies the compiler that annotation type is being created

//Virat kohili is a cricket player who lives in India and play for India
//@CricketPlayer(country="India", age = 35)
@CricketPlayer
class Viratkohili{
    private int innigs;

    public Viratkohili(){

    }

    public int getInnigs() {
        return innigs;
    }

    public void setInnigs(int innigs) {
        this.innigs = innigs;
    }

}
public class _5_Annotation {
    public static void main(String[] args) {
        Viratkohili vk = new Viratkohili();
        vk.setInnigs(44);
        System.out.println(vk.getInnigs());

        System.out.println("----------------------------");

        Class<? extends Viratkohili > c = vk.getClass();
        CricketPlayer cp = c.getAnnotation(CricketPlayer.class);
        System.out.println(cp.country());
    }
}
// parent of all annotation is Annotation