package beginner;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutArithmeticOperators {

    @Test
    public void simpleOperations() {
        assertEquals(1, __);
        assertEquals(1 + 1, __);
        assertEquals(2 + 3 * 4, __);
        assertEquals((2 + 3) * 4, __);
        assertEquals(2 * 3 + 4, __);
        assertEquals(2 - 3 + 4, __);
        assertEquals(2 + 4 / 2, __);
        assertEquals((2 + 4) / 2, __);
    }

    @Test
    public void notSoSimpleOperations() {
        assertEquals(1 / 2, __);
        assertEquals(3 / 2, __);
        assertEquals(1 % 2, __);
        assertEquals(3 % 2, __);
    }

    @Test
    public void minusMinusVariableMinusMinus() {
        int i = 1;
        assertEquals(--i, __);
        assertEquals(i, __);
        assertEquals(i--, __);
        assertEquals(i, __);
    }

    @Test
    public void plusPlusVariablePlusPlus() {
        int i = 1;
        assertEquals(++i, __);
        assertEquals(i, __);
        assertEquals(i++, __);
        assertEquals(i, __);
    }

    @Test
    public void timesAndDivInPlace() {
        int i = 1;
        i *= 2;
        assertEquals(i, __);
        i /= 2;
        assertEquals(i, __);
    }

}
