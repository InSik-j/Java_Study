package polymorphism.ex2;

public class Bicycle extends Transport {
    @Override
    public void move(){
        System.out.println("자전거 길을 달린다.");
    }
    @Override
    public int getSpeed(){
        System.out.println("속도 : 50 km/h");
        return 50;
    }
}
