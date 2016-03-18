package Shapes;

import java.awt.*;

final public class pTriangle extends pShape {

    Point Point1, Point2, Point3;

    public pTriangle (String name, Point point1, Point point2, Point point3, Color border, Color fill, int priority) {
        super (name,new Point ((point1.x + point2.x + point3.x)/3, (point1.y + point2.y + point3.y)/3), 0, border, fill, priority);
        this.Point1 = point1;
        this.Point2 = point2;
        this.Point3 = point3;
        this.A = Math.max(Math.max(point1.x, point2.x), point3.x) - Math.min(Math.min(point1.x, point2.x), point3.x);
        this.B = Math.max(Math.max(point1.y, point2.y), point3.y) - Math.min(Math.min(point1.y, point2.y), point3.y);
    }

}
