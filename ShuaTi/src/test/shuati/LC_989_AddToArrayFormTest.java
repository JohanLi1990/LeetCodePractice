package test.shuati;

import com.shuati.LC_989_AddToArrayForm;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LC_989_AddToArrayFormTest {

    @Test
    void addToArrayForm() {
        LC_989_AddToArrayForm stub = new LC_989_AddToArrayForm();
        List<Integer> theList= new ArrayList<>();
        theList.add(1);
        theList.add(0);
        theList.add(0);
        theList.add(0);
        theList.add(0);
        assertEquals(theList, stub.addToArrayForm(new int[]{9, 9, 9, 9}, 1));
    }
}