package test.shuati;

import com.shuati.LC_17_LetterCombinationPhone;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LC_17_LetterCombinationPhoneTest {

    @Test
    void letterCombinations() {
        LC_17_LetterCombinationPhone stub = new LC_17_LetterCombinationPhone();
        Object[] theStrings = stub.letterCombinations("12").toArray();
        System.out.println(Arrays.toString(theStrings));
    }
}