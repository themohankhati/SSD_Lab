package lab_1;

public class Driver {
    public static void main(String[] args)
    {
        Rectangle rectangle=new Rectangle(2.2,2.2);
        System.out.println(rectangle.getArea());

        Circle circle= new Circle(2.2);
        System.out.println(circle.getArea());

        Ellipse ellipse= new Ellipse(22.2, 3.3);
        System.out.println(ellipse.getArea());

    }
}
