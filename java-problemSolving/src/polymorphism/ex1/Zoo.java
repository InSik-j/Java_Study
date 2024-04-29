package polymorphism.ex1;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Duck()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
