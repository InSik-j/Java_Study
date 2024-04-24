package method;

import java.util.Scanner;

//문제와 풀이2
//문제 - 은행 계좌 입출금
//다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
//또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
//출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
//실행 예시 ```
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 1
//입금액을 입력하세요: 10000
//10000원을 입금하였습니다. 현재 잔액: 10000원
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 2
//출금액을 입력하세요: 8000
//8000원을 출금하였습니다. 현재 잔액: 2000원
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 2
//출금액을 입력하세요: 3000
//3000원을 출금하려 했으나 잔액이 부족합니다.
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 3
//현재 잔액: 2000원
//---------------------------------
//1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
//---------------------------------
//선택: 4
//시스템을 종료합니다.
public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 0;

        while (true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 : ");
            int select = scan.nextInt();

            if(select == 1){
                System.out.print("입금액을 입력하세요 : ");
                int depositAmount = scan.nextInt();
                balance = deposit(balance, depositAmount);
            } else if (select==2) {
                System.out.print("출금액을 입력하세요 : ");
                balance = withdraw(balance, scan.nextInt());
            } else if (select==3) {
                System.out.println("현재 잔액 : "+balance+"원");
            } else {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }

    }

    public static int deposit(int balance, int depositAmount){
        balance += depositAmount;
        System.out.println(depositAmount+"을 입금하였습니다. 현재 잔액: "+balance+"원");
        return balance;
    }
    public static int withdraw(int balance, int withdrawAmount){
        if(balance<withdrawAmount){
            System.out.println(withdrawAmount+"을 출금하려 했으나 잔액이 부족합니다. 현재 잔액: "+balance+"원");
        }else{
            balance -= withdrawAmount;
            System.out.println(withdrawAmount+"을 출금하였습니다. 현재 잔액: "+balance+"원");
        }
        return balance;
    }
}
