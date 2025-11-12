
public class FirstFlight implements IDeliveryService{
    public Boolean deliveredProduct(Double amount){
        System.out.println("Delivered from FirstFlight amount : " + amount);
        return true;
    }
}
