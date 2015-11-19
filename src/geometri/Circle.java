package geometri;

import java.awt.*;

public class Circle extends GeometricalObject {
    private int diameter;

    public Circle(int x, int y, int diameter, Color color) throws IllegalPositionException {
        super(x, y, color, Math.pow(diameter / 2, 2) * Math.PI, diameter * Math.PI);
        this.diameter = diameter;
    }

    public Circle(GeometricalForm f, int diameter, Color color) throws IllegalPositionException {
        this(f.getX(), f.getY(), diameter, color);
    }

    public int getWidth() {
        return diameter;
    }

    public int getHeight() {
        return diameter;
    }
}