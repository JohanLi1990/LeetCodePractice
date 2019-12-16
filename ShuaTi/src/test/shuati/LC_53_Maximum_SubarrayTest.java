package test.shuati;

import com.shuati.LC_53_Maximum_Subarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_53_Maximum_SubarrayTest {

    @Test
    void maxSubArray() {
        LC_53_Maximum_Subarray stub = new LC_53_Maximum_Subarray();
        int[] test = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, stub.maxSubArray(test));
    }
}