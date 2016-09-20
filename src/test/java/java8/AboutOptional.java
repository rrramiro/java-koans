package java8;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Optional;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutOptional {

    boolean optionalIsPresentField = false;

    @Test
    public void isPresent() {
        boolean optionalIsPresent = false;
        Optional<String> value = notPresent();
        if (value.isPresent()) {
            optionalIsPresent = true;
        }
        assertEquals(optionalIsPresent, __);
    }

    @Test
    public void ifPresentLambda() {
        Optional<String> value = notPresent();
        value.ifPresent(x -> optionalIsPresentField = true);
        assertEquals(optionalIsPresentField, __);
    }

    //use optional on api to signal that value is optional
    public Optional<String> notPresent() {
        return Optional.empty();
    }

    private Optional<String> present() {
        return Optional.of("is present");
    }
}
