package polymorphism.ex6;

public abstract class Account {
    private int initialBalance; // 기초 잔액

    public Account(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    // 입금
    public int deposit(int amount) {
        return initialBalance += amount;
    }

    // 출금
    public boolean withdraw(int amount) {
        if(initialBalance - amount >= 0){
            initialBalance -= amount;
            return true;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
            return false;
        }
    }

    // 이자 계산
    abstract double calculateInterest();


}
