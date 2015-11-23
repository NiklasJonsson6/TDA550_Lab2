package geometri;
import java.awt.*;

/**
 * Class describing a rectangle
 * @author Niklas Jonsson
 *{@inheritDoc}
 */
public class Rectangle extends GeometricalObject {

    /**
     * Creates a rectangle
     *
     * @param x X-coordinate of the rectangle
     * @param y Y-coordinate of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param c Color of the rectangle
     * @throws IllegalPositionException if any coordinate becomes negative
     */
    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {

    }

    /**
     * Creates a rectangle
     *
     * @param f Geometrical form to get coordinates from
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param c Color of the rectangle
     */
    public Rectangle(GeometricalForm f, int width, int height, Color c) {

    }

    @Override
    public void fill(Graphics g) {

    }
}
