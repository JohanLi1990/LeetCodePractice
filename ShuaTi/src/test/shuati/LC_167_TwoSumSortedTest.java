package test.shuati;

import com.shuati.LC_167_TwoSumSorted;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LC_167_TwoSumSortedTest {

    @Test
    void twoSumSortedTest() {
//        [3,24,50,79,88,150,345]
//        200
        LC_167_TwoSumSorted stub = new LC_167_TwoSumSorted();
        int[] result = new int[]{3, 6};
        assertArrayEquals(result, stub.twoSum(new int[]{3, 24, 50, 79, 88, 150, 345}, 200));
    }
}