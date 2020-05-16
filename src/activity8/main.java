package activity8;

public class main {
    public static void main(String[] argv) {
        Task t1 = new SimpleTask(new Money(50), 1);
        Task t2 = new SimpleTask(new Money(20), 6);

        ComplexTask complex = new SequentialTask();
        complex.addTask(t1);
        complex.addTask(t2);
        System.out.println(complex.durationInDays());
    }
}
