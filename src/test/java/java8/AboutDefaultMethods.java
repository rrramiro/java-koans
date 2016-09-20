package java8;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutDefaultMethods {

    @Test
    public void interfaceDefaultMethod() {
        StringUtil stringUtil = new StringUtil() {
            @Override
            public String reverse(String s) {
                return new StringBuilder(s).reverse().toString();
            }
        };
        String capitalizedReversed = stringUtil.capitalize(
                stringUtil.reverse("gnirut"));
        assertEquals(capitalizedReversed, __);
    }

    @Test
    public void interfaceStaticMethod() {
        assertEquals(StringUtil.enclose("me"), __);
    }

    interface StringUtil {

        //static method in interface
        static String enclose(String in) {
            return "[" + in + "]";
        }

        String reverse(String s);

        //interface can contain non-abstract method implementations marked by "default" keyword
        default String capitalize(String s) {
            return s.toUpperCase();
        }

        default String capitalizeFirst(String s) {
            return s.substring(0, 1).toUpperCase() + s.substring(1);
        }
    }

}
