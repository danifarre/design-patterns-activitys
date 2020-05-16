package activity6;

import java.util.Observer;

public class Register { // use-case controller

    private Store store;
    private Sale currentSale;

    public Register(Store store) {
        this.store = store;
    }

    public void createNewSale(Observer saleObserver) {
        this.currentSale = new Sale();
        this.currentSale.addObserver(saleObserver);
    }
}
