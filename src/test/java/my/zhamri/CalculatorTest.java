package my.zhamri;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void add_shouldReturnSum() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(3, 3));
    }
}
