package polymorphism.ex6;

public class SavingAccount extends Account{
    private double interestRate; // 이율

    public SavingAccount(int initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate * 0.01;
    }

    @Override
    public double calculateInterest() {
        return getInitialBalance()*interestRate;
    }
}
