package intermediate;


import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;


@RunWith( KoanRunner.class )
public class AboutRegularExpressions {

    @Test
    public void basicMatching() {
        Pattern p = Pattern.compile("xyz");
        Matcher m = p.matcher("xyzxxxxyz");
        // index 012345678
        assertEquals(m.find(), __);
        assertEquals(m.start(), __);
        assertEquals(m.find(), __);
        assertEquals(m.start(), __);
        assertEquals(m.find(), __);
    }

    @Test
    public void extendedMatching() {
        Pattern p = Pattern.compile("x.z");
        Matcher m = p.matcher("xyz u x z u xfz");
        // index 012345678901234
        assertEquals(m.find(), __);
        assertEquals(m.start(), __);
        assertEquals(m.find(), __);
        assertEquals(m.start(), __);
        assertEquals(m.find(), __);
        assertEquals(m.start(), __);
    }

    @Test
    public void escapingMetaCharacters() {
        Pattern p = Pattern.compile("end\\.");
        Matcher m = p.matcher("begin. end.");
        // index 01234567890
        assertEquals(m.find(), __);
        assertEquals(m.start(), __);
    }

    @Test
    public void splittingStrings() {
        String csvDataLine = "1,name,description";
        String[] data = csvDataLine.split(","); // you can use any regex here
        assertEquals(data[0], __);
        assertEquals(data[1], __);
        assertEquals(data[2], __);
    }
}
