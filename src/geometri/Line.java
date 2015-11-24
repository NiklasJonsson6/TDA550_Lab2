package geometri;

import java.awt.*;

/**
 * Class describing a line
 * @author Niklas Jonsson and Daniel Hesslow
 *{@inheritDoc}
 */
public class Line extends GeometricalObject {

    //since we just save the height and the width plus the upper left corner
    //our line can either go from the upper left to the bottom right corner
    //or from the lower left to the upper right corner
    //this boolean keeps track of that.
    private boolean positiveInclination;

    /**
     * Creates a line
     *
     * @param x1 X-coordinate of the line's starting point
     * @param y1 Y-coordinate of the line's starting point
     * @param x2 X-coordinate of the line's ending point
     * @param y2 Y-coordinate of the line's ending point
     * @param c Color of the line
     * @throws IllegalPositionException if any coordinate becomes negative
     */
    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {}

    /**
     * Creates a line
     *
     * @param f1 The geometrical form to get the starting point from
     * @param f2 The geometrical form to get the ending point from
     * @param c Color of the line
     */
    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {

    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {}

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode(){}
}
