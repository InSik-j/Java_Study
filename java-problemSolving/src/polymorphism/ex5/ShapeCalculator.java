package polymorphism.ex5;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(5, 10), new Triangle(5, 5, 5)};
        printAreaPer(shapes);
    }

    private static void printAreaPer(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.getName()+"의 넓이 : " + shape.getArea());
            System.out.println(shape.getName()+"의 둘레 : "+shape.getPerimeter());
        }
    }
}
