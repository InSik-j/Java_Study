package array;

import java.util.Scanner;

public class ArrayRef1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        int[] students1;
        students1 = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화

        int[] students2 = {90, 80, 70, 60, 50};

        int[] students3 = new int[5];
        //변수 값 대입
        for(int i=0; i<students3.length; i++){
            System.out.print("학생"+(i+1)+"의 점수 : ");
            students3[i] = scan.nextInt();
        }
        //변수 값 사용
        for (int i = 0; i < students3.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students3[i]);
        }

    }
}
