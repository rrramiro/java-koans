package java8;

import com.tasktop.koans.KoanRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static koan.KoanConstants.__;
import static org.junit.Assert.assertEquals;

@RunWith( KoanRunner.class )
public class AboutStreams {

    String str = "";

    List<String> places = Arrays.asList("Belgrade", "Zagreb", "Sarajevo", "Skopje", "Ljubljana", "Podgorica");

    @Test
    public void simpleCount() {
        long count = places.stream().count();
        assertEquals(count, __);
    }

    @Test
    public void filteredCount() {
        long count = places.stream()
                .filter(s -> s.startsWith("S"))
                .count();
        assertEquals(count, __);
    }

    @Test
    public void max() {
        String longest = places.stream()
                .max(Comparator.comparing(cityName -> cityName.length()))
                .get();
        assertEquals(longest, __);
    }

    @Test
    public void min() {
        String shortest = places.stream()
                .min(Comparator.comparing(cityName -> cityName.length()))
                .get();
        assertEquals(shortest, __);
    }

    @Test
    public void reduce() {
        String join = places.stream()
                .reduce("", String::concat);
        assertEquals(join, __);
    }

    @Test
    public void reduceWithoutStarterReturnsOptional() {
        Optional<String> join = places.stream()
                .reduce(String::concat);
        assertEquals(join.get(), __);
    }

    @Test
    public void join() {
        String join = places.stream()
                .reduce((accumulated, cityName) -> accumulated + "\", \"" + cityName)
                .get();
        assertEquals(join, __);
    }

    @Test
    public void reduceWithBinaryOperator() {
        String join = places.stream()
                .reduce("", String::concat);
        assertEquals(join, __);
    }

    @Test
    public void stringJoin() {
        String join = places.stream()
                .collect(Collectors.joining("\", \""));
        assertEquals(join, __);
    }

    @Test
    public void mapReduce() {
        OptionalDouble averageLengthOptional = places.stream()
                .mapToInt(String::length)
                .average();
        double averageLength = Math.round(averageLengthOptional.getAsDouble());
        assertEquals(averageLength, __);
    }

    @Test
    public void parallelMapReduce() {
        int lengthSum = places.parallelStream()
                .mapToInt(String::length)
                .sum();
        assertEquals(lengthSum, __);
    }

    @Test
    public void limitSkip() {
        int lengthSum_Limit_3_Skip_1 = places.stream()
                .mapToInt(String::length)
                .limit(3)
                .skip(1)
                .sum();
        assertEquals(lengthSum_Limit_3_Skip_1, __);
    }

    @Test
    public void lazyEvaluation() {
        Stream stream = places.stream()
                .filter(s -> {
                    str = "hello";
                    return s.startsWith("S");
                });
        assertEquals(str, __);
    }

    @Test
    public void sumRange() {
        int sum = IntStream.range(1, 4).sum();
        assertEquals(sum, __);
    }

    @Test
    public void rangeToList() {
        List<Integer> range = IntStream.range(1, 4)
                .boxed()
                .collect(Collectors.toList());
        assertEquals(range, __);
    }
}
