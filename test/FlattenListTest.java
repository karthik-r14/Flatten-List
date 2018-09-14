import org.junit.Before;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class FlattenListTest {
    private FlattenList flattenList;
    private ArrayList<Character> expectedList;

    @Before
    public void setUp() throws Exception {
        flattenList = new FlattenList("[[1], 2, [[3, 4], 5], [[[]]], [[[6]]], 7, 8, []]");

        expectedList = new ArrayList<>();
        expectedList.add('1');
        expectedList.add('2');
        expectedList.add('3');
        expectedList.add('4');
        expectedList.add('5');
        expectedList.add('6');
        expectedList.add('7');
        expectedList.add('8');
    }

    @org.junit.Test
    public void shouldFlattenInputStringWhenFlattenStringMethodIsInvoked() throws Exception {
        flattenList.flattenInputString();
        assertEquals(expectedList, flattenList.getOutputList());
    }
}