package polymorphism.ex6;

public class CheckingAccount extends Account{

    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
