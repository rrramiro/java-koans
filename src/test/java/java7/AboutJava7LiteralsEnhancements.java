package java7;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutJava7LiteralsEnhancements {

    @Test
    public void binaryLiterals() {
        //binary literals are marked with 0b prefix
        short binaryLiteral = 0b1111;
        assertEquals(binaryLiteral, __);
    }

    @Test
    public void binaryLiteralsWithUnderscores() {
        //literals can use underscores for improved readability
        short binaryLiteral = 0b1111_1111;
        assertEquals(binaryLiteral, __);
    }

    @Test
    public void numericLiteralsWithUnderscores() {
        long literal = 111_111_111L;
        //notice capital "B" - a valid binary literal prefix
        short multiplier = 0B1_000;
        assertEquals(literal * multiplier, __);
    }

    @Test
    public void negativeBinaryLiteral() {
        int negativeBinaryLiteral = 0b1111_1111_1111_1111_1111_1111_1111_1100 / 4;
        assertEquals(negativeBinaryLiteral, __);
    }

    @Test
    public void binaryLiteralsWithBitwiseOperator() {
        int binaryLiteral = ~0b1111_1111;
        assertEquals(binaryLiteral, __);
    }

}
