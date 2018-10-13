// 归并排序 自底向上
package sort;

public class MergeSort2 extends MergeSort {

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int i, int j) {
        int N = a.length;
        for (int size = 1; size < N; size = size * 2) {
            for (int lo = 0; lo + size < N; lo = lo + size * 2) {
                merge(a, lo, lo + size - 1, Math.min(lo + size * 2 - 1, N-1));
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
