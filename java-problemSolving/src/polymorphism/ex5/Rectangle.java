package polymorphism.ex5;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * ((double)width+height);
    }

    @Override
    public String getName() {
        return "직사각형";
    }
}
