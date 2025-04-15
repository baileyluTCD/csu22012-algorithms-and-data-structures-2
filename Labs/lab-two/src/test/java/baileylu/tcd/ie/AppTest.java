package baileylu.tcd.ie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Ensure sorting a simple array works
     */
    @Test
    public void testBasicSort() {
        Integer[] arr = new Integer[] { 4, 2, 3, 9, 1 };
        App.sort(arr);

        Integer[] expected = new Integer[] { 1, 2, 3, 4, 9 };
        assertArrayEquals(arr, expected);
    }
}
