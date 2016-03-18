package Shapes;

import java.awt.*;

final public class pCircle extends pShape {

    double Radius;

    public pCircle (String name, Point location, double radius, Color border, Color fill, int priority){
        super(name, location, 0, border, fill, priority);
        this.Radius = radius;
    }

}
