package test.shuati;

import com.shuati.Median_Two_Sorted_Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Median_Two_Sorted_ArraysTest {

    @Test
    void findMedianSortedArrays() {
        Median_Two_Sorted_Arrays thetest = new Median_Two_Sorted_Arrays();
        int[] num1 = new int[]{1, 3};
        int[] num2 = new int[]{2, 4};
        assertEquals(2.5, thetest.findMedianSortedArrays(num1, num2));
    }
}