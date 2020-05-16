package activity8;

public class ParallelTask extends ComplexTask {
    @Override
    public int durationInDays() {
        int acc = 0;
        for (Task task : this.subTasks) {
            acc = Math.max(acc, task.durationInDays());
        }
        return acc;
    }
}
