package lang.immutable.address;

// 사이드 이펙트가 발생한 예제
public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        change(b, "부산"); // b의 값을 부산으로 변경
        System.out.println("부산 -> b");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
    }

    private  static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경 합니다. -> "+changeAddress);
        address.setValue(changeAddress);
    }
}
