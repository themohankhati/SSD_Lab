package lab_1;

public class Ellipse extends Rectangle {

    //constructor needed in rectangle
    public Ellipse(double width, double height)
    {
        super(width,height);
    }

    @Override
    public String toString() {
        System.out.println(getWidth()+getHeight());
        return null;
    }

    @Override
    public double getArea() {
        return Math.PI * getWidth() *getHeight()/4;
    }
}
