package forest;
public class Cylinder {
    // Data
    private double height, raduis;
    private double cArea = Math.PI * raduis * raduis;

    // Constructor
    public Cylinder(double height, double raduis) {
        this.height = height;
        this.raduis = raduis;

    }

    // Methods
    // areas of two circles plus flattend sides.
    public double area() {
        double rectangleArea = height * 2 * Math.PI * raduis;
        double cylinderArea = 2 * this.cArea + rectangleArea;
        return cylinderArea;
    }

    public double volume() {
        double volume = this.cArea * height;
        return volume;
    }

    public void setHeight(double height) {
        if (height >= 0)
            this.height = height;
    }

    public void setRaduis(double raduis) {
        if (raduis >= 0)
            this.raduis = raduis;
    }

    public double getHeight() {
        return this.height;
    }

    public double getRaduis() {
        return this.raduis;
    }
    public String toString(){
        return String.format("Cylinder. Height: %s, Radius: %s", height, raduis);
    }
}
