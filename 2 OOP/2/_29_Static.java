public class _29_Static {
    public static void main(String[] args) {
        
    }
    
}

/*static variables memory will be allocated on Heap area during class loading it self
 * (Class loader subsystem --> linking --> preparation) jvm would also initialize default value to static variable at this stage
 * 
 * static block will be executed during class loading itself (class loading --> initialization)
 * 
 * if there are few statements to be executed even before main method we can use static block
 * 
 * static variables memory will be allocated only once in heap area during class loading. whenever we have
 *  common copy of data which has to be shared among all the object of a class
 *  then we must use static variables as memory will be 
 *  allocated only once and same copy of data will be used among all objects of a class
 * 
 * java instance initialization block will be executed during the object creation before the body of
 * constructor
 * 
 * static methods can be invoked directly with class name. also it can be invocked using reference of object also
 * 
 * whenever we have any commmon statements which must be executed for every constructor we can include that
 * within a java instance intialization block (java block)
 * 
 * instance intialization block can be used to initialize the instance varible
*/