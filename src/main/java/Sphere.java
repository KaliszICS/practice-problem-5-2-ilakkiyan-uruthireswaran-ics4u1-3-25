public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public double area() {
        return 4.0 * Math.PI * Math.pow(getRadius(), 2);
    }
}
