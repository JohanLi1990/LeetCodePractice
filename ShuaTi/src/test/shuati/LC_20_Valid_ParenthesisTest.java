package test.shuati;

import com.shuati.LC_20_Valid_Parenthesis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC_20_Valid_ParenthesisTest {

    @Test
    void isValid() {
        LC_20_Valid_Parenthesis stub = new LC_20_Valid_Parenthesis();
        assertTrue(stub.isValid("(){}()"));
    }
}