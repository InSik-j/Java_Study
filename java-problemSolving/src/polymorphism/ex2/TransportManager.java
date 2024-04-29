package polymorphism.ex2;

public class TransportManager {
    public static void main(String[] args) {
        Transport[] transports = {new Car(), new Bicycle(), new Airplane()};

        for(Transport transport : transports){
            transport.move();
            transport.getSpeed();
        }
    }
}
