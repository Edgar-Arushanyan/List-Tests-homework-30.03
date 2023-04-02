package Consultation_30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;

    @BeforeEach
    public void init() {
        m = new Main();
    }

    @Test
    public void isWithoutMoreThanRequired_test_empty() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList();

        assertEquals(expected, m.isWithoutMoreThanRequired(actual, 4));

    }

    @Test
    public void isWithoutMoreThanRequired_test_one() {
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = Arrays.asList(1);

        assertEquals(expected, m.isWithoutMoreThanRequired(actual, 4));
    }

    @Test
    public void isWithoutMoreThanRequired_test_noSuchElements() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList(3, 1, 8, 2);

        assertEquals(expected, m.isWithoutMoreThanRequired(actual, 0));
    }

    @Test
    public void isWithoutMoreThanRequired_test() {
        List<Integer> expected = Arrays.asList(1, 5, 3, 2);
        List<Integer> actual = Arrays.asList();

        assertEquals(expected, m.isWithoutMoreThanRequired(actual, 4));


    }
    //----------------------------------- Aufgabe 2 ----------------------------

    @Test
    public void findMinOrMax_test (){
        List<String> actual = Arrays.asList("bb", "a" ,"ddd");
        String expected = "a";

        assertEquals(expected,m.findMinOrMax(actual));

    }

    @Test
    public void findMinOrMax_test_1 () {
        List<String> actual = Arrays.asList("a", "ddd", "bb");
        String expected = "a";

        assertEquals(expected, m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_2 () {
        List<String> actual = Arrays.asList("c", "ddd", "bb", "a");
        String expected = "c";

        assertEquals(expected, m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_3 (){
        List<String> actual = Arrays.asList("ccc", "ddd", "bb","a");
        String expected = "ccc";

        assertEquals(expected,m.findMinOrMax(actual));





    }


}