package test.shuati;

import com.shuati.LC_516_LongestPalindrome;
import com.shuati.LC_5_LongestPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_516_LongestPalindromeTest {

    @Test
    void longestPalindromeSubseq() {
        LC_516_LongestPalindrome stub = new LC_516_LongestPalindrome();
        assertEquals(5, stub.longestPalindromeSubseq("axbdba"));
    }
}