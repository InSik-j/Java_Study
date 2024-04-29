package polymorphism.ex4;

public class PaymentSystem {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCard(), new PayPal(), new BankTransfer()};

        for (Payment payment : payments) {
            payment.processPayment();
        }
    }
}
