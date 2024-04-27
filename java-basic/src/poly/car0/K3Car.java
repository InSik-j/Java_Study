package poly.car0;

// 다형성을 사용하지 않고, 역할과 구현을 분리 X
public class K3Car {
    public void startEngine(){
        System.out.println("K3Car.startEngine");
    }

    public void offEngine(){
        System.out.println("K3Car.offEngine");
    }

    public void pressAccelerator(){
        System.out.println("K3Car.pressAccelerator");
    }
}
