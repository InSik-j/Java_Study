package polymorphism.ex3;

import java.awt.*;

public class DrawShapes {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
