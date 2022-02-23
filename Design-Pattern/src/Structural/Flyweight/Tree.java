package Structural.Flyweight;

public class Tree {
    //Entrinsic attribute
    private int x;
    private int y;
    private TreeType treeType;
    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    
    }
    public void draw(int canvas) {
        System.out.println(">> Canvas x: " + this.x + " y: " + this.y);
        this.treeType.draw(canvas, x, y);
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }
    public TreeType getTreeType() {
        return this.treeType;
    }
}
