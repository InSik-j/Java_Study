package polymorphism.ex5;

public class Triangle extends Shape{
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = ((double) side1 + side2 + side3) / 2;
        return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public String getName() {
        return "삼각형";
    }
}
