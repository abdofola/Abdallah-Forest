package forest;
public class Cone {
    // Data
    private double height, radius;

    // Constructor
    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // Methods
    public double area() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double volume() {
        return Math.PI * radius * radius * height / 3.0;
    }

    public void setHeight(double height) {
        if (height >= 0)
            this.height = height;
    }
    public void setRadius(double radius) {
        if (radius >= 0)
            this.radius = radius;
    }
    public double getHeight() {
        return this.height;
    }
    public double getRaduis() {
        return this.radius;
    }
    public String toString(){
        return String.format("Cone. Height: %s, Radius: %s", height, radius);
    }
}
