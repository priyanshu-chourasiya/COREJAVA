

public class Fedx implements IDeliveryService{
    public Boolean deliveredProduct(Double amount){
        System.out.println("Delivered from Fedx amount : " + amount);
        return true;
    }
}
