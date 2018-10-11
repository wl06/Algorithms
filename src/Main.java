import static sort.SelectionSort.sort;

public class Main {

    public static void main(String[] args) {
        String[] a = new String[]{"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        sort(a);
        for (String i : a) {
            System.out.println(i);
        }
    }
}
