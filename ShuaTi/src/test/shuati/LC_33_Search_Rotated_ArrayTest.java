package test.shuati;

import com.shuati.LC_33_Search_Rotated_Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_33_Search_Rotated_ArrayTest {

    @Test
    void search() {
        LC_33_Search_Rotated_Array stub = new LC_33_Search_Rotated_Array();
        assertEquals(1, stub.search(new int[]{1,3}, 3));
    }
}