package sort;

class BaseSort {
    static void exchange(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
