package java8;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutMultipleInheritance {

    interface Human {
        default String sound() {
            return "hello";
        }
    }

    interface Bull {
        default String sound() {
            return "moo";
        }
    }

    class Minotaur implements Human, Bull {
        //both interfaces implement same default method
        //has to be overridden
        @Override
        public String sound() {
            return Bull.super.sound();
        }
    }

    @Test
    public void multipleInheritance() {
        Minotaur minotaur = new Minotaur();
        assertEquals(minotaur.sound(), __);
    }

}
