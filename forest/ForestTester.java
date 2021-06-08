package forest;
public class ForestTester {
    public static void main(String[] args) {
        Forest myForest = new Forest();

        double trunkR = 1.0, trunkH = 1.0, branchR = 8.0, branchH = 10.0;
        Tree tree = new Tree(trunkH, trunkR, branchH, branchR, 1, 2, 3);
        myForest.setTree(0, tree);
        trunkR = 1.4;
        trunkH = 2.0;
        branchR = 15.0;
        branchH = 30.0;
        tree = new Tree(trunkH, trunkR, branchH, branchR, 5, 8, 0);
        myForest.setTree(1, tree);
        
        System.out.println(myForest);
    }
}
