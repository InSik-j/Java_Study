package scanner;

//문제 - 홀수 짝수
//사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
//실행 결과 예시 ```
//하나의 정수를 입력하세요:1
//입력한 숫자 1는 홀수입니다. ```
//실행 결과 예시 ```
//하나의 정수를 입력하세요:4
//입력한 숫자 4는 짝수입니다.

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("하나의 정수를 입력하세요( 0 : 종료) : ");
            int input = scan.nextInt();
            if(input == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if(input%2==0){
                System.out.println("입력한 숫자 "+input+"는 짝수입니다.");
            }else {
                System.out.println("입력한 숫자 "+input+"는 홀수입니다.");
            }

        }
    }
}
