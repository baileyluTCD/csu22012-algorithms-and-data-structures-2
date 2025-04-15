package baileylu.tcd.ie;

/*
 * Lab 2: Merge Sort
 */
public class App {
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // copy to aux[]
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];

        // merge back to a[]
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo)
            return;

        int mid = lo + (hi - lo) / 2;

        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);

        merge(a, aux, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private static boolean less(Comparable a, Comparable b) {
        if (a.compareTo(b) < 0)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 4, 2, 3, 9, 1 };

        System.out.println("Sorting array...");

        sort(arr);

        System.out.println("Sorted Array:");
        for (Integer i : arr)
            System.out.println(i);
    }
}
