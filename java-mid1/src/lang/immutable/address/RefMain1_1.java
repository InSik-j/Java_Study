package lang.immutable.address;

// 참조형 예제 1
public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        b.setValue("부산"); // b의 값을 부산으로 변경
        System.out.println("부산 -> b");
        System.out.println("a : "+ a); // *사이드 이펙트 발생
        System.out.println("b : "+ b);

        // * 사이드 이펙트
        //   - 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것
        //   - 위의 예제에선 b값을 변경했지만 같은 인스턴스를 참조하여
        //     a값도 변경되는 사이드 이펙트가 발생함
    }
}
