package lab_1;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
       this.height=height;
       this.width=width;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width=width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

}
