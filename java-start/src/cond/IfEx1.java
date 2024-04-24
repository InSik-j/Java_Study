package cond;
//학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
//        90점 이상: "A"
//        80점 이상 90점 미만: "B"
//        70점 이상 80점 미만: "C"
//        60점 이상 70점 미만: "D"
//        60점 미만: "F"
//점수는 변수( int score )로 지정하고, 해당 변수를 기반으로 학점을 출력하자
public class IfEx1 {
    public static void main(String[] args) {
        int score = 30;
        if(score>=90){
            System.out.println("학점은 A 입니다.");
        }else if (score>=80) {
            System.out.println("학점은 B 입니다.");
        }else if (score>=70) {
            System.out.println("학점은 C 입니다.");
        }else if (score>=60) {
            System.out.println("학점은 D 입니다.");
        }else{
            System.out.println("학점은 D 입니다.");
        }
    }
}
