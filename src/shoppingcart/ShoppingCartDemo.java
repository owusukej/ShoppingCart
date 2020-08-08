
package shoppingcart;

/**
 *
 * @author Jimmy Kessie 
 */
public class ShoppingCartDemo {
    public static void main (String [] args){
            PaymentServiceFactory factory = PaymentServiceFactory.getInstance();
            PaymentService creditService = factory.getPaymentService(PaymentServiceType.CREDIT);
            PaymentService debitService = factory.getPaymentService(PaymentServiceType.DEBIT);
             
            Cart cart = new Cart();
            cart.addproduct(new Product ("shirt",50));
            cart.addproduct(new Product ("pants",60));
            
            cart.setPaymentService(creditService);
            cart.payCart();
            
            cart.setPaymentService(debitService);
            cart.payCart();
            
    }
}
