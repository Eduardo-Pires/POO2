package P1prep.src.prototype;

import java.util.Objects;

public class Circle extends Shape{
    public int radius;

    public Circle(){}

    public Circle (Circle target)
    {
        super(target);
        if (target != null)
        {
            this.radius = target.radius;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
       if(!(o instanceof Circle) || !super.equals(o)) return false;
       Circle shape2 = (Circle) o;
       return shape2.radius == radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
