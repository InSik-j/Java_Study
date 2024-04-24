package root;

//문제: 자연수 출력
//처음 10개의 자연수를 출력하는 프로그램을 작성해 보세요. 이때, count 라는 변수를 사용해야 합니다.
//while문, for문 2가지 버전의 정답을 만들어야 합니다

public class RootEx1 {
    public static void main(String[] args) {
        int count = 1;

        while (count<=10){
            System.out.println("while- "+count);
            count++;
        }

        for(count=1; count<=10;count++){
            System.out.println("for- "+count);
        }
    }
}
