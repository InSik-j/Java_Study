package root;


//문제: 피라미드 출력
//int rows 를 선언해라.
//이 수만큼 다음과 같은 피라미드를 출력하면 된다.
//        참고: println() 은 출력후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 print() 를 사용하면 된다.
//예) System.out.print("*")
//출력 형태 ```
//        //rows = 2
//        *
//        **
////rows = 5
//        *
//        **
//        ***
//        ****
//        *****

public class RootEx5 {
    public static void main(String[] args) {
        int rows = 5;

        for(int i=1; i<=rows;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<rows; i++){
            for(int space=i; space<rows-1;space++){
                System.out.print(" ");
            }
            for (int star=0; star<i*2+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=rows-1; i>0; i--) {
            for (int j=rows-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j=i*2-1; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=rows;i++){
            for(int space=i;space<=rows-1;space++){
                System.out.print(" ");
            }
            for(int star=1; star<i*2;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows-1;i>0;i--){
            for(int space=rows-i;space>0;space--){
                System.out.print(" ");
            }
            for(int space=i*2-1; space>0; space--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
