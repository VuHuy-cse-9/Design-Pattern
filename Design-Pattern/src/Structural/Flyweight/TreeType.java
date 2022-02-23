package Structural.Flyweight;

public class TreeType {
    //Intrinsic attribute
    private int name;
    private int color;
    private int texture;
    public TreeType(int name, int color, int texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }
    public void draw(int canvas, int x, int y) {
        System.out.println("name: " + name + " color: " + color + " texture: " + texture);
    }

    public int getName() {
        return this.name;
    }
    public int getColor() {
        return this.color;
    }
    public int getTexture() {
        return this.texture;
    }
    public void setName(int name) {
        this.name = name;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public void setTexture(int texture) {
        this.texture =texture;
    }
}
