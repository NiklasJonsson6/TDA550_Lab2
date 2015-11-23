package geometri;
import java.awt.*;

/**
 * Class describing an oval
 * @author Niklas Jonsson
 *{@inheritDoc}
 */
public class Oval extends GeometricalObject {

    /**
     * Creates an oval
     *
     * @param x X-coordinate of the oval (upper left corner)
     * @param y Y-coordinate of the oval (upper left corner)
     * @param width The width of the oval
     * @param height The height of the oval
     * @param c The color of the oval
     * @throws IllegalPositionException if any coordinate becomes negative.
     */
    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {

    }

    /**
     * Creates an oval
     *
     * @param f The geometrical form to get the position from
     * @param width The width of the oval
     * @param height The height of the oval
     * @param c The color of the oval
     */
    public Oval(GeometricalForm f, int width, int height, Color c) {

    }

    @Override
    public void fill(Graphics g) {

    }
}
