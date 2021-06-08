package forest;
public class Tree {

    // Data
    private Cone branches;
    private Cylinder trunk;
    private double x, y, z;

    // Constructor
    public Tree(double bHeight, double bRadius, double tHeight, double tRadius, double x, double y, double z) {
        this.branches = new Cone(bHeight, bRadius);
        this.trunk = new Cylinder(tHeight, tRadius);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Methods
    public double volume() {
        return branches.volume() + trunk.volume();
    }

    public double area() {
        double total = branches.area() + trunk.area();
        double rad = trunk.getRaduis();
        double circle = Math.PI * rad * rad;
        return total - 2 * circle;
    }

    public void grow(double rate) {
        double grow = rate + 1;
        double bRadius = this.branches.getRaduis() * grow;
        double bHeight = this.branches.getHeight() * grow;
        double tRadius = this.trunk.getHeight() * grow;
        double tHeight = this.trunk.getRaduis() * grow;

        this.branches.setRadius(bRadius);
        this.branches.setHeight(bHeight);
        this.trunk.setRaduis(tRadius);
        this.trunk.setHeight(tHeight);
    }

    public Cone getCone() {
        return branches;
    }

    public Cylinder getCylinder() {
        return trunk;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public String toString() {
        double totalHeight = trunk.getHeight() + branches.getHeight();
        double width = branches.getRaduis();
        return String.format("Tree Height: %s, Width: %s, Volume: %s", totalHeight, width, this.volume());
    }
}
