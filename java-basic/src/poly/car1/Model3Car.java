package poly.car1;

// 다형성을 할용하여 역할과 구현을 분리
public class Model3Car implements Car{

    @Override
    public void startEngine(){
        System.out.println("Model3Car.startEngine");
    }

    @Override
    public void offEngine(){
        System.out.println("Model3Car.offEngine");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("Model3Car.pressAccelerator");
    }
}
