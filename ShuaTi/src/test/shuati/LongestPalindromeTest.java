package test.shuati;

import com.shuati.LongestPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {
    private LongestPalindrome lp  = new LongestPalindrome();
    @Test
    void testlongestPalindrome() {
        assertEquals("bab", lp.longestPalindrome("babad"));
    }

    @Test
    void testlongestPalindrome1() {
        assertEquals("bb", lp.longestPalindrome("abb"));
    }
}