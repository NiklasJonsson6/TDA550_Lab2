package geometri;

import java.awt.*;

public class Line extends GeometricalObject {
    private int x2, y2;

    public Line(int x1, int y1, int x2, int y2, Color color) throws IllegalPositionException {
        super(x1, y1, color, 0, Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color color) throws IllegalPositionException {
        this(f1.getX(), f1.getY(), f2.getX(), f2.getY(), color);
    }

    public int getHeight() {
        if(getY() - y2 < 0) {
            return (getY() - y2) * -1;
        }
        return getY() - y2;
    }

    public int getWidth() {
        if(getX() - x2 < 0) {
            return (getX() - x2) * -1;
        }
        return getX() - x2;
    }
}
