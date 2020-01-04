package test.shuati;

import com.shuati.LC_287_Find_Duplicate_Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_287_Find_Duplicate_NumberTest {

    @Test
    void findDuplicate() {
        LC_287_Find_Duplicate_Number stub = new LC_287_Find_Duplicate_Number();
        assertEquals(9,  stub.findDuplicate(new int[]{2,5,9,6,9,3,8,9,7,1}));

    }
}