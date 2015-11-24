package geometri;

import java.awt.*;

/**
 * Class describing a circle
 * @author Niklas Jonsson and Daniel Hesslow
 *{@inheritDoc}
 */
public class Circle extends Oval {

    /**
     * Creates a circle
     *
     * @param x X-coordinate of the circle (upper left corner)
     * @param y Y-coordinate of the circle (upper left corner)
     * @param diameter Diameter of the circle
     * @param c Color of the circle
     * @throws IllegalPositionException if any coordinate becomes negative
     */
    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {}

    /**
     * Creates a circle
     *
     * @param f The geometrical form to get the coordinates from
     * @param diameter The diameter of the circle
     * @param c The color of the circle
     */
    public Circle(GeometricalForm f, int diameter, Color c) {}
}