package oop1.ex;

public class Account {
    int balance = 0;
    int deposit(int amount){
        balance += amount;
        return balance;
    }
    void withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액 부족");
            System.out.println("현재 잔액 : "+balance);
        }else {
            balance -= amount;
        }
    }
}
