package forest;
import java.util.*;

public class Forest {

    // Data
    private Tree tree0 = null, tree1 = null, tree2 = null, tree3 = null;

    // Constructor: default

    // Mehtods
    public Tree getTree(int treeNum) {
        boolean inRange = treeNum >= 0 && treeNum <= 3;
        if (inRange && treeNum == 0)
            return tree0;
        else if (inRange && treeNum == 1)
            return tree1;
        else if (inRange && treeNum == 2)
            return tree2;
        else if (inRange && treeNum == 3)
            return tree3;

        return null;
    }

    public void setTree(int treeNum, Tree tree) {
        Scanner scan = new Scanner(System.in);
        boolean inRange = treeNum >= 0 && treeNum <= 3;
        while (!inRange) {
            System.out.println("Enter number in range 0 to 3");
            treeNum = scan.nextInt();
            inRange = treeNum >= 0 && treeNum <= 3;
        }
        if (treeNum == 0)
            tree0 = tree;
        else if (treeNum == 1)
            tree1 = tree;
        else if (treeNum == 2)
            tree2 = tree;
        else if (treeNum == 3)
            tree3 = tree;
    }

    public double area() {
        double area = 0.0;
        if (tree0 != null)
            area += tree0.area();
        if (tree1 != null)
            area += tree1.area();
        if (tree2 != null)
            area += tree2.area();
        if (tree3 != null)
            area += tree3.area();
        return area;
    }

    public double volume() {
        double volume = 0.0;
        if (tree0 != null)
            volume += tree0.volume();
        if (tree1 != null)
            volume += tree1.volume();
        if (tree2 != null)
            volume += tree2.volume();
        if (tree3 != null)
            volume += tree3.volume();
        return volume;

    }

    public String toString() {
        boolean noTree = (tree0 == null && tree1 == null && tree2 == null && tree3 == null);
        String str = "Forest:\n";
        if (noTree)
            return "No tree was found!";

        else if (tree0 != null)
            str += "Tree 0: " + tree0.toString() + "\n";
        if (tree1 != null)
            str += "Tree 1: " + tree1.toString() + "\n";
        if (tree3 != null)
            str += "Tree 2: " + tree2.toString() + "\n";
        if (tree3 != null)
            str += "Tree 3: " + tree3.toString() + "\n";
        String vol = "Volume: " + volume();
        String area = "Area: " + area()+", ";
        str += area + vol;

        return str;

    }
}
