package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        // 코드 작성
        // 오토 박싱, 오토 언박싱을 사용해서 변환
        
        // String str 을 Integer 로 변환
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = "+ integer1);

        // Integer 를 int 로 변환
        int intValue = integer1;
        System.out.println("intVlaue = "+ intValue);

        // int 를 Integer 로 변환
        Integer integer2 = intValue;
        System.out.println("integer2 = "+ integer2);
    }
}
