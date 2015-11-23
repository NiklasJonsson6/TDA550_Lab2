package geometri;
import java.awt.*;

/**
 * Abstract class to describe geometrical objects
 * @author Niklas Jonsson
 *{@inheritDoc}
 */
public abstract class GeometricalObject implements GeometricalForm {
    //Variables
    private int x, y, height, width;
    private Color c;
    private double area;
    private double perimeter;

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

    }

    //Methods
    public int compareTo(GeometricalForm f) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {

    }

    public int getX() {

    }

    public int getY() {

    }

    public int getArea() {

    }

    public int getPerimeter() {

    }

    public Color getColor() {

    }

    public int getWidth() {

    }

    public int getHeight() {

    }

    public void move(int dx, int dy) {

    }

    public void place(int x, int y) {

    }
}
