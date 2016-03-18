package Shapes;

import java.awt.*;

final public class pRectangle extends pShape {

    public pRectangle (String name, Point location, double a, double b, Color border, Color fill, int priority) {
        super(name, location, 0, border, fill, priority);
        this.A = a;
        this.B = b;
    }

}
