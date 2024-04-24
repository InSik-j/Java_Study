package array;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scan.nextInt();
        int[] arr = new int[count];



        for(int i=0; i<count; i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<count; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<=min){
                min = arr[i];
            }
        }

        System.out.println("가장 작은 정수 : "+ min);
        System.out.println("가장 큰 정수 : "+ max);
    }
}
