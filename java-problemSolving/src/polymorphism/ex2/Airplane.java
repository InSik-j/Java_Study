package polymorphism.ex2;

public class Airplane extends Transport {
    @Override
    public void move(){
        System.out.println("하늘을 난다.");
    }
    @Override
    public int getSpeed(){
        System.out.println("속도 : 500 km/h");
        return 100;
    }
}
