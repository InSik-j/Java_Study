package polymorphism.ex2;

public class Car extends Transport {
    @Override
    public void move(){
        System.out.println("도로를 달린다");
    }
    @Override
    public int getSpeed(){
        System.out.println("속도 : 150 km/h");
        return 150;
    }
}
