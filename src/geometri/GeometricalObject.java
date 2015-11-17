package geometri;

import javax.swing.text.Position;
import java.awt.*;

public abstract class GeometricalObject implements GeometricalForm{
    //Variables
    private Position position;
    private Color color;
    private int area;
    private int circumference;

    //Methods
    public int compareTo(GeometricalForm f) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }


}
