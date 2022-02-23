package Structural.Adapter;

public class ClientApplication {
    public void main() {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println("Round peg fit: " + hole.fits(rpeg));

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        //hole.fits(small_sqpeg); //Won't compatible.

        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        System.out.println("Small square fit: " + hole.fits(small_sqpeg_adapter));
        System.out.println("Large sqaure fit: " + hole.fits(large_sqpeg_adapter));
    }
}
