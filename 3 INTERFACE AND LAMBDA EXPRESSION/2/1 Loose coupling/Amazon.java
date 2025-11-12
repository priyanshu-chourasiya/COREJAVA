public class Amazon{
    public Boolean deliveryofProduct(Double amount){

        private IDeliveryService service;

        public void setService(IDeliveryService service){ // IDeliveryService service = new Fedx();
            this.service = service;
        }

        //Fedx fx = new Fedx();
        // Boolean status = fx.deliveredProduct(amount);
        // return status;
        return service.deliveredProduct(amount);
    }
}