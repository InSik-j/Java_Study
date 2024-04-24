package variable;
/*
문제1
다음 코드에 반복해서 나오는 숫자 4 , 3 을 다른 숫자로 한번에 변경할 수 있도록 다음을 변수 num1 , num2 를 사용하
도록 변경해보세요.
VarEx1
```java
package variable.ex;
public class VarEx1Question {
 public static void main(String[] args) {
 System.out.println(4 + 3);
 System.out.println(4 - 3);
 System.out.println(4 * 3);
 }
}
```
* */
public class VarEx1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
    }
}
