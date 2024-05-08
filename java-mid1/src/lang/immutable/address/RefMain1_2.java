package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울"); // x001
        Address b = new Address("서울"); // x002
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        b.setValue("부산"); // b의 값을 부산으로 변경
        System.out.println("부산 -> b");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);

        // 사이드 이펙트 해결 방안 1
        // - 서로 다른 인스턴스를 참조
    }
}
