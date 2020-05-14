package activity4;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplexTask implements Task {

    protected List<Task> subTasks = new ArrayList<>();

    public void addTask(Task task) {
        this.subTasks.add(task);
    }

    @Override
    public Money costInEuros() {
        Money accum = new Money(0);
        for (Task task : this.subTasks) {
            accum = accum.add(task.costInEuros());
        }
        return accum;
    }
}
