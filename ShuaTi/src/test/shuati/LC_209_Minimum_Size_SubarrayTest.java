package test.shuati;

import com.shuati.LC_209_Minimum_Size_Subarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_209_Minimum_Size_SubarrayTest {

    @Test
    void minSubArrayLen() {
        LC_209_Minimum_Size_Subarray stub = new LC_209_Minimum_Size_Subarray();
        assertEquals(2, stub.minSubArrayLen(7, new int[]{2,3,1,2,4, 3}));
    }
}