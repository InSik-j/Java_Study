package root;
//문제: 구구단 출력
//중첩 for문을 사용해서 구구단을 완성해라.
//출력 형태
//1 * 1 = 1
//1 * 2 = 2
//...
//9 * 9 = 81
public class RootEx4 {
    public static void main(String[] args) {
        for(int i=1; i<10;i++){
            for(int j=1; j<10; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}
