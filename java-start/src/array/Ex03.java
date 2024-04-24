package array;

//문제 - 합계와 평균
//        사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
//        실행 결과 예시 ```
//        5개의 정수를 입력하세요:
//        1
//        2
//        3
//        4
//        5
//        입력한 정수의 합계: 15
//        입력한 정수의 평균: 3.0

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = new int[5];

        int sum = 0;

        System.out.println("5개의 정수를 입력하세요");
        for(int i = 0; i<input.length;i++){
            input[i] = scan.nextInt();
            sum += input[i];
        }
        double ave = (double) sum/ input.length;
        System.out.println(" 입력한 정수의 합계 : "+sum);
        System.out.println(" 입력한 정수의 평균 : "+ave);

        //문제 - 합계와 평균2
        //이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
        int size;
        int[] input2;
        int sum2 = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        size = scan.nextInt();
        input2 = new int[size];

        System.out.println(size+"개의 정수를 입력하세요 : ");
        for(int i = 0; i<size;i++){
            input2[i] = scan.nextInt();
            sum2 += input2[i];
        }
        double ave2 = (double) sum2/size;
        System.out.println(" 입력한 정수의 합계 : "+sum);
        System.out.println(" 입력한 정수의 평균 : "+ave2);

    }
}
