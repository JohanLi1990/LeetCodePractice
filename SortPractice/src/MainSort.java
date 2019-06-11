import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {
        System.out.println("Sort Example:.....\n");
        int[] input = new int[]{1, 3, 4, 5, 2, 10, 8, -1};
        BubbleSort bs = new BubbleSort();
        System.out.println(bs.getName() + ": " + Arrays.toString(bs.sort(input)));
    }
}
