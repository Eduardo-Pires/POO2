package P1prep.src.prototype;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){}
    public Shape(Shape target)
    {
        if (target != null)
        {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Shape)) return false;
        Shape shape2 = (Shape) obj2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
