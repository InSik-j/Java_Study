package oop1.ex;

import java.util.Scanner;

public class RectangleOopMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("가로 길이를 입력하세요 : ");
        rectangle.width = sc.nextInt();
        System.out.print("세로 길이를 입력하세요 : ");
        rectangle.height = sc.nextInt();

        System.out.println("넓이 : "+rectangle.calculateArea());
        System.out.println("둘레 길이 : "+rectangle.calculatePerimeter());
        System.out.println("정사각형 여부 : "+rectangle.isSquare());

    }
}
