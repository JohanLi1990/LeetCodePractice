import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {
        System.out.println("Sort Example:.....\n");
        int[] input = new int[]{1, 3, 4, 2, 10, 8};
        BubbleSort bs = new BubbleSort();
        int[] sortedArray = bs.sort(input);
        System.out.println(Arrays.toString(sortedArray));
    }
}
