package baileylu.tcd.ie;

/**
 * Quick Sort implementation
 */
public class App {
    public static void swap(Comparable[] input, int a, int b) {
        Comparable buf = input[a];

        input[a] = input[b];
        input[b] = buf;
    }

    public static int partition(Comparable[] input, int lo, int hi) {
        Comparable pivot = input[hi];
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (input[j].compareTo(pivot) < 0) {
                swap(input, i, j);
                i++;
            }
        }
        swap(input, i, hi);
        return i;
    }

    public static void quickSort(Comparable[] input, int lo, int hi) {
        if (hi - lo <= 1)
            return;

        int pivot = partition(input, lo, hi);

        quickSort(input, lo, pivot - 1);
        quickSort(input, pivot + 1, hi);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
