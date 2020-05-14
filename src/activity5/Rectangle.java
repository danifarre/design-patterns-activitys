package activity5;

public class Rectangle extends Figure {

    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other) {
        super(other);
        this.height = other.height;
        this.width = other.width;
    }

    @Override
    public Figure copy() {
        return new Rectangle(this);
    }
}
