package java7;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutDiamondOperator {

    @Test
    public void diamondOperator() {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        //Generic type of array list inferred - empty <> operator
        List<String> animalsList = new ArrayList<>(Arrays.asList(animals));
        assertEquals(animalsList, __);
    }

    @Test
    public void diamondOperatorInMethodCall() {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        //type of new ArrayList<>() inferred from method parameter
        List<String> animalsList = fill(new ArrayList<>());
        assertEquals(animalsList, __);
    }

    private List<String> fill(List<String> list) {
        String[] animals = {"Dog", "Cat", "Tiger", "Elephant", "Zebra"};
        list.addAll(Arrays.asList(animals));
        return list;
    }

}
