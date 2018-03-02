import java.util.concurrent.atomic.AtomicLong;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CounterImplTest {
    @Test
    public void counts_upwards() throws Exception {
        AtomicLong sum = new AtomicLong(0);
        new CounterKotlin().count(100, i -> sum.set(sum.get() + i));
        assertTrue("total is " + sum.get(), sum.get() > 100);
    }
}
