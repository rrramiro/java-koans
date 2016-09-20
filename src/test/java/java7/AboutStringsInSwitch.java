package java7;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutStringsInSwitch {

    @Test
    public void stringsInSwitchStatement() {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        String dangerous = null;
        String notDangerous = null;
        for (String animal : animals) {
            switch (animal) {
                case "Tiger":
                    dangerous = animal;
                case "Dog":
                case "Cat":
                case "Elephant":
                case "Zebra":
                    notDangerous = animal;
            }
        }
        assertEquals(notDangerous, __);
        assertEquals(dangerous, __);
    }

}
