package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        System.out.println("== 단어 입력 단계 ==");
        while(true){
            System.out.print("영어 단어를 입력하세요 (종료 : 'q') : ");
            String keyInput = scan.nextLine();

            if(keyInput.equals("q")){
                break;
            }

            System.out.print("한글 뜻을 입력하세요 : ");
            String valueInput = scan.nextLine();

            map.put(keyInput,valueInput);
        }

        System.out.println("== 단어 검색 단계 ==");
        while (true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료 : 'q'): ");
            String keyInput = scan.nextLine();

            if(keyInput.equals("q")){
                break;
            }

            if(map.containsKey(keyInput)){
                System.out.println(keyInput+"의 뜻 : "+map.get(keyInput));
            }else {
                System.out.println(keyInput+"은(는) 사전에 없는 단어 입니다.");
            }


        }

    }
}
