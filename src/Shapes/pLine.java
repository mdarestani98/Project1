package Shapes;

import java.awt.*;

final public class pLine extends pShape {

    Point Point1, Point2;

    public pLine (String name, Point point1, Point point2, Color border, int priority) {
        super(name, new Point ((point1.x + point2.x)/2, (point1.y + point2.y)/2), 0, border, null, priority);
        this.Point1 = point1;
        this.Point2 = point2;
    }

}
