import java.util.Arrays;

public class SelectionSort implements ISortTechnique{

    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);


        return arr;
    }

    @Override
    public String getName() {
        return SelectionSort.class.toString();
    }
}
