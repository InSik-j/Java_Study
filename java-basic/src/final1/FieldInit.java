package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;

    // final 필드를 필드에서 초기화하면 이미 값이 설정되었기 때문에
    // 생성자를 통해서도 초기화 할 수 없다.
    final int value = 10;

}
