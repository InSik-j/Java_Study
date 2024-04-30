package polymorphism.ex6;

public class FixedDepositAccount extends Account{
    private double interestRate; // 이율
    private int termInYears; // 예치 기간

    public FixedDepositAccount(int initialBalance, double interestRate, int termInYears) {
        super(initialBalance);
        this.interestRate = interestRate * 0.01;
        this.termInYears = termInYears;
    }

    @Override
    public double calculateInterest() {
        return getInitialBalance()*interestRate*termInYears;
    }
}
