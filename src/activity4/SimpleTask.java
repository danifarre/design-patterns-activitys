package activity4;

public class SimpleTask implements Task {

    private final Money cost;
    private final int durationInDays;

    public SimpleTask(Money cost, int durationInDays) {
        this.cost = cost;
        this.durationInDays = durationInDays;
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
