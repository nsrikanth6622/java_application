

import org.example.OrderCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderCalculatorTest {

    @Test
    void shouldCalculateOrderTotal() {

        OrderCalculator calculator =
                new OrderCalculator();

        double total =
                calculator.calculateTotal(100.0, 2);

        assertEquals(300.0, total);
    }
}