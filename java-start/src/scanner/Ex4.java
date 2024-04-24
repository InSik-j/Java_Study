package scanner;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true) {
            int input = scan.nextInt();
            if(input == -1){
                break;
            }
            count++;
            sum += input;
        }
        double ave =  (double) sum / count;
        System.out.println("입력한 숫자들의 합계 : "+sum);
        System.out.println("입력한 숫자들의 평균 : "+ave);
    }
}
