package activity8;

import java.util.Observable;
import java.util.Observer;

public abstract class Task extends Observable {
    abstract Money costInEuros();
    abstract int durationInDays();
    abstract boolean hasFinalized();
}
