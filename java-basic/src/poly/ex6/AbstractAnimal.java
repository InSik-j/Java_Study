package poly.ex6;

// 추상 클래스
public abstract class AbstractAnimal {
    // 추상 메소드
    public abstract void sound();
    
    public void move(){
        System.out.println("동물이 이동합니다.");
    }
}
