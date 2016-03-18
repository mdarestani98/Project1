package Shapes;

import java.awt.*;

public abstract class pShape {

    String Name;
    Point Location;
    double Rotate;
    Color Border, Fill;
    int Priority;
    double A, B;
    int Group;

    public pShape () {
        this ("NoName", null, 0, null, null, 0);
    }

    public pShape (String name, Point location, double rotate, Color border, Color fill, int priority) {
        this.Name = name;
        this.Location = location;
        this.Rotate = rotate;
        this.Border = border;
        this.Fill = fill;
        this.Priority = priority;
    }

    public void setGroup(int group) { this.Group = group; }

}