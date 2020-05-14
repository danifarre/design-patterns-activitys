package activity4;

public class SequentialTask extends ComplexTask {
    @Override
    public int durationInDays() {
        int acc = 0;
        for (Task task : this.subTasks) {
            acc += task.durationInDays();
        }
        return acc;
    }
}
