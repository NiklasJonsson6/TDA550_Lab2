package geometri;

import java.awt.*;

/**
 * Class describing a point
 * @author Niklas Jonsson and Daniel Hesslow
 *{@inheritDoc}
 */
public class Point extends GeometricalObject {

    /**
     * Creates a point
     *
     * @param x X-coordinate of the point
     * @param y Y-coordinate of the point
     * @param c The color of the point
     * @throws IllegalPositionException if any coordinate becomes negative.
     */
    public Point(int x, int y, Color c) throws IllegalPositionException {

    }

    /**
     * Creates a point
     *
     * @param f The geometrical form to get the position from
     * @param c The color of the point
     */
    public Point(GeometricalForm f, Color c) {

    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {}
}
