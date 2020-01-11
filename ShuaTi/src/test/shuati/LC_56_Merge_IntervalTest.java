package test.shuati;

import com.shuati.LC_56_Merge_Interval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_56_Merge_IntervalTest {

    @Test
    void merge() {
        LC_56_Merge_Interval stub = new LC_56_Merge_Interval();
        int[][] theArray = {{1,3},{2,6},{8,10},{15,18}};
        int[][] res = stub.merge(theArray);
    }
}