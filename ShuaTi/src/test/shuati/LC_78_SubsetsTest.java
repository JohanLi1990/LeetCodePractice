package test.shuati;

import com.shuati.LC_78_Subsets;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LC_78_SubsetsTest {

    @Test
    void subsets() {
        LC_78_Subsets sbSet = new LC_78_Subsets();
        List<List<Integer>> result = sbSet.subsets(new int[]{1,2, 3});
    }
}