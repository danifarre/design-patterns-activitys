package activity8;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class ComplexTask extends Task implements Observer {

    protected List<Task> subTasks = new ArrayList<>();

    public void addTask(Task task) {
        this.subTasks.add(task);
        task.addObserver(this);
    }

    @Override
    public Money costInEuros() {
        Money accum = new Money(0);
        for (Task task : this.subTasks) {
            accum = accum.add(task.costInEuros());
        }
        return accum;
    }

    @Override
    public boolean hasFinalized() {
        for (Task subTask : subTasks) {
            if (!subTask.hasFinalized()) return false;
        }
        return true;
    }

    @Override
    public void update(Observable o, Object args) {
        if (hasFinalized()) {
            setChanged();
            notifyObservers();
        }
    }

    @Override
    public String toString() {
        return "ComplexTask{" +
                "subTasks=" + subTasks +
                '}';
    }
}
