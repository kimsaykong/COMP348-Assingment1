public class Rectangle extends PrintableObject implements Shape{

    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public static Rectangle parse(String input) {
        // split by comma
        String[] parsedInput = input.split(",");
        double side1 = Double.parseDouble(parsedInput[1]);
        double side2 = Double.parseDouble(parsedInput[2]);
        // instantiate and return new Rectangle
        return new Rectangle(side1, side2);
    }

    @Override
    public double getPerimeter() {
        return 2*(this.getWidth()+this.getHeight());
    }

    @Override
    public double getArea() {
        return this.getHeight()*this.getWidth();
    }

    @Override
    public String toString() {
        return getName()+","+this.getHeight()+","+this.getWidth();
    }
}
