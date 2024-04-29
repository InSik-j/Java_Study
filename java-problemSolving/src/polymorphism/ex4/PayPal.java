package polymorphism.ex4;

public class PayPal extends Payment{
    @Override
    public void processPayment(){
        System.out.println("PayPal 결제");
    };
}
