// 归并排序 自顶向下
package sort;

public class MergeSort extends BaseSort {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int i, int j) {
        if (i >= j) {
            return;
        }
        int mid = i + (j - i) / 2;
        sort(a, i, mid);
        sort(a, mid + 1, j);
        merge(a, i, mid, j);
    }

    static void merge(Comparable[] a, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j];
                j++;
            } else if (j > hi) {
                a[k] = aux[i];
                i++;
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i];
                i++;
            } else {
                a[k] = aux[j];
                j++;
            }
        }


    }

    public static void main(String[] args) {
        String[] a = new String[]{"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        sort(a);
        for (String i : a) {
            System.out.println(i);
        }
    }
}
