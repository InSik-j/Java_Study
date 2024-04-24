package array;


import java.util.Scanner;

//문제 - 배열의 입력과 출력
//사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
//출력시 출력 포멧은 1, 2, 3, 4, 5와 같이 , 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
//실행 결과 예시를 참고하자.
//실행 결과 예시 ```
//    5개의 정수를 입력하세요:
//    1
//    2
//    3
//    4
//    5
//출력
//1, 2, 3, 4, 5
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");

        for(int i=0;i<input.length;i++){
            input[i] = scan.nextInt();
        }
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]);

            if(i<input.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for(int i=input.length-1;i>=0;i--){
            System.out.print(input[i]);
            if(i>0){
                System.out.print(", ");
            }
        }


    }
}
