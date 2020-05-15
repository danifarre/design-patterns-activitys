package activity6;

import java.util.Observable;
import java.util.Observer;

public class SaleObserver implements Observer {
    //pull
    @Override
    public void update(Observable observable, Object o) {
        Sale sale = (Sale) o;
        String descriptiom = sale.lastAdded().getDesc().getDescription();
        int price = sale.lastAdded().getDesc().getPrice();
        System.out.println(descriptiom + price);
    }

    /* push
    @Override
    public void update(Observable observable, Object o) {
        SLI sli = (SLI) o;
        System.out.println(sli);
    }
     */
}
