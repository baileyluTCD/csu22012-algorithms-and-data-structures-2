package baileylu.tcd.ie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import baileylu.tcd.ie.App;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Test swap
     */
    @Test
    public void testSwap() {
        Integer[] arr = new Integer[] { 1, 2, 3 };

        App.swap(arr, 0, 2);

        Integer[] expected = new Integer[] { 3, 2, 1 };

        assertArrayEquals(expected, arr, "1 and 3 should be swapped");
    }

    private void assertIsPartitioned(Comparable[] arr, int pivot) {
        Comparable val = arr[pivot];

        for (int i = 0; i < pivot; i++)
            assert arr[i].compareTo(val) <= 0
                    : "All parts of the first section must be less than `val` " + arr[i] + " !<= " + val;

        for (int i = pivot + 1; i < arr.length; i++)
            assert arr[i].compareTo(val) >= 0
                    : "All parts of the first section must be greater than `val` " + arr[i] + " !>= " + val;
    }

    /**
     * Test partition
     */
    @Test
    public void testPartition() {
        Integer[] a = new Integer[] { 1, 5, 3, 2, 3, 6, 7 };

        int aPivot = App.partition(a, 0, a.length - 1);

        assertIsPartitioned(a, aPivot);

        Integer[] b = new Integer[] { 83, 92, 23, 14, 2, 1 };

        int bPivot = App.partition(b, 0, b.length - 1);

        assertIsPartitioned(b, bPivot);
    }

    /**
     * Test quick sort
     */
    @Test
    public void testQuickSort() {
        Integer[] a = new Integer[] { 7, 89, 2, 4, 6, 1 };
        Integer[] aSorted = new Integer[] { 1, 2, 4, 6, 7, 89 };

        App.quickSort(a, 0, a.length - 1);

        assertArrayEquals(aSorted, a, "Expected a to be sorted");

        Integer[] b = new Integer[] { 10, 99, 43, 22, 3, 3, 4, 80};
        Integer[] bSorted = new Integer[] { 3, 3, 4, 10, 22, 43, 80, 99 };

        App.quickSort(b, 0, b.length - 1);

        assertArrayEquals(bSorted, b, "Expected b to be sorted");
     }
}

    
    

    
