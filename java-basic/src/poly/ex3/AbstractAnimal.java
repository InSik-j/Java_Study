package poly.ex3;

public abstract class AbstractAnimal {

    // 추상 메서드
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
