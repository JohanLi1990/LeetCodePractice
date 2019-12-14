package test.shuati;

import com.shuati.LC_5_LongestPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_5_LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        LC_5_LongestPalindrome stub = new LC_5_LongestPalindrome();
        assertEquals("bab", stub.longestPalindrome("babad"));
    }
}