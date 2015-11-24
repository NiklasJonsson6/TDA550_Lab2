package geometri;

import java.awt.*;

/**
 * Abstract class to describe geometrical objects
 * @author Niklas Jonsson and Daniel Hesslow
 *{@inheritDoc}
 */
public abstract class GeometricalObject implements GeometricalForm
{
    //Variables
    private int x, y, height, width;
    private Color c;
    private double perimeter,area;

    //Constructors
    /**
     * Creates a geometrical object defined by common parameters.
     *
     * @param x X-coordinate of the geometrical object (upper left corner)
     * @param y Y-coordinate of the geometrical object (upper left corner)
     * @param c The color of the geometrical object
     * @param area The area of the geometrical object
     * @param perimeter The perimeter of the geometrical object
     */
    protected GeometricalObject(int x, int y, Color c, double area, double perimeter) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.area = area;
        this.perimeter = perimeter;
    }

    //Methods

    /**
     * {@inheritDoc}
     */
    public int compareTo(GeometricalForm f) {
        //If this and f are the same object
        if (this == f) {
            return 0;
        }
        //Compare area first
        if (this.getArea() < f.getArea()) {
            return -1;
        }
        if (this.getArea() > f.getArea()) {
            return 1;
        }
        //Compare perimeter second
        if (this.getPerimeter() < f.getPerimeter()) {
            return -1;
        }
        if (this.getPerimeter() > f.getPerimeter()) {
            return 1;
        }
        //Different objects, everything equal
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        String hc = this.getClass() + " " + this.getColor() + " " + this.getArea()
                + " " + this.getWidth() + " " + this.getHeight() + " " + this.getPerimeter();

        return Integer.parseInt(hc);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getX() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY() {}

    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor() {}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getWidth() {}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getHeight(){}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter(){}


    /**
     * {@inheritDoc}
     */
    @Override
    public void move(int dx, int dy) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void place(int x, int y) {}
}
