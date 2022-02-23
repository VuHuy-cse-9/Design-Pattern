package Structural.Flyweight;

import java.util.Random;

public class ClientApplication {
    public void main() {
        int max = 10, min = 1;
        Random rand = new Random();
        Forest forest = new Forest();
        for (int i = 0; i < 50; ++i) {
            int x = rand.nextInt((max - min) + 1) + min;
            int y = rand.nextInt((max - min) + 1) + min;
            int name = rand.nextInt((max - min) + 1) + min;
            int color = rand.nextInt((max - min) + 1) + min;
            int texture = rand.nextInt((max - min) + 1) + min;
            forest.planTree(x, y, name, color, texture);
        }
        forest.draw(0);
    }
}
