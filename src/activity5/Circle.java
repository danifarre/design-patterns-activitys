package activity5;

public class Circle extends Figure {

    private float r;

    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }

    public Circle(Circle other) {
        super(other);
        this.r = other.r;
    }

    @Override
    public Circle copy() {
        // public Figure copy(), podria ser, però s'hauria de fer un cast

        return new Circle(this);
    }
}
