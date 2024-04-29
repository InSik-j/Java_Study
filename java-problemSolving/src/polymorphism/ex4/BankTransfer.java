package polymorphism.ex4;

public class BankTransfer extends Payment{
    @Override
    public void processPayment(){
        System.out.println("BankTransfer 결제");
    };
}
