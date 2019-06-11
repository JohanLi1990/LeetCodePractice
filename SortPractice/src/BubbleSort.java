import java.util.Arrays;

public class BubbleSort implements ISortTechnique {

    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < sourceArray.length; i++) {
            boolean needToSwitch = false;
            for (int j = 0; j < sourceArray.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //switch
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needToSwitch = true;
                }
            }
            if(!needToSwitch){
                break;
            }
        }

        return arr;
    }

    @Override
    public String getName() {
        return BubbleSort.class.toString();
    }
}
