package lab_1;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius;
    }
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius=radius;
    }
}
