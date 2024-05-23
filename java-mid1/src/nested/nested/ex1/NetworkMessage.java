package nested.nested.ex1;

// 정적 중첩 클래스로 리팩토링 전

// Network 객체 안에서만 사용
public class NetworkMessage {
    private String content;

    public NetworkMessage(String content){
        this.content = content;
    }

    public void print(){
        System.out.println(content);
    }
}
