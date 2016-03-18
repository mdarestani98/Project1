package Shapes;

import java.awt.*;

final public class pPolygon extends pShape {

    int N;
    double Length;

    public pPolygon (String name, int n, Point location, double length, Color border, Color fill, int priority) {
        super (name, location, 0, border, fill, priority);
        this.N = n;
        this.Length = length;

    }

}
