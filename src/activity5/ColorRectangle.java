package activity5;

import java.awt.*;

public class ColorRectangle extends Rectangle {

    private Color c;

    public ColorRectangle(float x, float y, float width, float height, Color c) {
        super(x, y, width, height);
        this.c = c;
    }

    public ColorRectangle(ColorRectangle other) {
        super(other);
        this.c = other.c;
    }

    @Override
    public ColorRectangle copy() {
        return new ColorRectangle(this);
    }
}
