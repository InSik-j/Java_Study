package polymorphism.ex6;

public class BankSystem {
    public static void main(String[] args) {
        Account[] accounts = {new SavingAccount(10000, 10),
                            new CheckingAccount(20000),
                            new FixedDepositAccount(30000, 3, 10) };
        accountPrint(accounts);

    }

    public static void accountPrint(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println("입금 후 잔액 : "+account.deposit(1000));
            if(account.withdraw(12000)){
                System.out.println("출금 후 잔액 : "+account.getInitialBalance());
            }
            System.out.println("이자 : "+account.calculateInterest());
        }
    }
}
