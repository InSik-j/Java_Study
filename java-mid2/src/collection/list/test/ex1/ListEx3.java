package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요. (종료 0)");
        while (true){
            int input = scan.nextInt();
            if(input == 0) break;
            numbers.add(input);
        }

        int total = 0;
        for(Integer number : numbers){
            total += number;
        }
        double avr = (double) total / numbers.size();
        
        System.out.println("입력한 정수의 합계 : "+ total);
        System.out.println("입력한 정수의 평균 : "+ avr);


    }
}
