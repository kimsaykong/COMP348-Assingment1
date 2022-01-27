import java.util.Locale;

public class Circle extends PrintableObject implements Shape{

    private double radius;

    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static Circle parse(String input){
        // split by comma
        String[] parsedInput = input.split(",");
        double radius = Double.parseDouble(parsedInput[1]);
        // instantiate and return new Circle
        return new Circle(radius);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName().toUpperCase(Locale.ROOT);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString(){
        return getName() + ", " + this.radius;
    }
}
