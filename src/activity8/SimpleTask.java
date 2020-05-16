package activity8;

import java.util.Observable;

public class SimpleTask extends Task {

    private final Money cost;
    private final int durationInDays;
    private boolean finalized;

    public SimpleTask(Money cost, int durationInDays) {
        this.cost = cost;
        this.durationInDays = durationInDays;
        this.finalized = false;
    }

    public void finalizeTask() {
        if (!this.finalized) {
            this.finalized = true;
            setChanged();
            notifyObservers(this);
        }
    }

    @Override
    public boolean hasFinalized() {
        return this.finalized;
    }

    @Override
    public Money costInEuros() {
        return this.cost;
    }

    @Override
    public int durationInDays() {
        return this.durationInDays;
    }

    @Override
    public String toString() {
        return "SimpleTask{" +
                "cost=" + cost +
                ", durationInDays=" + durationInDays +
                '}';
    }
}
