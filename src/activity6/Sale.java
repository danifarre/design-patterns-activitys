package activity6;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Sale extends Observable {

    SLI sli;
    private List<SLI> lines = new ArrayList<>();

    public void createSalesLineItem(ProductDescription desc, int quantity) {
        sli = new SLI(desc, quantity);
        this.lines.add(sli);
        setChanged();
        notifyObservers(); // pull
        //notifyObservers(sli); push
        // No podem fer un print, ja que aquesta capa no es pot contactar amb la capa final
    }

    public int total() {
        return 0;
    }

    public SLI lastAdded() {
        return this.lines.get(this.lines.size() - 1);
    }
}
