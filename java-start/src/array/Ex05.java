package array;

import java.util.Scanner;

//문제 - 2차원 배열1
//사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
//        2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
//실행 결과 예시 ```
//        1번 학생의 성적을 입력하세요:
//국어 점수:100
//영어 점수:80
//수학 점수:70
//        2번 학생의 성적을 입력하세요:
//국어 점수:30
//영어 점수:40
//수학 점수:50
//        3번 학생의 성적을 입력하세요:
//국어 점수:60
//영어 점수:70
//수학 점수:50
//        4번 학생의 성적을 입력하세요:
//국어 점수:90
//영어 점수:100
//수학 점수:80
//        1번 학생의 총점: 250, 평균: 83.33333333333333
//        2번 학생의 총점: 120, 평균: 40.0
//        3번 학생의 총점: 180, 평균: 60.0
//        4번 학생의 총점: 270, 평균: 90.0
public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for(int student=0; student<students.length;student++){
            System.out.println((student+1)+"번 학생의 성적을 입력하세요.");
            for(int grade=0; grade<students[grade].length;grade++){
                System.out.print(subjects[grade]+"점수 : ");
                students[student][grade] = scan.nextInt();
            }
        }

        for(int student=0; student<4; student++){
            int total = 0;
            for(int grade=0; grade<3;grade++){
                total=total+students[student][grade];
            }
            double ave = (double) total/3;
            System.out.println((student+1)+"번 학생의 총점 : "+total+", 평균 : "+ave);
        }

        // 문제 - 2차원 배열2
        //이전 문제에서 학생수를 입력받도록 개선하자.
        //실행 결과 예시를 참고하자
        System.out.print("학생수를 입력하세요 : ");
        int count = scan.nextInt();

        int[][] students2 = new int[count][3];
        String[] subjects2 = {"국어", "영어", "수학"};

        // 점수 입력받기
        for(int i=0; i<count;i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요.");
            for(int j=0; j<students2[i].length; j++){
                System.out.print(subjects2[j]+"점수 : ");
                students2[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<count; i++){
            int total = 0;
            for(int j=0; j<students2[i].length;j++){
                total += students2[i][j];
            }
            double ave = (double) total/3;
            System.out.println((i+1)+"번 학생의 총점 : "+total+", 평균 : "+ave);
        }
    }
}
