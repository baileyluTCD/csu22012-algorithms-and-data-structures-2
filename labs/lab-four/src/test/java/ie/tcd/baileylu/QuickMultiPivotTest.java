package ie.tcd.baileylu;

import org.junit.jupiter.api.Test;

/**
 * Unit test for quick multi pivot
 */
public class QuickMultiPivotTest {

    /**
     * Try sorting an empty array
     */
    @Test
    public void testEmptyArray() {
        Integer arr[] = new Integer[0];

        QuickMultiPivot sorter = new QuickMultiPivot();
        sorter.sort(arr);
    }

    /**
     * Try sorting an array with one element
     */
    @Test
    public void testOneElementArray() {
        Integer arr[] = new Integer[] { 1 };

        QuickMultiPivot sorter = new QuickMultiPivot();
        sorter.sort(arr);
    }

    /**
     * Try sorting an array with 3 elements
     */
    @Test
    public void testSmallArray() {
        Integer arr[] = new Integer[] { 1, 3, 2 };

        QuickMultiPivot sorter = new QuickMultiPivot();
        sorter.sort(arr);
    }

    /**
     * Try sorting an array with a good few elements
     */
    @Test
    public void testMediumArray() {
        Integer arr[] = new Integer[] { 1, 3, 2, 2, 6, 7, 8, 10, 2 };

        QuickMultiPivot sorter = new QuickMultiPivot();
        sorter.sort(arr);
    }

    /**
     * Try sorting an array with a different few elements
     */
    @Test
    public void testMediumArrayAlternative() {
        Integer arr[] = new Integer[] { 13, 4, 12, 33, 414, 53, 22, 3, 1 };

        QuickMultiPivot sorter = new QuickMultiPivot();
        sorter.sort(arr);
    }

}
