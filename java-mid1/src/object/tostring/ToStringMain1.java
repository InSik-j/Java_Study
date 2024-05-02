package object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        // toString() : 기본적으로 클래스 정보와 참조값을 제공

        Object object = new Object();
        String string = object.toString();

        // toString() 반환값 출력
        System.out.println(string);

        // object 직접 출력
        System.out.println(object);
    }
}
