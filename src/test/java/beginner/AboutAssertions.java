package beginner;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static koan.KoanConstants.__;
import static org.junit.Assert.*;

@RunWith( KoanRunner.class )
public class AboutAssertions {

    @Test
    public void assertBooleanTrue() {
        // there are two possibilities, true or false, what would it be here?
        assertTrue((Boolean) __);
    }

    @Test
    public void assertBooleanFalse() {
        assertFalse((Boolean)__);
    }

    @Test
    public void assertNullObject() {
        // reference to the object can be null, a magic keyword, null, which means
        // that there is nothing there
        assertNull(__);
    }

    @Test
    public void assertNullObjectReference() {
        Object someObject = __;
        assertNull(someObject);
    }

    @Test
    public void assertNotNullObject() {
        // but what when there should not be a null value?
        assertNotNull(null);
    }

    @Test
    public void assertEqualsUsingExpression() {
        assertTrue("Hello World!".equals(__));
    }

    @Test
    public void assertEqualsWithAFewExpressions() {
        assertEquals("Hello World!", __);
        assertEquals(1, __);
        assertEquals(2 + 2, __);
        assertEquals(2 * 3, __);
        assertEquals(3 - 8, __);
        assertEquals(10 / 2, __);
    }

    @Test
    public void assertEqualsWithDescriptiveMessage() {
        // Generally, when using an assertXXX methods, expectation is on the
        // left and it is best practice to use a String for the first arg
        // indication what has failed
        assertEquals("The answer to 'life the universe and everything' should be 42", 42, __);
    }

    @Test
    public void assertSameInstance() {
        // Just because something is equal doesn't mean that it is the same.
        // It's only the same if the reference is the same.
        Object same = new Integer(1);
        Object sameReference = __;
        assertSame(same, sameReference);
    }

    @Test
    public void assertNotSameInstance() {
        Integer same = new Integer(1);
        Integer sameReference = same;
        assertNotSame(same, sameReference);
    }
}
