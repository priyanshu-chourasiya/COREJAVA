
public class LaunchAmazon {
    Amazon amz = new Amazon();

    Boolean ans = amz.deliveredProduct(9.0);

    // Fedx fedx = new Fedx();
    // amz.setService(fedx);

    amz.setService(new Fedx());

    if(ans){
        System.out.println("Delivered");
    }
    else{
        System.out.println("not delivered");
    }
}
