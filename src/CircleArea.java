public class CircleArea {
    double radius = 1;
    String color = "red";

    public CircleArea() {
    }
    public CircleArea(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return (Math.PI*Math.pow(radius,2));
    }
}


