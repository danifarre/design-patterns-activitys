package activity8;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Money {

    private static final MathContext mc = new MathContext(2, RoundingMode.HALF_UP);

    private final String currency = "EUR";
    private final BigDecimal quantity;

    public Money(int quantity) {
        this.quantity = new BigDecimal(quantity, mc);
    }

    private Money(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Money add(Money other) {
        return new Money(this.quantity.add(other.quantity));
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
