import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedListTest {

    @Test
    public void testFilter() {
        List<String> inputFilter = new ArrayList<>();
        List<String> filtered = new ArrayList<>();
        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) {
                if (s.length() > 3){
                    return true;
                }
                return false; 
            }
        };
    
        inputFilter.add("hello");
        inputFilter.add("no");
        inputFilter.add("world");
        inputFilter.add("yes");
        
        filtered.add("hello");
        filtered.add("world");

        assertEquals(filtered, ListExamples.filter(inputFilter, sc));
    }







}