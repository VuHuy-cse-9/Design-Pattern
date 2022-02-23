package Structural.Adapter;

/**
 * SquarePegAdapter 
 */
public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0.0f);
        this.peg = peg;
    }

    public float getRadius() {
        return this.peg.getWidth() * (float)Math.sqrt(2) / 2;
    }
}