package geometri;

import java.awt.*;

public abstract class GeometricalObject implements GeometricalForm {
    //Variables
    private int x, y, height, width;
    private Color color;
    private double area;
    private double perimeter;

    protected GeometricalObject(int x, int y, Color color, double area, double perimeter) {

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
