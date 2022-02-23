package Structural.Adapter;

/**
 * RoundHole
 */
public class RoundHole {
    private float radius;
    public RoundHole(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg peg) {
        //Check if Object fit the hold
        return this.getRadius() >= peg.getRadius();
    }
}