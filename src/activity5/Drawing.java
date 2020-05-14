package activity5;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure {

    private List<Figure> components;

    public Drawing(float x, float y) {
        super(x, y);
        this.components = new ArrayList<>();
    }
    /*
    Incorrecte, ja que si s'afegissin figures a la llista en una còpia,
    en l'altre dibuix, també s'afegirien aquestes figures

    public Drawing(Drawing other) {
        super(other);
        this.component = other.component;
    }

    Incorrecte, ja que les figures es compartirien, siuposant que fossin mutables
    public Drawing(Drawing other) {
        super(other);
        this.components = new ArrayList<>();
        for (Figure component : this.components) {
            this.components.add(component);
        }
    }
    */

    public Drawing(Drawing other) {
        super(other);
        this.components = new ArrayList<>();
        for (Figure component : this.components) {
            this.components.add(component.copy());
        }
    }

    @Override
    public Figure copy() {
        return new Drawing(this);
    }

    public void addFigure(Figure figure) {
        this.components.add(figure);
    }
}
