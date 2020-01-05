package test.shuati;

import com.shuati.LC_31_Next_Permutation;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LC_31_Next_PermutationTest {

    @Test
    void nextPermutation() {
        LC_31_Next_Permutation stub = new LC_31_Next_Permutation();
        int[] nums = new int[]{1, 5, 1};
        stub.nextPermutation(nums);
        assertArrayEquals(new int[]{5, 1, 1}, nums);
    }
}