package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {
    private static List<TreeType> treeTypes;
    public static TreeType getTreeType(int name, int color, int texture) {
        if (treeTypes != null) {
            for (TreeType e : treeTypes) {
                if (e.getName() == name &&
                    e.getColor() == color &&
                    e.getTexture() == texture) {
                        return e;
                    }
            }
        } 
        else {
            treeTypes = new ArrayList<>();
        }
        TreeType newTreeType = new TreeType(name, color, texture);
        treeTypes.add(newTreeType);
        return newTreeType;
    }
}
