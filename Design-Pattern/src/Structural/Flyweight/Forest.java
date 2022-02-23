package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees;
    public Forest() {
        this.trees = new ArrayList<>();
    }
    public void planTree(int x, int y, int name, int color, int texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        this.trees.add(tree);
    }

    public void draw(int canvas) {
        for (Tree tree : this.trees) {
            tree.draw(canvas);
        }
    }
}
