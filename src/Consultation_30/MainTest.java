package Consultation_30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;

    @BeforeEach  // всегда инициализируем @BeforeEach перед тестами
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
        List<Integer> actual = Arrays.asList(1, 5, 3, 2);
        List<Integer> expected = Arrays.asList(1,3,2);

        assertEquals(expected, m.isWithoutMoreThanRequired(actual, 4));


    }
    //----------------------------------- Aufgabe 2 ----------------------------

    @Test
    public void findMinOrMax_test () throws EmptyListException {
        List<String> actual = Arrays.asList("bb", "a" ,"ddd");
        String expected = "a";

        assertEquals(expected,m.findMinOrMax(actual));

    }

    @Test
    public void findMinOrMax_test_1 () throws EmptyListException {
        List<String> actual = Arrays.asList("a", "ddd", "bb");
        String expected = "a";

        assertEquals(expected, m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_2 () throws EmptyListException {
        List<String> actual = Arrays.asList("c", "ddd", "bb", "a");
        String expected = "c";

        assertEquals(expected, m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_3 () throws EmptyListException {
        List<String> actual = Arrays.asList("ccc", "ddd", "bb", "a");
        String expected = "ccc";

        assertEquals(expected, m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_Elt () throws EmptyListException {
        // List<String> actual = Arrays.asList("a");
        //  String expected = "a";

        //  assertEquals(expected,m.findMinOrMax(actual)); // первый вариант

        assertEquals("a", m.findMinOrMax(Arrays.asList("a")));//второй вариант только одной строкой

    }

    @Test
    public void findMinOrMax_test_schortFirst  ()  throws EmptyListException{
        List<String> actual = Arrays.asList("bb", "a", "ff", "ddd");
        assertEquals("a", m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_longFirst () throws EmptyListException{
        List<String> actual = Arrays.asList("bb", "aaa", "ff", "d");
        assertEquals("aaa", m.findMinOrMax(actual));
    }

    @Test
    public void findMinOrMax_test_emptyList_throwsException ()  {
        List<String> actual = Arrays.asList();

        assertThrows(EmptyListException.class,() ->m.findMinOrMax(Arrays.asList()));
        // особенный случай с assertThrows !!!



    }


}