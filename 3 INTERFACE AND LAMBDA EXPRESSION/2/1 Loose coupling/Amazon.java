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
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: Amazon with Multiple Delivery Services
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **polymorphism and interface-based delegation** in Java.  
The `Amazon` class delegates the delivery task to different delivery service implementations (`Fedx`, `BlueDart`, `FirstFlight`) using the `IDeliveryService` interface.  
It illustrates a **Strategy Pattern**, where the delivery strategy can be swapped at runtime.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INTERFACE (`IDeliveryService`)  
- Declares a method that every delivery service must implement:  
  `Boolean deliveredProduct(Double amount);`  
- Enables **polymorphism**: `Amazon` can call the method on any implementing class without knowing its concrete type.  

IMPLEMENTATION CLASSES  
- `Fedx`, `BlueDart`, `FirstFlight` implement `IDeliveryService`  
- Each class provides its own version of `deliveredProduct`, printing the delivery source and returning `true`.  

COMPOSITION & DELEGATION  
- `Amazon` has a **private variable `service` of type `IDeliveryService`**  
- `setService(IDeliveryService service)` allows injecting the concrete service  
- `deliveryofProduct(Double amount)` delegates the delivery task to the injected service  

POLYMORPHIC CALL  
- The actual implementation executed depends on the object passed to `setService()`  
- Enables runtime flexibility without changing the `Amazon` class  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

`Amazon` class  
- `service` → holds reference to a delivery service (Fedx, BlueDart, FirstFlight)  
- `setService(IDeliveryService service)` → assigns the service at runtime  
- `deliveryofProduct(Double amount)` → calls `service.deliveredProduct(amount)`  

`Fedx`, `BlueDart`, `FirstFlight` classes  
- Implement the interface method  
- Contain **specialized behavior** for each delivery service  

`LaunchAmazon` class  
- Creates an `Amazon` object  
- Injects a concrete service (`Fedx`) using `setService`  
- Calls `deliveryofProduct` to perform delivery  
- Prints whether the product was delivered based on the Boolean returned  


4. PURPOSE OF VARIABLES, METHODS, AND BLOCKS
--------------------------------------------

`private IDeliveryService service;` → holds reference to the chosen delivery service  

`setService(IDeliveryService service)` → dependency injection method  
- Allows swapping delivery strategies at runtime  

`deliveryofProduct(Double amount)` → delegates actual delivery  
- Calls `deliveredProduct` on `service`  

`Boolean deliveredProduct(Double amount)` in implementing classes  
- Executes the specific delivery logic (prints which service delivered and returns true)  

`LaunchAmazon` main logic  
- Initializes Amazon and assigns a delivery service  
- Calls delivery method and prints result  


5. CONTROL-FLOW EXPLANATION
---------------------------

① `LaunchAmazon` creates an `Amazon` instance → `amz`  
② Calls `amz.setService(new Fedx())` → injects `Fedx` delivery service  
③ Calls `amz.deliveredProduct(9.0)`  
    - Internally delegates to `Fedx.deliveredProduct(9.0)`  
    - Prints: "Delivered from Fedx amount : 9.0"  
    - Returns `true`  
④ Checks returned Boolean `ans` → prints "Delivered"  


6. EXPECTED OUTPUT
------------------
Delivered from Fedx amount : 9.0  
Delivered  


7. ADDITIONAL NOTES
-------------------
- Demonstrates **interface polymorphism** and **runtime behavior delegation**  
- **Strategy Pattern** is used: different services can be plugged in without modifying Amazon  
- `Amazon` does not know the internal implementation of the delivery services  
- Static type (`IDeliveryService`) allows uniform interface; concrete classes provide specific behavior  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
