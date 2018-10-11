// 选择排序
package sort;

public class SelectionSort extends BaseSort {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (less(a[j], a[i])) {
                    exchange(a, i, j);
                }
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
