package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {
        // 모든 ENUM 반환
        Grade[] vlaues = Grade.values();
        System.out.println("vlaues = "+ Arrays.toString(vlaues));
        for(Grade vlaue : vlaues){
            System.out.println("name = "+ vlaue.name()+", ordinal = "+ vlaue.ordinal());
        }

        //String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = "+gold); //toString() 오버라이딩 가능
    }


}
