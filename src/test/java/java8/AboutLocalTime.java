package java8;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutLocalTime {

    @Test
    public void localTime() {
        LocalTime t1 = LocalTime.of(7, 30);
        assertEquals(t1, LocalTime.parse((CharSequence) __));
    }

    @Test
    public void localTimeMinus() {
        LocalTime t1 = LocalTime.parse("10:30");
        LocalTime t2 = t1.minus(2, ChronoUnit.HOURS);
        assertEquals(t2, LocalTime.parse((CharSequence)__));
    }

}
