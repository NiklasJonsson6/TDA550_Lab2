package geometri;

import java.awt.*;

public class Circle extends GeometricalObject {

    public Circle(int x, int y, int diameter, Color color) throws IllegalPositionException {
        super(x, y, diameter, diameter, color, Math.pow(diameter / 2, 2) * Math.PI, diameter * Math.PI);
    }

    public Circle(GeometricalForm f, int diameter, Color color) throws IllegalPositionException {
        this(f.getX(), f.getY(), diameter, color);
    }
}