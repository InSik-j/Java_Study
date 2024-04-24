package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("두 값에 0을 입력하면 종료됩니다.");
        while (true){
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = scan.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = scan.nextInt();

            if(num1==0 && num2==0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int result = num1+num2;

            System.out.println("첫번째 값 : "+num1);
            System.out.println("두번째 값 : "+num2);
            System.out.println("두 숫자의 합 : "+result);
        }
    }
}
