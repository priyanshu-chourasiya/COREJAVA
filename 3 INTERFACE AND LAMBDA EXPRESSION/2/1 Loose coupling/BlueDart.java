
public class BlueDart implements IDeliveryService {
        public Boolean deliveredProduct(Double amount){
        System.out.println("Delivered from Bluedart amount : " + amount);
        return true;
    }
}
