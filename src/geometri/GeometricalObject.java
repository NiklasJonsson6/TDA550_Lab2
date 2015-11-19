package geometri;

import java.awt.*;

public abstract class GeometricalObject implements GeometricalForm{
    //Variables
    private int x, y;
    private Color color;
    private double area;
    private double perimeter;

    protected GeometricalObject(int x, int y, Color color, double area, double perimeter) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
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
        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getArea() {
        return (int)area;
    }

    public int getPerimeter() {
        return (int)perimeter;
    }

    public Color getColor() {
        return color;
    }

    public void move(int dx, int dy) {

    }

    public void place(int x, int y) {

    }

    public void fill(Graphics g) {

    }
}
