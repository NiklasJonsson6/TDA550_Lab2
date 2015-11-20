package geometri;

import java.awt.*;

public abstract class GeometricalObject implements GeometricalForm{
    //Variables
    private int x, y, height, width;
    private Color color;
    private double area, perimeter;

    protected GeometricalObject(int x, int y, int height, int width, Color color, double area, double perimeter) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
        this.height = height;
        this.width = width;
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

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void move(int dx, int dy) {

    }

    public void place(int x, int y) {

    }

    public void fill(Graphics g) {

    }
}
