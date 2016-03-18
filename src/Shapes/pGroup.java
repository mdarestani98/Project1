package Shapes;

import java.util.ArrayList;

final public class pGroup extends pShape {

    ArrayList<pShape> Shapes = new ArrayList<>();

    public pGroup (String name) {
        this.Name = name;
        this.Location = null;
        this.Border = null;
        this.Fill = null;
    }

    public boolean add (pShape shape) {
        Shapes.add(shape);
        shape.setGroup(Shapes.size());
        return true;
    }
}
