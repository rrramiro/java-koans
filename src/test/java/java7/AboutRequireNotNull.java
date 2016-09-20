package java7;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Objects;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutRequireNotNull {

    @Test
    public void failArgumentValidationWithRequireNotNull() {
        // This koan demonstrates the use of Objects.requireNotNull
        // in place of traditional argument validation using exceptions
        String s = "";
        try {
            s += validateUsingRequireNotNull(null);
        } catch (NullPointerException ex) {
            s = "caught a NullPointerException";
        }
        assertEquals(s, __);
    }

    @Test
    public void passArgumentValidationWithRequireNotNull() {
        // This koan demonstrates the use of Objects.requireNotNull
        // in place of traditional argument validation using exceptions
        String s = "";
        try {
            s += validateUsingRequireNotNull("valid");
        } catch (NullPointerException ex) {
            s = "caught a NullPointerException";
        }
        assertEquals(s, __);
    }

    private int validateUsingRequireNotNull(String str) {
        // If you're only concerned with null values requireNotNull
        // is concise and the point of the NullPointerException it
        // throws is clear, though you can optionally provide a
        // description as well
        return Objects.requireNonNull(str).length();
    }

}
