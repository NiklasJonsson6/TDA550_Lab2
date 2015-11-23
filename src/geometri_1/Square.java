package geometri;
import java.awt.*;

/**
 * Class describing a square
 * @author Niklas Jonsson
 *{@inheritDoc}
 */
public class Square extends GeometricalObject {

    /**
     * Creates a square
     *
     * @param x X-coordinate of the square (upper left corner)
     * @param y Y-coordinate of the square (upper left corner)
     * @param side Length of the square's side
     * @param c The color of the square
     * @throws IllegalPositionException if any coordinate becomes negative
     */
    public Square(int x, int y, int side, Color c) throws IllegalPositionException {

    }

    /**
     * Creates a square
     *
     * @param f The geometrical form to get the position from
     * @param side Length of the square's side
     * @param c The color of the square
     */
    public Square(GeometricalForm f, int side, Color c)n {

    }

    @Override
    public void fill(Graphics g) {

    }
}
