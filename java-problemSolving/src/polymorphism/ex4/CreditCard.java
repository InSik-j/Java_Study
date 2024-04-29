package polymorphism.ex4;

public class CreditCard extends Payment{
    @Override
    public void processPayment(){
        System.out.println("credit card 결제");
    };
}
