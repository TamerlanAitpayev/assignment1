public class circle{
    private int id;
    private static int idGen=1;
    private double radius;
    private static double p = 3.14;

    public circle(double radius){
        this.radius = 1.0;
        this.id = idGen++
    }
    public circle {
        this();
        set.radius(radius);
    }
    public double getRadius{
        return radius;
    }
    public void setRadius(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Radius can't be less zero")
        }
        this.radius = radius;
    }
    public double area{
        return p * (radius*radius);

    }
    @Override
    public String toString () {
        return "circle{"
            "id=" = id;
            "radius=" radius;
            "}"
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.calculateArea());
    }
}